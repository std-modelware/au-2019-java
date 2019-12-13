package ru.au2019.java.lambda;

import ru.au2019.java.callback.ICanNotify;
import ru.au2019.java.callback.LCallBackMain;
import ru.au2019.java.callback.LRadio;

public class LLambda {
    public static void main(String[] args) {
        System.out.println("LLambda");

        // Это и есть lamba-выражение:
//        (int N) -> {
//            for (int i = 0; i < N; i++) {
//                System.out.println(i + ",");
//            }
//            System.out.println();
//        }
//

        LCallBackMain cm = new LCallBackMain();
        cm.addNotifier(new ICanNotify() {
            @Override
            public void doNotification(String msg) {
                System.out.println("anonimus " + msg);
            }
        });

        cm.addNotifier( (String msg) -> System.out.println("lambda 1" + msg) );
        cm.addNotifier( (String msg) -> System.out.println("lambda 2" + msg) );
        cm.addNotifier( (String msg) -> System.out.println("lambda 3" + msg) );
        cm.addNotifier( (String msg) -> System.out.println("lambda 4" + msg) );
        cm.addNotifier( new LRadio() );


        cm.doNotification("NEW MESSAGE");

        ICanNotify icn = (String msg) -> System.out.println("lambda 44" + msg);
        icn.doNotification("my str");

        LLambdaInerface lli1 = new LLambda()::printN;
        lli1.Method(10);

        String finish = "FINISH";
        LLambdaInerface lli2 = (int n) -> {
            for (int i = 0; i < n; i++) {
                System.out.print(i + ", ");
            }
            System.out.println(finish);
        };
        lli2.Method(10);
    }


    public void printN (int N) {
        for (int i = 0; i < N; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
