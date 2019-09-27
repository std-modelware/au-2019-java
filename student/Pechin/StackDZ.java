package com.academicuni.dz;

import java.util.Arrays;

public class StackDZ {
    private int cap;
    private int size;
    private int[] arr;
    public static void main(String[] args) {
        StackDZ s = new StackDZ(2);
        s.push(1);
        s.push(20);
        s.push(3);
        System.out.println("Size = " + s.getSize());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
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
}
