package com.academicuni.dz;

import java.util.*;

public class HashSetPerf {
    public static void main(String[] args) {
        HashSet<Integer> a;
        Random r = new Random();
        ArrayList<Long> l1 = new ArrayList<>();
        ArrayList<Long> l2 = new ArrayList<>();
        ArrayList<Long> l3 = new ArrayList<>();
        int n2 = 10;
        for (int n = 10; n <= 1000000; n += 10000) {
            long s1 = 0;
            long s2 = 0;
            long s3 = 0;
            for (int j = 0; j < n2; j++) {
                a = new HashSet<Integer>(16, (float) 0.75);
                int k1 = 0;
                int k2 = 0;
                int t1 = r.nextInt(n - 1);
                int t2 = r.nextInt(n - 1);
                for (int i = 0; i < n; i++) {
                    int b = r.nextInt();
                    if (i == t1) {
                        k1 = b;
                    }
                    if (i == t2){
                        k2= b;
                    }
                    a.add(b);
                }
                long time1 = System.nanoTime();
                System.out.println(a.contains(k1));
                long time2 = System.nanoTime();
                a.remove(k2);
                long time3 = System.nanoTime();
                a.add(r.nextInt());
                long time4 = System.nanoTime();
                s1 += (time2 - time1);
                s2 += (time3 - time2);
                s3 += (time4 - time3);
            }
            l1.add(s1 / n2);
            l2.add(s2 / n2);
            l3.add(s3 / n2);
        }
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
    }
}
