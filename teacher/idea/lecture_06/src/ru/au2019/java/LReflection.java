package ru.au2019.java;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class LReflection {
    public static void main(String[] args) {
        System.out.println("LReflection");

        LReflection r = new LReflection();
        Class c = r.getClass();
        System.out.println(c.getName());

        LReflection r1 = null;
        try {
            r1 = r.getClass().newInstance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // ------------------
        Constructor[] ctor = r1.getClass().getConstructors(); // все public методы/данные
        Constructor[] dctor = r1.getClass().getDeclaredConstructors(); // все метода/данные, определенные в классе

        Method[] methods = r1.getClass().getMethods(); // все public методы/данные
        Method[] dmethods = r1.getClass().getDeclaredMethods(); // все метода/данные, определенные в классе

        Field[] fields = r1.getClass().getFields(); // все public методы/данные
        Field[] dfields = r1.getClass().getDeclaredFields(); // все метода/данные, определенные в классе


    }

    public int i;
    private char c;

    public LReflection() {}
    private LReflection(int i) {this.i = i;}
    public void pFunc1() {}
    protected int pFunc2(int i) {return i;}
    private LReflection pFunc3(LReflection i) {return i;}
}
