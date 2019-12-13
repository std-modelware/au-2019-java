package com.academicuni.dz;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class SetDZ {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, DifferentSetTypesException, InstantiationException, IllegalAccessException {
        Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList((new Integer[]{1, 2, 5, 7, 0})));
        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[] {1, 3, 4, 6, 7, 8, 9}));
        Set<Integer> c = new TreeSet<Integer>(Arrays.asList(new Integer[] {5,6,7}));
        System.out.println(union(a, b));
        System.out.println(intersection(a, b));
        System.out.println(difference(a, b));
        System.out.println(difference(b, a));
        // System.out.println(union(a, c));
    }
    public static Set union(Set s1, Set s2) throws DifferentSetTypesException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class s1c = s1.getClass();
        if (s1c != s2.getClass()) {
            throw new DifferentSetTypesException();
        }
        Constructor con = s1c.getConstructor(new Class[]{Collection.class});
        Set s3 = (Set) con.newInstance(s1);
        s3.addAll(s2);
        return s3;
    }
    public static Set intersection(Set s1, Set s2) throws DifferentSetTypesException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class s1c = s1.getClass();
        if (s1c != s2.getClass()) {
            throw new DifferentSetTypesException();
        }
        Constructor con = s1c.getConstructor(new Class[]{Collection.class});
        Set s3 = (Set) con.newInstance(s1);
        s3.retainAll(s2);
        return s3;
    }
    public static Set difference(Set s1, Set s2) throws DifferentSetTypesException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class s1c = s1.getClass();
        if (s1c != s2.getClass()) {
            throw new DifferentSetTypesException();
        }
        Constructor con = s1c.getConstructor(new Class[]{Collection.class});
        Set s3 = (Set) con.newInstance(s1);
        s3.removeAll(s2);
        return s3;
    }
}
