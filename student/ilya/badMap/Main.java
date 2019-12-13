package badMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<newString, Integer> map = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            map.put(new newString(Integer.toString(i)), i);
        }
//        System.out.println();

        HashMap<newString, Integer> map2 = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            map2.put(new newString(Integer.toString(i)), i);
        }

        long startTime01 = System.nanoTime();
        Integer m0 = map.get(5000);
        long finTime01 = System.nanoTime();
        long dif01 = (finTime01 - startTime01);
        System.out.println(dif01);

        long startTime02 = System.nanoTime();
        Integer m1 = map2.get(5000);
        long finTime02 = System.nanoTime();
        long dif02 = (finTime02 - startTime02);
        System.out.println(dif02);
    }

}
