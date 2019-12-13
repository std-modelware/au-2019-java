package ru.au2019.java.generic;

public class PairInt {
    private int first;
    private int second;

    public PairInt() {}
    public PairInt(int f, int s) {
        this.first = f;
        this.second = s;
    }
    public void setFirst(int f) {
        this.first = f;
    }

    public void setSecond(int s) {
        this.second = s;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
}
