package ru.au2019.java;

public class LArrayListItem {
    private int i;
    static private int counteer;

    public LArrayListItem() {
        counteer++;
        this.i = counteer;
    }

    public String toString() {
        return "i = " + this.i;
    }
}
