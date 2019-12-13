package ru.au2019.java;

public class LClassDerived extends LClassBase implements LInterface1, LInterface2 {

    public void method1() {
        System.out.println("method1");
    };

    public void method2() {
        System.out.println("method2");
    };

    public void setI(int i) {
        super.setI(++i);
        //this.i = i;
        System.out.println("LClassDerived::setI() i = " + i);
    }

    public LClassDerived() {
        System.out.println("LClassDerived::LClassDerived()");
    }

    public LClassDerived(int i) {
        super(i);
        System.out.println("LClassDerived::LClassDerived() i = " + i);
    }
}
