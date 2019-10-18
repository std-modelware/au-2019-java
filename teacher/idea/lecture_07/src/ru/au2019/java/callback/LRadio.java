package ru.au2019.java.callback;

public class LRadio implements ICanNotify {
    @Override
    public void doNotification(String msg) {
        System.out.println("LRadio " + msg);
    }
}
