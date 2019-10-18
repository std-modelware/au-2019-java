package ru.au2019.java.callback;

public class LPhone implements ICanNotify {
    @Override
    public void doNotification(String msg) {
        System.out.println("LPhone " + msg);
    }
}
