package ru.au2019.java;

import javax.print.attribute.HashPrintJobAttributeSet;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Algo");

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            arrayList.add(r.nextInt());
            linkedList.add(r.nextInt());
        }

        System.out.println("arrayList: " + arrayList);
        System.out.println("arrayList.Max: " + Main.max(arrayList));

        System.out.println("linkedList: " + linkedList);
        System.out.println("linkedList.Max: " + Main.max(linkedList));

        List<Integer> list = new ArrayList<>();
//        Queue<Integer> queue = new PriorityQueue<>();
//        Set<Integer> set = new HashSet<>();

        ArrayList<Integer> arrayList2 = (ArrayList<Integer>) arrayList.clone();
        System.out.println("arrayList2: " + arrayList2);
//
//        arrayList2.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer t1, Integer t2) {
//                if (t1 > t2) return 1;
//                if (t1 < t2) return -1;
//                return 0;
//            }
//        });

        arrayList.sort(Comparator.comparingInt(integer -> integer.intValue()));
        System.out.println("sorted arrayList: " + arrayList);

        Collections.sort(arrayList2, Comparator.comparingInt(integer -> (Integer) integer).reversed());
        System.out.println("sorted arrayList2: " + arrayList2);

        // двоичный поиск
        ArrayList<Integer> arrayList_1 = new ArrayList<>();
        ArrayList<Integer> arrayList_2 = new ArrayList<>();

        r = new Random();
        for (int i = 0; i < 10; i++) {
            int rnd = r.nextInt();
            arrayList_1.add(rnd);
            arrayList_2.add(rnd);
        }

        Integer toSearch = arrayList_1.get(7);
        System.out.println("toSearch = " + toSearch);

        int index_1 = Collections.binarySearch(arrayList_1, toSearch);
        if (index_1 >= 0) {
            System.out.println("array1. index = " + index_1);
            System.out.println("array1. item = " + arrayList_1.get(index_1));
        } else {
            System.out.println("array1. item not found");
        }
        Collections.sort(arrayList_2);
        int index_2 = Collections.binarySearch(arrayList_2, toSearch);
        System.out.println("array2. index = " + index_2);
        System.out.println("array2. item = " + arrayList_2.get(index_2));

        //=============================
        ArrayList<String> arrayList_ABC = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G"));
        System.out.println(arrayList_ABC);

        Collections.replaceAll(arrayList_ABC, "A", "Z");

        System.out.println(arrayList_ABC);
        ArrayList<String> arrayList_ABC2 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G"));
        System.out.println(arrayList_ABC2);

//        arrayList_ABC2.removeAll(arrayList_ABC);
//        System.out.println(arrayList_ABC2);


        arrayList_ABC2.retainAll(arrayList_ABC);
        System.out.println(arrayList_ABC2);


        //===================================
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A1");
        map.put(2, "A2");
        map.put(3, "A3");
        map.put(4, "A4");
        map.put(5, "A5");
        map.put(6, "A6");

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

//        map.keySet().removeAll(set);
//        System.out.println(map);

        map.keySet().retainAll(set);
        System.out.println(map);
    }


    public static <T extends Comparable> T max(Collection<T> c) {
        if(c.isEmpty()) throw new NoSuchElementException();

        Iterator<T> it = c.iterator();
        T theMax = it.next();
        while (it.hasNext()) {
            T item = it.next();
            if (theMax.compareTo(item) < 0) {
                theMax = item;
            }
        }

        return theMax;
    }
}
