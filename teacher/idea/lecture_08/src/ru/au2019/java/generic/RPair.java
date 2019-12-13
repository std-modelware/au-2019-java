package ru.au2019.java.generic;

public class RPair<T extends BaseC & BaseI> {
    private T first;
    private T second;

    public RPair() {}
    public RPair(T first, T second) {
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
