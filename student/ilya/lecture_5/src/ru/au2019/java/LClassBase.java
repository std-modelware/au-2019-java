package ru.au2019.java;

public class LClassBase {
    private int i;

    public void setI(int i) {
        this.i = i;
        System.out.println("LClassBase::setI() i = " + i);
    }

    public int getI() {
        System.out.println("LClassBase::getI() return i = " + i);
        return i;
    }

    public LClassBase() {
        System.out.println("LCLassBase::LCLassBase()");
    }

    public LClassBase(int i) {
        this.i = i;
        System.out.println("LCLassBase::LCLassBase() i = " + i);
    }
}
