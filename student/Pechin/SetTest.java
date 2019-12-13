package com.academicuni.dz;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList((new Integer[]{1, 2, 5, 7, 0})));
        for (Integer i : a){
            System.out.println(i);
        }
        Iterator<Integer> iterator = a.iterator();
        while(iterator.hasNext()) {
            Integer i = iterator.next();
            System.out.println(i);
        }
    }
}
