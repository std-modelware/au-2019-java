package ru.au2019.java;

import java.util.Objects;

public class LObject /*extends Object*/ {

    public void method() {
        System.out.println("LObject::method()");
    }

    public static void main(String[] args) {
        System.out.println("LObject");

        // -------------------
        Object o = new LObject();
        // o.method();

        LObject o1 = new LObject();
        LObject o2 = (LObject) o;

        o1.method();
        o2.method();

        // ----------------------
        Object a1 = new LObject[10];
        ((LObject[]) a1)[0] = new LObject();

        LObject a1_1[] = new LObject[10];
        Object a1_2 = a1_1;
        a1_1[0] = new LObject();


        Object a2 = new int[10];
        int a2_1[] = new int[10];

        // ----------------
        LObject lo1 = new LObject(); // lo1 == lo2
        LObject lo2 = lo1;
        LObject lo3 = new LObject();

        System.out.println("lo1 " + (lo1.equals(lo2) ? "==" : "!=") + " lo2");
        System.out.println("lo1 " + (lo1.equals(lo3) ? "==" : "!=") + " lo3");
        System.out.println("lo2 " + (lo2.equals(lo3) ? "==" : "!=") + " lo3");

        System.out.println("lo1 " + (Objects.equals(lo1, lo2) ? "==" : "!=") + " lo2");
        System.out.println("lo1 " + (Objects.equals(lo1, lo3) ? "==" : "!=") + " lo3");
        System.out.println("lo2 " + (Objects.equals(lo2, lo3) ? "==" : "!=") + " lo3");


        // Правила при написании equals
        // 1. рефлексивность
        // x.equals(x) == true, if x != null
        // 2. симметричность
        // x.equals(y) == true верно только тогда, когда y.equals(x) == true
        // 3. транзитивность
        // если x.equals(y) == true & y.equals(z) == true, то x.equals(z) == true
        // 4. согласованность
        // если x & y не меняются, то x.equals(y) тоже не меняется
        // 5. x.equals(null) == false, если x != null

        // -----------------
        System.out.println("hashCode = " + lo1.hashCode());
        System.out.println("hashCode = " + lo2.hashCode());
        System.out.println("hashCode = " + lo3.hashCode());

        // ------------------
        System.out.println("toString = " + lo1.toString());
        System.out.println("toString = " + lo2.toString());
        System.out.println("toString = " + lo3.toString());

        System.out.println("toString = " + lo1);
        System.out.println("toString = " + lo2);
        System.out.println("toString = " + lo3);

        // ----------------
        Class clo1 = lo1.getClass();
        System.out.println("lo1.getClass() " + clo1);
        System.out.println("a1_2.getClass() " + a1_2.getClass());
    }

    public boolean equals(Object o) {
        System.out.println("equals");
        if (!super.equals(o)) return false;
        // TODO:
        return true;
//        if (this == o) return true;
//        if (o == null) return false;
//        return true;
    }

    public String toString() {
        return "ok";
    }
}
