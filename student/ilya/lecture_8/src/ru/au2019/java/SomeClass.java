package ru.au2019.java;

public class SomeClass {

    private String str;

    public SomeClass() {}

    public SomeClass(String str) {
        this.str = str;
    }

    public void Method() throws SomeClassStringisEmptyException {
        if (this.str == null) {
            throw new SomeClassStringisEmptyException();
        }
        System.out.println("String is equal to " + this.str);
    }

}
