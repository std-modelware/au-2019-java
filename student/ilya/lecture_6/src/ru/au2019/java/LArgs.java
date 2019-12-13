package ru.au2019.java;

public class LArgs {
    public static void main(String[] args) {
        System.out.println("LArgs");
        LArgs.varArgs1(1, 2, 3, 4, 5, 6, 7, 8);
        LArgs.varArgs1(new int[] {0,1,2,3,4,5});

        LArgs.varArgs2(new Integer(1), new Integer(2), new Integer(3));
        LArgs.varArgs2(new Object[]{1,2,3,4,5,6});

    }

    public static void varArgs1(int... args) {
        for (int i = 0; i < args.length; i++ ) {
            System.out.println(args[i] + ", ");
        }
        System.out.println();
    }

    public static void varArgs2(Object... args) {
        for (int i = 0; i < args.length; i++ ) {
            System.out.println(args[i] + ", ");
        }
        System.out.println();
    }
}
