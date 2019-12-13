package ru.au2019.java;

public class LClass {
    public static void main(String[] args) {
        System.out.println("LClass");

        LClass lc1 = new LClass();
        LClass lc2 = new LClass("string");
        System.out.println(lc1.getMember());
        System.out.println(lc2.getMember());

    }

    public LClass() {       // вызывается ТОЛЬКО операцией new
        System.out.println("LClass::Lclass()");
        this.member = 10;
    }

    public LClass(String text) {
        System.out.printf("LClass::Lclass(%s)\n", text);
        this.member = 20;
    }

    private int member;
    private String text;

    public int getMember() {
        return this.member;
    }


}
