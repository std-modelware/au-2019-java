package ru.au2019.java;

import java.io.*;
import java.util.ArrayList;

public class Manager {
//    public ArrayList<Folder> roots = new ArrayList<>();
    public Folder roots = new Folder("roots", null);

    public Folder createFolder(String name, Folder parent) {
        Folder folder;
        if (parent == null) {
            folder = new Folder(name, roots);
        }
        else {
            folder = new Folder(name, parent);
        }
        return folder;
    };

    public File createFile(String name, Folder parent, int size) {
        File file = new File (name, parent, size);
        return file;
    }


    public void tree (Elements element) {
        if (!element.isFolder) System.out.println("—" + element.getName());
        else {
            String beginning = "";
            for (int i = 0; i < element.getName().length()-2; i++) beginning += " ";
            beginning += "|";
            this.folderTree((Folder) element, beginning);
        };
    }

    public void folderTree(Folder folder, String beginning) {
        System.out.println(folder);
        for (Elements child : folder.getElementsList()) {
            System.out.print(beginning + "— ");
            if (child.isFolder) {
                String newBeginning = beginning;
                for (int i = 0; i < child.getName().length(); i++) newBeginning += " ";
                newBeginning += "|";
                this.folderTree( (Folder) child, newBeginning);
            }
            else System.out.println(child);
        }
    }

    public ArrayList<Elements> find(String fname) {
        findVisitor fv = new findVisitor(fname);
        for (Elements f : roots.getElementsList()) {
            f.accept(fv);
            fv.res.addAll(find(fname, (Folder) f));
        }
        return fv.res;
    }

    public ArrayList<Elements> find(String fname, Folder root) {
        findVisitor fv = new findVisitor(fname);

        for (Elements e : root.getElementsList()) {
            if (e instanceof Folder) {
                fv.res.addAll(find(fname, (Folder) e));
            }
            e.accept(fv);
        };
        return fv.res;
    }




    public void addToFolder(String filepath, Folder place) {
        java.io.File file = new java.io.File(filepath);
//        this.createFolder(file.getName(), place);
        for (String f : file.list()) {
            java.io.File child = new java.io.File(filepath + "/" + f);

            if (child.isDirectory()) {
                Folder kid = this.createFolder(f, place);
                this.addToFolder(filepath + "/" + f, kid);
            }
            else {
                this.createFile(f, place, 0);
            }
        }
    }

    public void readScript(String filepath) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filepath));
            String line = reader.readLine();
            while (line != null) {
                String[] c = line.split(" ");
                if (c[0].equals("mkdir")) this.makeElement(c[1], "folder");
                else if (c[0].equals("touch")) this.makeElement(c[1], "file");
                line = reader.readLine();
            }
            reader.close();
        } catch (Exception e) {};
    }

    public void makeElement(String longPath, String flag /*flag = folder or file*/ ) {
        String[] path = longPath.split("/");
        Folder place = null;
        boolean found2 = false;
        for (Elements f : this.roots.getElementsList()) {
            if (f.getName().equals(path[0])) {
                place = (Folder) f;
                found2 = true;
                break;
            }
        }
        if (!found2) {
            Folder newRoot = this.createFolder(path[0], null);
            place = newRoot;
        }
        if (path.length == 1) return;

        boolean found = false;
        for (int i = 1; i < path.length-1; i++) {
            for (Elements child : place.getElementsList()) {
                if (child.isFolder && child.getName().equals(path[i])) {
                    place = (Folder) child;
                    found = true;
                    break;
                }
            }
            if (!found) {
                Folder newFolder = this.createFolder(path[i], place);
                place = newFolder;
            }
        }
        for (Elements child : place.getElementsList()) { // if this folder already has am element with such name
            if (child.isFolder && child.getName().equals(path[path.length-1])) return;
        }
        if (flag.equals("folder")) this.createFolder(path[path.length-1], place);
        if (flag.equals("file")) this.createFile(path[path.length-1], place, 0);
    }

    public void writeScript(Folder parent, String path) throws Exception {
        PrintWriter writer = new PrintWriter(path, "UTF-8");
        writeLine(parent, writer);
        writer.close();

    }

    public void writeLine(Elements parent, PrintWriter writer) {
        if (parent.isFolder) {
            writer.println("mkdir " + parent.getName());
            if (((Folder) parent).getElementsList().size() > 0) {
                writer.println("cd " + parent.getName());
                for (Elements child : ((Folder) parent).getElementsList()) {
                    writeLine(child, writer);
                }
                writer.println("cd ..");
            }
        } else writer.println("touch " + parent.getName());
    }

}
