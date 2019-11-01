package ru.au2019.java.collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Collection");

        Collection<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);

        System.out.println("size = " + c.size());

        Iterator<Integer> i = c.iterator();
        while (i.hasNext()) {
            Integer item = i.next();
            i.remove();
            System.out.println(item);
        }


        System.out.println("size = " + c.size());
        i = c.iterator();
        while (i.hasNext()) {
            Integer item = i.next();
            System.out.println(item);
        }


        // Типы коллекци
        // Индексируемая динамически расширяющаяся и сокращающаяся последовательность
        List<Integer> al = new ArrayList<>();

        List<Integer> ll1 = new LinkedList<Integer>();
        Deque<Integer> ll2 = new LinkedList<Integer>();

    }
}
