package ru.au2019.java;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class LString {
    public static void main(String[] args) {
        System.out.println("LString");

        // Строки не изменяемые!!!
        String str1 = "Test";
        String str2 = "Test" + "Test";
        String str3 = "Test" + 19; // приведение
        String str4 = "Test" + 19 + 1;
        String str5 = "Test" + (19 + 1);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);

        System.out.println(String.join("-!-", "one", "two", "three"));

        System.out.println(str2.substring(0, 2)); // с 0-й позиции до (2-1) позиции
        // "TestTest" stTe (2,6)
        System.out.println(str2.substring(2, 6));


        String str6 = "Hello";
        String str7 = "Hello";
        String str8 = "H" + "e" + "l" + "l" + "o";

        String tmpStr = "H" + "e" + "l";
        String str9 = tmpStr + "l" + "o";

        System.out.println("1:" + (str6 == str7)); // t - один адрес
        System.out.println("2:" + (str6 == "Hello")); // t - один адрес
        System.out.println("3:" + (str9 == str7)); // f - разные адреса
        System.out.println("4:" + (str9 == "Hello")); // f - разные адреса
        System.out.println("5:" + (str9.equals(str7))); // t - одинаковое содержание
        System.out.println("6:" + (str9.equals("Hello"))); // t - одинаковое содержание

        str6 = "Hi"; // str7 не изченилось

        String str10 = null;

        if (str10 == null) {
            System.out.println("str10 == null -> true");
        } else {
            System.out.println("str10 == null -> false");
        }

        str10 = "";
        if (str10 == null) {
            System.out.println("str10 == null -> true");
        } else {
            System.out.println("str10 == null -> false");
        }

        String str11 = new String();
        if (str10 == null) {
            System.out.println("str11 == null -> true");
        } else {
            System.out.println("str11 == null -> false");
        }

        if (str10.length() == 0) {
            System.out.println("str11 is empty string");
        } else {
            System.out.println("str11 is NOT empty string");
        }

//        StringBuilder sb1 = "TestString";
        StringBuilder sb1 = new StringBuilder("TestString");
        sb1.append("12345");
        sb1.append(12);
        sb1.append('d');

        System.out.println(sb1);

        StringBuilder sb2 = sb1;
        String sb3 = sb1.toString();

        sb2.setCharAt(0, 'Z');
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);

        double pi = 3.1415926536;
        System.out.printf("%f\n", pi);
        System.out.printf("%.8f", pi);

    }
}
