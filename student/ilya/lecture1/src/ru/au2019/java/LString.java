package ru.au2019.java;

import javax.print.DocFlavor;

public class LString {
    public static void main(String[] args) {
        System.out.println("LString");

        String str1 = "Test";
        String str2 = "Test" + "2";
        String str3 = "Test" + 19;
        String str4 = "Test" + (19+1);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        System.out.println(String.join("-!-", "one", "two", "three"));

        System.out.println(str2.substring(3, 5));


        String str6 = "Hello";
        String str7 = "Hello";
        String str8 = "Hel";
        String str9 = str8 + "lo";

        System.out.println("1:" + (str6 == str7));
        System.out.println("2:" + (str6 == "Hello"));
        System.out.println("3:" + (str9 == str7));
        System.out.println("4:" + (str9 == "Hello"));
        System.out.println("5:" + (str9.equals(str7)));
        System.out.println("6:" + (str9.equals("Hello")));


        String str10 = null;

        if (str10 == null) {
            System.out.println("str10 == null");
        } else {
            System.out.println("str10 != null");
        }

        StringBuilder sb1 = new StringBuilder("TestString");
        sb1.append("123");
        sb1.append(12);

        System.out.println(sb1);

        StringBuilder sb2 = sb1;
        String sb3 = sb1.toString();


        double pi = 3.1415926;

        System.out.printf("%f", pi);
    }
}
