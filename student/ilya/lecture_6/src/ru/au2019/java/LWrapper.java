package ru.au2019.java;

import java.util.ArrayList;

public class LWrapper {
    public static void main(String[] args) {
        System.out.println("LWrapper");

        //boxing - упаковка и unboxing - распаковка

        //boxing
        Integer iobj1 = new Integer(1);
        Long lobj1 = new Long(1);
        Float fobj1 = new Float(1);
        Double dobj1 = new Double(1);
        Short sobj1 = new Short((short)1);
        Byte bobj1 = new Byte((byte)1);
        Character cobj1 = new Character('1');
        Boolean blobj1 = new Boolean(true);

        Integer iobj2 = 1;
        Long lobj2 = 1l;
        Float fobj2 = 1.0f;
        Double dobj2 = 1.0;
        Short sobj2 = 1;
        Byte bobj2 = 1;
        Character cobj2 = '1';
        Boolean blobj2 = true;

        //--------------------------------------

        //unboxing
        int i1 = iobj1;
        long l1 = lobj1;
        float f1 = fobj1;

        int i2 = iobj2.intValue();
        long l2 = lobj2.longValue();

        //-------------------
//        ArrayList<int> iArr = new ArrayList<int>();
        ArrayList<Integer> iArr = new ArrayList<Integer>();
        // менее эффективно, чем int[]

        iArr.add(1);
        iArr.add(new Integer(10));

        int item = iArr.get(0);
        item = iArr.get(0).intValue();

        //Значения упаковочных классов Integer, Long, etc менять нельзя

        Integer n = 10; //упаковка
        n++; //распаковка, увеличение и упаковка

        try {
            Integer vr = null;
            System.out.println(vr + 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Integer int1 = 1;
        Double dbl1 = 2.0;
        System.out.println((true) ? int1 : dbl1);

        System.out.println(Integer.parseInt("123")); // int
        System.out.println(Integer.parseInt("123", 16)); // int
        System.out.println(Integer.valueOf("123")); // Integer
        System.out.println(Integer.valueOf("123", 16)); // Integer


    }
}
