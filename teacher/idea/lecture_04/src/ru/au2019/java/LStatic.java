package ru.au2019.java;

public class LStatic {
    public static void main(String[] args) {
        System.out.println("Static");

        LStatic.SMethod();

        LStatic st1 = new LStatic();
        LStatic st2 = new LStatic();

        st1.incrementIndex();
        st2.incrementIndex();

        st1.incrementIndex();
        st2.incrementIndex();

        st1.incrementIndex();
        st2.incrementIndex();

        System.out.println(LStatic.PI);
//        LStatic.PI = 3.13;


        System.out.println("Static");
    }

    public static void SMethod(){
        System.out.println("LStatic::SMethod()");
    }

    private static int index = 1;

    public void incrementIndex() {
        System.out.println("Index = " + (++LStatic.index));
    }

    public final static double PI = 3.14;
}
