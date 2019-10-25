package ru.au2019.java.generic;

public class Main {
    public static void main(String[] args) {
        System.out.println("generic");

        PairInt p1 = new PairInt();
        PairInt p2 = new PairInt(1, 2);

        Pair<Integer> pi1 = new Pair<Integer>();
        Pair<Integer> pi2 = new Pair<>(1, 2);

        UPair<Integer, Double> pid1 = new UPair<>();
        UPair<Integer, Double> pid2 = new UPair<>(1, 2.13);

        Main.Method("string");
        Main.Method(1);
        Main.Method(new Integer(10));
        Main.Method(1.23);

        RPair<BaseI> rp1;
        RPair<BaseC> rp2;
        RPair<Derived> rp3;
        RPair<Integer> rp4;
    }

    public static<T> void Method(T v) {
        System.out.println(v);
    }
}
