package ru.au2019.java;

import java.util.Objects;

public class LObject {
    public void method() {
        System.out.println("LObject::method()");
    }

    public static void main(String[] args) {
        System.out.println("LObject-2");

        // -------------------
        Object o = new LObject();

        // -------------------
        Object a1 = new LObject[10];
        LObject[] a1_1 = new LObject[10];

//        a1[0] = new LObject();
        a1_1[0] = new LObject();
        Object a2 = new int[10];
        LObject[] a2_1 = new LObject[10];

        // -------------------
        LObject lo1 = new LObject();
        LObject lo2 = lo1;
        LObject lo3 = new LObject();

        System.out.println("lo1" + (lo1.equals(lo2) ? "==" : "!=") + "lo2");
        System.out.println("lo1" + (lo1.equals(lo3) ? "==" : "!=") + "lo3");
        System.out.println("lo2" + (lo1.equals(lo3) ? "==" : "!=") + "lo3");

        System.out.println("lo1" + (Objects.equals(lo1, lo2) ? "==" : "!=") + "lo2");
        System.out.println("lo1" + (Objects.equals(lo1, lo3) ? "==" : "!=") + "lo3");
        System.out.println("lo1" + (Objects.equals(lo2, lo3) ? "==" : "!=") + "lo3");

        System.out.println();
        System.out.println();

        // ---------------------------
        System.out.println("hashcode = " + lo1.hashCode());
        // ---------------------------
        System.out.println("toString = " + lo1);
        // ---------------------------
        System.out.println("toString = " + lo1.toString());


        Class clo1 = lo1.getClass();
        System.out.println("lo1.getClass()" + clo1);
        System.out.println("a1_2.getClass() " + a2_1);
    }

    public String toString() {
        return "ok";
    }
    public boolean equals(Object o) {
        System.out.println("EQUALS");
        if (!super.equals(o)) return false;
        // TODO:
        return true;
//        if (this == o) return true;
//        if (o == null) return false;
//        return true;

        //правила при написании собственного equals
        // 1. рефлексивнось: if x!= null then x.equals(x) == true
        // 2. симметричность
        // 3. транзитивность
        // 4. согласованность: если х и у не меняются, то результат сравнения тоже не меняется
        // 5. x.equals(null) == false, if x != null

    }
}
