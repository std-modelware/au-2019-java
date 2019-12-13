package ru.au2019.java.callback;

public class LTv implements ICanNotify{
    @Override
    public void doNotification(String msg) {
        System.out.println("LTv" + msg);
    }
}
