package VFS;

import sun.text.resources.cldr.ti.FormatData_ti_ER;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("New VFS");
        Manager m = new Manager();

        Folder f2 = m.createFolder("dir1", null);
        Folder f3 = m.createFolder("dir3", null);
        System.out.println("roots: " + m.roots);
        m.createFolder("dir1", f3);
        System.out.println(f3 + ": " + f3.getElementsList());

        ArrayList<Elements> a1 = m.find("dir1");
        System.out.println("a1: " + a1);
        m.createFolder("dir2", (Folder) m.find("dir1").get(0));

        File file1 = m.createFile("NewTextFile",f2,23);
        System.out.println(file1.getFullName());

        System.out.println("==============");
        //System.out.println(f2.getElementsList());
        //System.out.println( ((Folder)f2.getElementsList().get(2)).getElementsList());

        m.readScript("D://script.txt");

        System.out.println("=====m2 reads script=====");
        Manager m2 = new Manager();
        m2.readScript("D://script2.txt");

        Elements m2dir1 = m2.find("dir1").get(0);
        if (m2dir1 instanceof Folder){
            System.out.println(((Folder) m2dir1).getElementsList());
            m2.createFolder("dir2indir1",(Folder)m2dir1);
        }

        java.io.File file = m2.export("D://VFSm2");



        //Manager m3 = new Manager();
        //m3.readScript(file.getAbsolutePath());
    }
}
