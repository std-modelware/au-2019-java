package ru.au2019.java.generic;

public class Pair<T> {
    private T first;
    private T second;

    public Pair() {}
    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public T getFirst() { return this.first; }
    public T getSecond() {return second;}
}
