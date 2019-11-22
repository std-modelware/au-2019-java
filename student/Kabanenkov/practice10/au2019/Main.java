package au2019;

import practice10.SetOps;
import practice10.SetOpsException;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);
        HashSet<Double> hashSet2 = new HashSet<>();
        hashSet2.add(2.7);
        hashSet2.add(3.14);
        hashSet2.add(3.0);
        try {
            System.out.println("1 unite 2: " + SetOps.union(hashSet1, hashSet2));
            System.out.println("2 minus 1: " + SetOps.minus(hashSet2, hashSet1));
            System.out.println("1 minus 2: " + SetOps.minus(hashSet1, hashSet2));
            System.out.println("1 intersect 2: " + SetOps.intersection(hashSet1, hashSet2));
        } catch (SetOpsException e) {
            e.printStackTrace();
        }

        System.out.print('\n');

        HashSet<Integer> hashSet3 = new HashSet<>();
        hashSet3.add(1);
        hashSet3.add(2);
        hashSet3.add(3);
        HashSet<Integer> hashSet4 = new HashSet<>();
        hashSet4.add(2);
        hashSet4.add(3);
        hashSet4.add(4);
        try {
            System.out.println("3 unite 4: " + SetOps.union(hashSet3, hashSet4));
            System.out.println("4 minus 3: " + SetOps.minus(hashSet4, hashSet3));
            System.out.println("3 minus 4: " + SetOps.minus(hashSet3, hashSet4));
            System.out.println("3 intersect 4: " + SetOps.intersection(hashSet3, hashSet4));
        } catch (SetOpsException e) {
            e.printStackTrace();
        }
    }
}


















/*import swap.BigAndUglyWrapper;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String strs[] = { "there", "hello" };



        ArrayList<BigAndUglyWrapper<String>> wrappers = new ArrayList<>(strs.length);

        for(int i = 0; i < strs.length; ++i) {
            wrappers.add(new BigAndUglyWrapper<>(strs[i]));
        }

        wrappers.get(0).swap(wrappers.get(1));

        System.out.println(wrappers.get(0).getObj());
        System.out.println(wrappers.get(1).getObj());


        //Collections.sort(wrappers);

        //for(BigAndUglyWrapper wrapper : wrappers) {
        //    System.out.println(wrapper.getObj());
        //}
    }
}*/

// reflection practice
/*
import practice07.BoringClass;
import practice07.ClassInfoPrinter;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
        try {
            Class cl = Class.forName("practice07.BoringClass");
            Constructor ctor = cl.getConstructors()[0];
            BoringClass bc = (BoringClass)ctor.newInstance();
            BoringClass.class.getMethod("sayHello", String.class).invoke(bc, "world");

        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        ClassInfoPrinter<String> ci = new ClassInfoPrinter<>(String.class);

        ci.printCanonicalName();
        ci.printConstructors(Modifier.constructorModifiers());
        ci.printMethods(Modifier.methodModifiers());
        ci.printFields(Modifier.fieldModifiers());
    }
}*/
