package ru.au2019.java;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Analyzer {
    public static void printClass(Object o) {
        Class myclass = o.getClass();
        System.out.println("Class name = " + myclass);
        System.out.println("Class fields = " + Arrays.toString(myclass.getDeclaredFields()));
        System.out.println("Class methods = " + Arrays.toString(myclass.getDeclaredMethods()));
    }

    public static void goon(String clName, String mName) throws Exception {
        Class myClass = null;
        Object cl1 = null;
        Class service = Class.forName("ru.au2019.java." + clName);
        cl1 = service.newInstance();
        Method classMethod = service.getDeclaredMethod(mName);

        classMethod.invoke(cl1);
    }

    public static void main(String[] args) throws Exception {
        //printClass(new MyClass());
        MyClass mo = new MyClass();
        System.out.println(mo.getClass().getName());
        goon ("MyClass", "kl");
    }
}
