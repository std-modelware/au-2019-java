package ru.au2019.java.wildcardtype;

public class Employee {
    private static int COUNTER = 0;
    protected int number;

    public Employee() {
        this.number = ++Employee.COUNTER;
    }

    public String toString() {
        return "Employee (" + this.number + ")";
    }
}
