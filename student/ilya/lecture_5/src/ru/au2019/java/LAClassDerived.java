package ru.au2019.java;

public class LAClassDerived extends LAClassBase implements LInterface1, LInterface2 {

    public void method1() {
        System.out.println("method1");
    };

    public void method2() {
        System.out.println("method2");
    };

    public int getI() {
        return i;
    }
}
