package ru.au2019.java;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("New VFS");
        Manager m = new Manager();

        Folder f2 = m.createFolder("dir1", null);
        Folder f3 = m.createFolder("dir3", null);
        System.out.println("roots: " + m.roots);
        m.createFolder("dir1", f3);
        System.out.println("" + f3 + ": " + f3.getElementsList());

        ArrayList<Elements> a1 = m.find("dir1");
        System.out.println(a1);
        m.createFolder("dir2", (Folder) m.find("dir1").get(0));

        System.out.println();
        m.addToFolder("C://Learning", f2);

        System.out.println(f2.getElementsList());


        System.out.println("==========================");
        System.out.println(m.roots);
        m.readScript("C://Learning/first.txt");

        System.out.println(m.roots.getElementsList());
        System.out.println("===========");
        for (Elements f : m.roots.getElementsList()) {
            m.tree(f);
            System.out.println("***");
        }
        m.writeScript(f2, "C://Learning/theScript.txt");
    }
}
