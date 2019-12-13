package com.academicuni.dz;

import java.util.WeakHashMap;

public class WeakHashMapTest {
    public static void main(String[] args)  {
        WeakHashMap<String, Integer> pop = new WeakHashMap<String, Integer>();
        String a = "Pskov";
        String b = "St. Petersburg";
        pop.put(a, 200000);
        pop.put(b, 5000000);
        pop.put(new String("Moscow"), 12000000);
        System.out.println(pop.get("Moscow"));
        System.out.println(pop.containsKey("Moscow"));
        System.out.println(pop.get("St. Petersburg"));
        System.out.println(pop.get("Pskov"));
        System.out.println(pop.size());

        System.gc();

        System.out.println(pop.get("Moscow"));
        System.out.println(pop.containsKey("Moscow"));
        System.out.println(pop.get("St. Petersburg"));
        System.out.println(pop.get("Pskov"));
        System.out.println(pop.size());

    }
}
