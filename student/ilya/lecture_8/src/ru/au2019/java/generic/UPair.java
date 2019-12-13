package ru.au2019.java.generic;

public class UPair<T, U> {private T first;
    private U second;

    public UPair() {}
    public UPair(T f, U s) {
        this.first = f;
        this.second = s;
    }
    public void setFirst(T f) {
        this.first = f;
    }

    public void setSecond(U s) {
        this.second = s;
    }

    public T getFirst() {
        return this.first;
    }

    public U getSecond() {
        return this.second;
    }
}
