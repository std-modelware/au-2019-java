package ru.au2019.java.generic;

public class Main {
    public static void main(String[] args) {

        PairInt p1 = new PairInt();
        PairInt p2 = new PairInt();

        Pair<Integer> pi1 = new Pair<Integer>();
        Pair<Integer> pi2 = new Pair<Integer>(1, 2);

        UPair<Integer, Double> pid1 = new UPair<>();
        UPair<Integer, Double> pid2 = new UPair<>(1, 2.13);


        Main.Method("string");
        Main.Method(1);
        Main.Method(new Integer(1));
        Main.Method(1.23);

//        RPair<BaseI> rp1;
//        RPair<BaseC> rp2;
//        RPair<Derived> rp3;
//        RPair<Integer> rp4;




        System.out.println();
        Pair_Compare<Integer> pc1 = new Pair_Compare<>(8, 6);
        System.out.println(pc1.getMax());
        System.out.println(pc1.getMean());
        Pair_Compare<Integer> pc2 = new Pair_Compare<>(10, 10);
        System.out.println(pc2.getMax());
        Pair_Compare<Integer> pc3 = new Pair_Compare<>(12, 14);
        System.out.println(pc3.getMax());

        System.out.println();
        System.out.println("===================");

        Triple<Integer> t1 = new Triple<>(1, 4, 6);
        System.out.println(t1.getMin());
        Triple<Integer> t2 = new Triple<>(30, 20, 8);
        System.out.println(t2.getMin());
        Triple<Integer> t3 = new Triple<>(20, 10, 15);
        System.out.println(t3.getMin());

        System.out.println();
        Triple<String> t4 = new Triple<>("string", "str", "string2");
        System.out.println(t4.getMin());
        Triple<Float> t5 = new Triple<>( 3.0f, (float) 2.0, (float) 5.0);
        System.out.println(t5.getMin());

        System.out.println();
        try {
            System.out.println(t1.getMean());
            System.out.println(t5.getMean());
            System.out.println(t4.getMean());
        } catch (CanNotTakeMeanException e) {
            System.out.println("We can not take average of this type");
        }

    }

    public static<T> void Method(T v) {
        System.out.println(v);
    }
}
