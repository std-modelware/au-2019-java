package ru.au2019.java;

public class LArrayListItem {
    private int i;
    static private int counter = 0;

    public LArrayListItem() {
        this.i = ++counter;
    }

    public String toString() {
        return "-> i = " + this.i;
    }
}
