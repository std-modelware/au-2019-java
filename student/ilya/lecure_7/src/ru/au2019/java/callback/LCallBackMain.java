package ru.au2019.java.callback;

import java.util.ArrayList;

public class LCallBackMain {
    public static void main(String[] args) {
        System.out.println("LCallbackMain");

        LCallBackMain cm = new LCallBackMain();
        cm.addNotifier(new LPhone());
        cm.addNotifier(new LRadio());
        cm.addNotifier(new LRadio());
        cm.addNotifier(new LTv());

        cm.addNotifier(new ICanNotify() {
            @Override
            public void doNotification(String msg) {
                System.out.println("ANONIMUS CLASS" + msg);
            }
        });
        cm.doNotification("...");
    }

    ArrayList<ICanNotify> notifiers = new ArrayList<>();

    public void addNotifier(ICanNotify i){
        this.notifiers.add(i);
    }

    public void doNotification(String msg) {
        for (ICanNotify n : this.notifiers) {
            n.doNotification(msg);
        }
    }
}
