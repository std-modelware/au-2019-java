package au2019;

import practice01.AnotherScanner;

public class Main {
    public static void main(String[] args) {
        for(String w : AnotherScanner.readWords())
            System.out.println(w);

        // string demo
        String s = "hello there!";

        assert(s.charAt(0) == 'h');

        try {
            s.charAt(100);
        } catch (Exception e) {}

        String s2 = s.concat(" how r ya?");
        System.out.println("Concat: " + s2);

        System.out.println("String \"" + s + "\" contains line " + "\"ello\": " + s.contains("ello"));

        System.out.println("String formatting: " + String.format("%s %s", s, s2));

        // no letter 'z'
        assert(s2.indexOf('z') == -1);

        for (String w : s2.split(" "))
            System.out.println(w);

        System.out.println("Substring [i; j): " + "1234567890".substring(3, 8));

        System.out.println("Upper case: "+ s.toUpperCase());
    }
}
