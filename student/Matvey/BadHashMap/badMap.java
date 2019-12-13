package to29.november;

import java.util.HashMap;

public class badMap {
    public static void main(String[] args){

        HashMap<myInt,myStr> map = new HashMap<>();
        myInt mi = new myInt(0);

        long s1 = System.nanoTime();
        for (Integer i=0; i<200;i++) {
             map.put(new myInt(i), new myStr(i.toString() + i.toString() + i.toString()));
            }

        long f1 = System.nanoTime();
        System.out.println("my hash:        "+ (f1-s1));

        HashMap<Integer,myStr> map2 = new HashMap<>();
        long s2 = System.nanoTime();

        for (Integer i=0; i<200;i++) {
            map2.put(i, new myStr(i.toString() + i.toString() + i.toString()));
        }

        long f2 = System.nanoTime();
        System.out.println("default hash:   "+ (f2-s2));

    }
}
