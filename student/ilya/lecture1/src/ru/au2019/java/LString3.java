package ru.au2019.java;

public class LString3 {
    public static void main(String[] args) {
        String s1 = "A lion is an animal";
        for (int i = 0; i < s1.length(); i++) {
            System.out.print(s1.charAt(i) + " ");
        }
        System.out.println();

        String s2 = s1 + "!";
        System.out.println(s2.compareTo(s1));
        s1 += "! And it eats meat.";
        System.out.println(s2 + "\n" + s1);
        System.out.println(s2.compareTo(s1));
        System.out.println();

        String st1 = "men are able to have a job";
        System.out.println("st1 = " + st1);
        String st2 = "wo";
        st2 = st2.concat(st1);
        System.out.println("st2 = " + st2);
        String st3 = "Black ";
        st3 = st3.concat(st2);
        System.out.println("st3 = " + st3);
        st3 = st3.concat("!");
        System.out.println(st3);
        System.out.println();

        String s4 = "s cast";
        String s5 = "This castle is wonderful";
        System.out.println(s5.contains(s4));
        System.out.println(s5.contains(s2));
        System.out.println();

        String s6 = "I like ice-cream";
        System.out.println(s6.substring(2, 6));
    }
}
