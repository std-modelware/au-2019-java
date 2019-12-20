package VFS;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    public ArrayList<Folder> roots = new ArrayList<>();

    public Folder createFolder(String name, Folder parent) {
        Folder folder = new Folder(name, parent);
        if (parent == null)
            roots.add(folder);
        return folder;
    };

    public File createFile(String name, Folder parent, long size) {
        File file = new File (name, parent, size);
        parent.addFile(file);
        return file;
    }

    public ArrayList<Elements> find(String fname) {
        findVisitor fv = new findVisitor(fname);
        for (Folder f : roots) {
            fv.res.addAll(this.find(fname, f));
            f.accept(fv);
        }
        return fv.res;
    }

    public ArrayList<Elements> find(String fname, Folder root) {
        findVisitor fv = new findVisitor(fname);

        for (Elements e : root.getElementsList()) {
            if (e instanceof Folder) {
                fv.res.addAll(this.find(fname, (Folder) e));
            }
            e.accept(fv);
        }
        return fv.res;
    }


    private void aAd23(String path, Folder f){
        java.io.File file = new java.io.File(path);

        for (String s: file.list()){

            java.io.File innerFile = new java.io.File(path+"/"+s);

            if (innerFile.isDirectory()){
                Folder innerFolder = this.createFolder(s,f);
                this.aAd23(path+"\\"+s, innerFolder);
            }
            else {
                this.createFile(s,f,innerFile.length());
            }
        }
    }

    public boolean addFileTree(String path, Folder imRoot) {
        if (imRoot instanceof Folder) {
            try{
                String p = new java.io.File(path).getName();
                this.aAd23(path, this.createFolder(p,imRoot));
                return true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return false;
            }
        }
        return false;
    }

    private String ElementsToString(Elements e, String parent){
        String s = "";
        if (parent==""){
            s = "mkdir "+ e.getName()+"\n";
        }
        if (e instanceof Folder) {
            if (s == "") {
                s = "mkdir " + parent + "/" + e.getName() + "\n";
                for (Elements el : ((Folder)e).getElementsList()) {
                    s += ElementsToString(el, parent + "/" + e.getName());
                }
            } else {
                for (Elements el : ((Folder)e).getElementsList()) {
                    s += ElementsToString(el, e.getName());
                }
            }
        } else {
            s = "touch " + parent + "/" + e.getName() + "\n";
        }
        return s;
    }

    private Elements fold(String fol,Folder root){
        if (root==null){
            for (Elements e:this.roots){
                if (e.getName().equals(fol))
                    return e;
            }
            return null;
        }

        for (Elements e:root.getElementsList()){
            if (e.getName().equals(fol))
                return e;
        }
        return null;
    }

    public boolean readScript(String path){
        java.io.File file = new java.io.File(path);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();

            int iline = -1;
            while (line!=null){
                System.out.println(">>> "+line);
                iline++;
                Folder placeNow = null;
                String[] ar = line.split(" ");

                if (ar[0].equals("mkdir")){
                    String[] folders = ar[1].split("/");
                    if (folders.length==1) {
                        if (!this.find(folders[0]).isEmpty()) {
                            System.out.println(iline + ": Folder already exists");
                        } else {
                            this.createFolder(folders[0], null);
                        }
                    } else {
                        for(int ifol=0; ifol<folders.length-1;ifol++){
                            String fol = folders[ifol];
                            if (placeNow==null){
                                placeNow = (Folder)this.fold(fol,null);
                                if (placeNow==null) placeNow = this.createFolder(fol,null);
                            } else {
                                if (this.fold(fol,placeNow)==null){
                                    this.createFolder(fol,placeNow);
                                }
                                placeNow = (Folder)this.fold(fol,placeNow);
                            }
                        }
                        if (this.fold(folders[folders.length-1],placeNow)!=null){
                            System.out.println("Line "+iline+": Folder already exists");
                        } else{
                            this.createFolder(folders[folders.length-1],placeNow);
                        }
                    }
                }

                if (ar[0].equals("touch")){
                    String[] folders = ar[1].split("/");
                    for (int ifol=0;ifol< folders.length-1;ifol++){
                        String fol = folders[ifol];
                        if (placeNow==null){
                            placeNow = (Folder)this.fold(fol,null);
                            if (placeNow==null) placeNow = this.createFolder(fol,null);
                        } else {
                            if (this.fold(fol,placeNow)==null){
                                this.createFolder(fol,placeNow);
                            }
                            placeNow = (Folder)this.fold(fol,placeNow);
                        }
                    }
                    if (this.fold(folders[folders.length-1], placeNow) != null){
                        System.out.println("Line "+iline+": File with same name exists");
                    } else {
                        this.createFile(folders[folders.length-1],placeNow,0);
                    }
                }

                if (ar[0].equals("import")){
                    for(String fol: ar[2].split("/")){
                        if (placeNow==null){
                            if (this.fold(fol,null)==null)
                                this.createFolder(fol,null);
                            placeNow = (Folder) this.fold(fol,null);
                        } else {
                            if (this.fold(fol,placeNow)==null)
                                this.createFolder(fol,placeNow);
                            placeNow = (Folder) this.fold(fol,placeNow);
                        }
                    }
                    this.addFileTree(ar[1], placeNow);
                }

                if (ar[0].equals("export")){
                    PrintWriter writer = new PrintWriter(new java.io.File(ar[1]));
                    for (Folder f:this.roots){
                        writer.print(ElementsToString(f,""));
                    }
                    writer.flush();
                    writer.close();
                }

                if (!(ar[0].equals("export") | ar[0].equals("import") | ar[0].equals("touch") | ar[0].equals("mkdir")))
                    System.out.println("Line "+iline+": Unknown command");

                line = reader.readLine();
            }
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public java.io.File export(String path) {
        java.io.File file = new java.io.File(path);
        try {
            file.createNewFile();
            PrintWriter writer = new PrintWriter(file);
            for (Folder f: this.roots) {
                writer.print(ElementsToString(f,""));
            }
            writer.flush();
            writer.close();
        } catch (Exception e) {
            System.out.println("AAAAAAAAAAAAAAAAA");
            System.out.println(e.getMessage());
        }

    return file;
    }

}
