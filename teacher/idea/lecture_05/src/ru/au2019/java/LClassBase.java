package ru.au2019.java;

/*final*/ public class LClassBase {
    private int i;

    public LClassBase() {
        System.out.println("LClassBase::LClassBase()");
    }

    public LClassBase(int i) {
        this.i = i;
        System.out.println("LClassBase::LClassBase() i = " + i);
    }

    /*final*/ public void setI(int i) {
        this.i = i;
        System.out.println("LClassBase::setI() i = " + i);
    }

    public int getI() {
        System.out.println("LClassBase::getI() return i = " + this.i);
        return this.i;
    }
}
