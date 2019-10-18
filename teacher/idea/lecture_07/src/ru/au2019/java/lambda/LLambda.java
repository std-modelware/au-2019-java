package ru.au2019.java.lambda;

import ru.au2019.java.callback.ICanNotify;
import ru.au2019.java.callback.LCallbackMain;
import ru.au2019.java.callback.LRadio;

// Лямбда-выражения- блоки кода, которые можно выполнить через некоторое время, либо несколько раз
public class LLambda {

    public static void main(String[] args) {
        System.out.println("Lambda");

//        (int n) -> {
//            for (int i = 0; i < n; i++) {
//                System.out.print(i + ",");
//            }
//            System.out.println();
//        }

        // Функциональный интерфейс
        LCallbackMain cm = new LCallbackMain();
        cm.addNotifier(new ICanNotify() {
            @Override
            public void doNotification(String msg) {
                System.out.println("anonimous " + msg);
            }
        });

        cm.addNotifier( (String msg) -> System.out.println("lambda 1 " + msg) );
        cm.addNotifier( (String msg) -> System.out.println("lambda 2 " + msg) );
        cm.addNotifier( (String msg) -> System.out.println("lambda 3 " + msg) );
        cm.addNotifier( (String msg) -> System.out.println("lambda 4 " + msg) );
        cm.addNotifier( new LRadio());

        cm.doNotifcation("NEW MESSAGE");


        ICanNotify icn = (String msg) -> System.out.println("lambda 444 " + msg);
        icn.doNotification("my str");

        LLambdaInterface lli = new LLambda()::printN;
        lli.Method(10);


        String finish = "FINISH";
        LLambdaInterface lli2 = (int n) -> {
            for (int i = 0; i < n; i++) {
                System.out.print(i + "-");
            }
            System.out.println(finish);
        };

//        finish = "123";
        lli2.Method(20);
    }

    public void printN (int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(i + ",");
        }
        System.out.println();
    }
}
