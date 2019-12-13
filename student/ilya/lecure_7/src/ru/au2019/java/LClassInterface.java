package ru.au2019.java;

public class LClassInterface implements LInterface_1, LInterface_2{
    public static void main(String[] args) {
        System.out.println("LClassInterface");

        LInterface_1 li1 = new LClassInterface();
        li1.Method1();
        System.out.println(li1.CONST_1);

        LInterface_2 li2 = new LClassInterface();

        LClassInterface lci = new LClassInterface();
        System.out.println((lci instanceof LInterface_1) ? "lci instanceof LInterface_1" : "NOT LInterface_1");
        System.out.println((lci instanceof LInterface_2) ? "lci instanceof LInterface_1" : "NOT LInterface_2");
        System.out.println((lci instanceof LInterface_3) ? "lci instanceof LInterface_1" : "NOT LInterface_3");

        LInterface_1.StaticMethod();
    }

    public void Method1() {
        System.out.println("LClassInterface::Method1()");
    }
}
