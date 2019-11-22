package TreeMap;
import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Map <- I: SortedMap <- I: NavigableMap <- TreeMap
        // Map = { (key, value) | key << map.keySet, value << map.values }
        // упорядоченный набор данных
        // По-умолчанию TreeMap сортируется по ключам с использованием принципа "natural ordering".
        // Но это поведение может быть настроено под конкретную задачу при помощи объекта Comparator,
        // который указывается в качестве параметра при создании объекта TreeMap

        TreeMap <Integer, String> map1 = new TreeMap();
        map1.put (1, "first");
        map1.put (3, "third");
        map1.put (2, "second");
        map1.put (5, "fifth");
        map1.put (4, "fourth");

        for (int i = 1; i < 6; i++) {
            System.out.println(i + ": " + map1.get(i));
        }

        System.out.println("===========================");
        //SortedMap
        System.out.println(map1.firstKey());
        System.out.println(map1.lastKey());
        Map map2 = map1.headMap(3);
        for (int i = 1; i < 5; i++) {
            System.out.println(i + " " + map2.get(i));
        }
        //аналогично tailMap, subMap

        System.out.println("===========================");
        //NavigableMap
        TreeMap <Integer, String> map3 = new TreeMap();
        map3.put(7, "Seven");
        map3.put(5, "Five");
        map3.put(11, "Eleven");
        map3.put(9, "Nine");
        map3.put(3, "Three");
        Map.Entry<Integer, String> a = map3.lowerEntry(6); // наибольший из тех, которые меньше 6
        System.out.println(a);
        Integer k = map3.floorKey(4); // наибольший из тех, которые меньше/равны
        System.out.println(map3.get(k));
        for (Integer e : map3.keySet()) {
            System.out.print(map3.get(e) + " ");
        }
        System.out.println();
        NavigableMap <Integer, String> map4 = map3.descendingMap(); //в обратном порядке
        for (Integer e : map4.keySet()) {
            System.out.print(map4.get(e) + " ");
        }
        System.out.println();

        System.out.println("===========================");
        //comparator
        Comp compar = new Comp();
        TreeMap<Integer, String> map5 = new TreeMap<Integer, String>(compar);
        map5.put(3, "three");
        map5.put(2, "two");
        map5.put(1, "one");
        map5.put(6, "six");
        map5.put(9, "nine");
        for (Integer i : map5.keySet()) {
            System.out.println(map5.get(i));
        }

        System.out.println("-----");
        TreeMap<Integer, String> map6 = new TreeMap<Integer, String>();
        map6.put(3, "three");
        map6.put(2, "two");
        map6.put(1, "one");
        map6.put(6, "six");
        map6.put(9, "nine");
        for (Integer i : map6.keySet()) {
            System.out.println(map6.get(i));
        }

        for (String s : map6.values()) {
            System.out.println(s);
        }


        //===================================================================================
        System.out.println("time counting");
        TreeMap<Integer, String> map10 = new TreeMap<>();
        for (int i = 1; i<=100; i++) {
            map10.put(i, Integer.toString(i));
        };
        long startTime11 = System.nanoTime();
        Integer m1 = map10.floorKey(50);
        long finTime11 = System.nanoTime();
        long dif11 = (finTime11 - startTime11);

        long startTime12 = System.nanoTime();
        String s1 = map10.get(50);
        long finTime12 = System.nanoTime();
        long dif12 = (finTime12 - startTime12);

        long startTime13 = System.nanoTime();
        Map.Entry<Integer, String> S1 = map10.lowerEntry(46);
        long finTime13 = System.nanoTime();
        long dif13 = (finTime13 - startTime13);


        System.out.println(" " + dif11 + ' ' + dif12 + ' ' + dif13);


        for (int i = 101; i<=1000; i++) {
            map10.put(i, Integer.toString(i));
        };
        long startTime21 = System.nanoTime();
        Integer m2 = map10.floorKey(500);
        long finTime21 = System.nanoTime();
        long dif21 = (finTime21 - startTime21);

        long startTime22 = System.nanoTime();
        String s2 = map10.get(500);
        long finTime22 = System.nanoTime();
        long dif22 = (finTime22 - startTime22);

        long startTime23 = System.nanoTime();
        Map.Entry<Integer, String> S2 = map10.lowerEntry(468);
        long finTime23 = System.nanoTime();
        long dif23 = (finTime23 - startTime23);

        System.out.println(" " + dif21 + ' ' + dif22 + ' ' + dif23);


        for (int i = 1001; i<=10000; i++) {
            map10.put(i, Integer.toString(i));
        };
        long startTime31 = System.nanoTime();
        Integer m3 = map10.floorKey(5000);
        long finTime31 = System.nanoTime();
        long dif31 = (finTime31 - startTime31);

        long startTime32 = System.nanoTime();
        String s3 = map10.get(5000);
        long finTime32 = System.nanoTime();
        long dif32 = (finTime32 - startTime32);

        long startTime33 = System.nanoTime();
        Map.Entry<Integer, String> S3 = map10.lowerEntry(4680);
        long finTime33 = System.nanoTime();
        long dif33 = (finTime33 - startTime33);

        System.out.println(" " + dif31 + ' ' + dif32 + ' ' + dif33);


    }
}
