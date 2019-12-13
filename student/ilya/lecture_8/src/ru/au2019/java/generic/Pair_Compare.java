package ru.au2019.java.generic;

public class Pair_Compare<T> {
    private T first;
    private T second;

    public Pair_Compare() {
    }

    public Pair_Compare(T f, T s) {
        this.first = f;
        this.second = s;
    }

    public void setFirst(T f) {
        this.first = f;
    }

    public void setSecond(T s) {
        this.second = s;
    }

    public T getFirst() {
        return this.first;
    }

    public T getSecond() {
        return this.second;
    }

    public T getMax() {
        Class c = this.first.getClass();
        if (this.first instanceof java.lang.Integer) {
            Integer i1 = (Integer) this.first;
            Integer i2 = (Integer) this.second;
            if (i1 > i2) {
                return this.first;
            } else {
                return this.second;
            }
        }

        if (this.first instanceof java.lang.Double) {
            Double i1 = (Double) this.first;
            Double i2 = (Double) this.second;
            if (i1 > i2) {
                return this.first;
            } else {
                return this.second;
            }
        }

        if (this.first instanceof java.lang.String) {
            String i1 = (String) this.first;
            String i2 = (String) this.second;
            if (i1.length() > i2.length()) {
                return this.first;
            } else {
                return this.second;
            }
        }

        System.out.println("These objects are uncomparable");
        return this.second;
    }

    public float getMean() {
        if (this.first instanceof java.lang.Integer) {
            float i1 = (Integer) this.first;
            float i2 = (Integer) this.second;
            return (i1+i2)/2;
        }

        if (this.first instanceof java.lang.Float) {
            float i1 = (Float) this.first;
            float i2 = (Float) this.second;
            return (i1+i2)/2;
        }

        System.out.println("It's a mistake");
        return 0;
    }
}
