package lhm;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public class LinkedHashMapDemo {
    public static void demo() {
        LinkedHashMap<String, String> hashMap = new LinkedHashMap<>();

        // O(1)
        System.out.println(hashMap.size());
        System.out.println("***");

        // O(1)
        // заметим, что get несуществующего элемента не выбросит исключение
        System.out.println(hashMap.containsKey("the thing that's not in there"));
        System.out.println(hashMap.get("the thing that's not in there"));
        System.out.println(hashMap.put("the thing that's not in there", "the thing"));
        System.out.println(hashMap.containsKey("the thing that's not in there"));
        System.out.println("***");

        // O(n)
        System.out.println(hashMap.containsValue("the thing"));
        System.out.println("***");

        // O(1)
        System.out.println(hashMap.replace("the thing that's not in there", "got replaced"));
        System.out.println(hashMap.get("the thing that's not in there"));
        System.out.println("***");

        // put на существующий ключ работает как replace,
        // replace заменяет, только если существует ключ
        hashMap.replace("nothing", "stuff");
        System.out.println(hashMap.containsKey("nothing"));
        System.out.println("***");

        LinkedHashMap<Integer, Integer> hashMap1 = new LinkedHashMap<>();
        for (int i = 0; i < 100; ++i) {
            Random r1 = new Random(), r2 = new Random();
            hashMap1.put(r1.nextInt(1000), r2.nextInt(1000));
        }

        System.out.println(hashMap1.size());
        System.out.println("***");

        for (Map.Entry<Integer, Integer> i : hashMap1.entrySet()) {}

        hashMap1.forEach((k, v) -> { System.out.println("k = " + k + "; v = " + v);});

        hashMap.clear();
    }
}
