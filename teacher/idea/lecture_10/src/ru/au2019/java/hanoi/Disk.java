package ru.au2019.java.hanoi;

public class Disk {
    private int size;

    public Disk(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

    public String toString() {
        return String.valueOf(this.size);
    }
}
