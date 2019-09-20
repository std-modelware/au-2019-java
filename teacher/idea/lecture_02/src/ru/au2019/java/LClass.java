package ru.au2019.java;

import java.lang.System.*;

import static java.lang.System.out;

public class LClass {
    public static void main(String[] args) {

        out.println("LClass");

        LClass lc1 = new LClass();
        LClass lc2 = new LClass("string111");
        // Конструктор
        // 1. Имя совпадает с именем класса
        // 2. Может быть несколько
        // 3. Может иметь или не иметь параметры
        // 4. НЕ возвращает значени
        // 5. ВСЕГА вызывается ТОЛЬКО с операцией new => объекты ВСЕГДА создаются в динамической памяти

        out.println(lc1.getMember());
        out.println(lc2.getMember());
    }

    public LClass() {
        out.println("LClass::LClass()");
        member = 10; // неявно
    }

    public LClass(String text) {
        out.printf("LClass::LClass(%s)\n", text);
        this.member = 20; // явно
    }

    private int member;
    private String text;

    public int getMember() {
        return this.member;
    }
}
