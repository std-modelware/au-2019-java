package ru.au2019.java.generic;

public class Pair<T> {
    private T first;
    private T second;

    public Pair() {}
    public Pair(T f, T s) {
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

}
