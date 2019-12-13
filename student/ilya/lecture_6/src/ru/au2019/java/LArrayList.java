package ru.au2019.java;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LArrayList {
    public static void main(String[] args) {
        System.out.println("LArrayList");
        int size = 10;
        LArrayListItem[] items = new LArrayListItem[size];

        ArrayList<LArrayListItem> a1 = new ArrayList<>(size);

        a1.add(new LArrayListItem());
        a1.add(new LArrayListItem());
        a1.add(new LArrayListItem());
        a1.add(new LArrayListItem());
        a1.add(new LArrayListItem());
        a1.add(new LArrayListItem());
        a1.add(new LArrayListItem());

        a1.ensureCapacity(size * 2); // new memory

        a1.trimToSize(); //memory to now condition

        System.out.println("size = " + a1.size());

        //замена элемента
        a1.set(1, new LArrayListItem());

        //добавить перед i
        a1.add(1, new LArrayListItem());

        //получение i
        System.out.println(a1.get(1));

        //удаление i
        LArrayListItem r = a1.remove (1);
        System.out.println("r " +  r);

        System.out.println("-------------------------");

        System.out.println(a1);
    }


}
