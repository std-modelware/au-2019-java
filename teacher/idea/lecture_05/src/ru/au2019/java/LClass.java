package ru.au2019.java;

import static java.lang.System.*;

public class LClass {
    public static void main(String[] args) {
        out.println("class demo");

        // ---------------------
        LClassBase c = new LClassBase();
        c.setI(20);
        System.out.println("return " + c.getI());

        // -----------------------
        LClassDerived cd = new LClassDerived();
        cd.setI(20);
        System.out.println("return " + cd.getI());

        // -----------------------
        LClassBase c1 = new LClassBase(99);
        System.out.println("return " + c1.getI());

        // -----------------------
        LClassDerived cd1 = new LClassDerived(99);
        System.out.println("return " + cd1.getI());

        // -----------------------
        LClassBase cb = new LClassDerived();

        System.out.println("------------------");
        Process(c, 1); // base
        Process(cd, 2); // derived
        Process(c1, 3); // base
        Process(cd1, 4); // derived
        Process(cb, 5); // (base)derived

        // -------------------
        LClassBase test1 = new LClassBase();
        LClassDerived test2 = new LClassDerived();

        if (test1 instanceof LClassBase) {
            System.out.println("test1 instanceof LClassBase");
        } else {
            System.out.println("test1 NOT instanceof LClassBase");
        }
        if (test1 instanceof LClassDerived) {
            System.out.println("test1 instanceof LClassDerived");
        } else {
            System.out.println("test1 NOT instanceof LClassDerived");
        }


        if (test2 instanceof LClassBase) {
            System.out.println("test2 instanceof LClassBase");
        } else {
            System.out.println("test2 NOT instanceof LClassBase");
        }
        if (test2 instanceof LClassDerived) {
            System.out.println("test2 instanceof LClassDerived");
        } else {
            System.out.println("test2 NOT instanceof LClassDerived");
        }


    }

    public static void Process(LClassBase cb, int i) {
        cb.setI(i);
        System.out.println("Process i = " + cb.getI());
    }
}


