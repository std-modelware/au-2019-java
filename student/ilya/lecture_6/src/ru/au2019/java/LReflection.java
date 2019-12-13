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

        //-----------------
        Constructor[] ctor = r1.getClass().getConstructors();
        Constructor[] dctor = r1.getClass().getDeclaredConstructors();

        Method[] methods = r1.getClass().getMethods();
        Method[] dmethods = r1.getClass().getDeclaredMethods();

        Field[] fields = r1.getClass().getFields();
        Field[] dfields = r1.getClass().getDeclaredFields();


        System.out.println("----------------------------------");



    }
    public int i;
    private char c;
    public LReflection() {}
    protected LReflection(int i) {this.i = i;}
    public void pFunc() {}
    protected int pFunc2(int i) { return i;}
    private LReflection pFunc3(LReflection i) { return i;}

    public void printClass(Class cl) {

    }
}
