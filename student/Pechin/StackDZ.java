package com.academicuni.dz;

import java.util.Arrays;

public class StackDZ {
    private int cap;
    private int size;
    private int[] arr;
    public static void main(String[] args) {
        StackDZ s1 = new StackDZ(2);
        StackDZ s2 = new StackDZ();
        s1.push(1);
        s1.push(20);
        s1.push(3);
        s2.push(123);
        s2.push(345);
        s2.push(567);
        s2.push(678);
        swap(s1, s2);
        System.out.println("Size of s1 = " + s1.getSize());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println("Size of s2 = " + s2.getSize());
        System.out.println(s2.pop());
        System.out.println(s2.pop());
        System.out.println(s2.pop());
    }

    public int pop(){
        return arr[--size];
    }

    public int getSize(){
        return size;
    }

    public void push(int el){
        if (size + 1 > cap){
            AddCap();
        }
        arr[size++] = el;
    }

    public StackDZ() {
        size = 0;
        cap = 1;
        arr = new int[1];
    }

    public StackDZ(int capacity) {
        size = 0;
        cap = capacity;
        arr = new int[capacity];
    }

    private void AddCap(){
        int[] newArr = new int[cap * 2];
        cap = cap * 2;
        System.arraycopy(arr, 0, newArr, 0, size);
        arr = newArr;
    }

    public static void swap(StackDZ p1, StackDZ p2){
        int[] tmpArr = p1.arr;
        int tmpSize = p1.size;
        int tmpCap = p1.cap;
        p1.arr = p2.arr;
        p1.cap = p2.cap;
        p1.size = p2.size;
        p2.arr = tmpArr;
        p2.cap = tmpCap;
        p2.size = tmpSize;
    }
}
