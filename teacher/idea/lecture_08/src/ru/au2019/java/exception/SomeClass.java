package ru.au2019.java.exception;

import java.lang.reflect.Method;

public class SomeClass {

    private String str;

    public SomeClass() {}

    public SomeClass(String str) {
        this.str = str;
    }

    public void Method() throws SomeClassStringIsEmptyException {
        if (this.str == null) {
            throw new SomeClassStringIsEmptyException();
        }
        System.out.println("String is equal to " + this.str);
    }
}
