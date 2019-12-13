package au2019;

import practice10.FilthyInteger;
import practice10.SetOps;
import practice10.SetOpsException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);
        HashSet<Double> hashSet2 = new HashSet<>();
        hashSet2.add(2.7);
        hashSet2.add(3.14);
        hashSet2.add(3.0);
        try {
            System.out.println("1 unite 2: " + SetOps.union(hashSet1, hashSet2));
            System.out.println("2 minus 1: " + SetOps.minus(hashSet2, hashSet1));
            System.out.println("1 minus 2: " + SetOps.minus(hashSet1, hashSet2));
            System.out.println("1 intersect 2: " + SetOps.intersection(hashSet1, hashSet2));
        } catch (SetOpsException e) {
            e.printStackTrace();
        }

        System.out.print('\n');

        HashSet<Integer> hashSet3 = new HashSet<>();
        hashSet3.add(1);
        hashSet3.add(2);
        hashSet3.add(3);
        HashSet<Integer> hashSet4 = new HashSet<>();
        hashSet4.add(2);
        hashSet4.add(3);
        hashSet4.add(4);
        try {
            System.out.println("3 unite 4: " + SetOps.union(hashSet3, hashSet4));
            System.out.println("4 minus 3: " + SetOps.minus(hashSet4, hashSet3));
            System.out.println("3 minus 4: " + SetOps.minus(hashSet3, hashSet4));
            System.out.println("3 intersect 4: " + SetOps.intersection(hashSet3, hashSet4));
        } catch (SetOpsException e) {
            e.printStackTrace();
        }

        HashMap<Integer, Integer> integers = new HashMap<>();
        HashMap<FilthyInteger, Integer> filthyIntegers = new HashMap<>();

        int sz = 100000;
        for(int i = 0; i < sz; ++i) {
            Random r = new Random();
            int rand = r.nextInt(100);
            integers.put(i, rand);
            filthyIntegers.put(new FilthyInteger(i), rand);
        }

        Integer f1 = sz - 100;
        integers.put(f1, 42);
        FilthyInteger f2 = new FilthyInteger(sz - 100);
        filthyIntegers.put(f2, 42);

        long start = System.nanoTime();
        System.out.println(filthyIntegers.containsKey(f2));
        long stop = System.nanoTime();
        System.out.println("FilthyInteger: " + (stop - start));

        start = System.nanoTime();
        System.out.println(integers.containsKey(f1));
        stop = System.nanoTime();
        System.out.println("Integer: " + (stop - start));

    }
}


