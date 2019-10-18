package ru.au2019.java.callback;

import java.util.ArrayList;

public class LCallbackMain {

    ArrayList<ICanNotify> notifiers = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("LCallbackMain");

        LCallbackMain cm = new LCallbackMain();
        cm.addNotifier(new LPhone());
        cm.addNotifier(new LRadio());
        cm.addNotifier(new LRadio());
        cm.addNotifier(new LTv());

        cm.addNotifier(new ICanNotify() {
            @Override
            public void doNotification(String msg) {
                System.out.println("ANONIMUS CLASS " + msg);
            }
        });
        cm.doNotifcation("Test Message");
    }

    public void addNotifier(ICanNotify i) {
        this.notifiers.add(i);
    }

    public void doNotifcation(String msg) {
        for (ICanNotify n : this.notifiers) {
            n.doNotification(msg);
        }
    }
}
