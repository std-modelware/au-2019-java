package ru.au2019.java;

public interface LInterface_1 {
    // все методы public
    void Method1();
    int CONST_1 = 555;

    default void Method2() {};

    static void StaticMethod() {
        System.out.println("StaticMethod");
    }
}
