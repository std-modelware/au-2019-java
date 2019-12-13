package ru.au2019.java;

public class LStatic {
    public static void main(String[] args) {
        System.out.println("LStatic");

        LStatic.Smethod();

        LStatic st1 = new LStatic();
        LStatic st2 = new LStatic();

        st1.incrementIndex();
        st2.incrementIndex();

        st1.incrementIndex();
        st2.incrementIndex();

        st1.incrementIndex();
        st2.incrementIndex();

        //LStatic.PI = 3.13;

        System.out.println(index);

    }

    public static void Smethod() {
        System.out.println("LStatic::SMethod()");
    }

    private static int index = 1;

    public void incrementIndex() {
        System.out.println("Index = " + (LStatic.index++));

    }

    public final double PI = 3.14;

}
