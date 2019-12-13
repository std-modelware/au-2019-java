package com.academicuni.dz;

import java.util.HashMap;
import java.util.Random;

public class MapDZ {
    public static void main(String[] args ) {
        HashMap<MyInt, Integer> m = new HashMap<MyInt, Integer>();
        HashMap<Integer, Integer> n = new HashMap<Integer, Integer>();
        Random r = new Random();
        int k = 0;
        for (int i = 0; i < 10000; i++) {
            int a = r.nextInt();
            int b = r.nextInt();
            k = a;
            m.put(new MyInt(a), b);
            n.put(a, b);
        }
        long time1 = System.nanoTime();
        System.out.println(m.get(new MyInt(k)));
        long time2 = System.nanoTime();
        System.out.println(n.get(k));
        long time3 = System.nanoTime();
        System.out.println(time3 - time2);
        System.out.println(time2- time1);
    }



}
