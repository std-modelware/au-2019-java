package ru.au2019.java;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class LArgs {
    public static void main(String[] args) {
        LArgs.varArgs1(1,2,3,4,5,6,7);
        LArgs.varArgs1(new int[] {0,1,2,3});

        LArgs.varArgs2(new Integer(1), new Integer(2), new Integer(3));
        LArgs.varArgs2(new Object[]{1,2,3,4,5,6,7,8,9,0});
    }

    public static void varArgs1(int... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + ", ");
        }
        System.out.println();
    }

    public static void varArgs2(Object... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + ", ");
        }
        System.out.println();
    }

}
