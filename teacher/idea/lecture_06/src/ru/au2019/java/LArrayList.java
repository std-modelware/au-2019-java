package ru.au2019.java;

import java.util.ArrayList;

public class LArrayList {
    public static void main(String[] args) {
        System.out.println("LArrayList");

        // после инициализации массива его размер изменить нельзя!
        int size = 10;
        LArrayListItem[] items = new LArrayListItem[size];

//        ArrayList<LArrayListItem> al = new ArrayList<LArrayListItem>();
        ArrayList<LArrayListItem> al = new ArrayList<>(size);

        al.add(new LArrayListItem());
        al.add(new LArrayListItem());
        al.add(new LArrayListItem());
        al.add(new LArrayListItem());
        al.add(new LArrayListItem());
        al.add(new LArrayListItem());
        al.add(new LArrayListItem());
        al.add(new LArrayListItem());
        al.add(new LArrayListItem());
        al.add(new LArrayListItem());

        // выделить дополнительную память
        al.ensureCapacity(size * 2);

        // сократить память до текущего размера
        al.trimToSize();

        System.out.println("size = " + al.size());
        System.out.printf("size = %d\n", al.size());

        // замена элемента
        al.set(1, new LArrayListItem());

        // добавить элемент перед i-ым
        al.add(1, new LArrayListItem());

        // получение i-го элемента
        System.out.println("1-ый" + al.get(1));

        // удаление i-го элемента
        LArrayListItem r = al.remove(1);
        System.out.println("r = " + r);
    }
}
