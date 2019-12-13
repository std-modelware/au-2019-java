package ru.au2019.java;

public class LString2 {
    public static void main(String[] args) {
        System.out.println("-----String concatenation-----");
        String s1 = "men are able to have a job";
        System.out.println("s1 = " + s1);
        String s2 = "wo";
        System.out.println("s2 = " + s2);
        String s3 = "Black ";
        System.out.println("s3 = " + s3);
        String s4 = s3 + s2 + s1 + "!";
        System.out.println(s4);
        System.out.println();


        System.out.println("-----String length-----");
        System.out.println("s1 length is " +  s1.length());
        System.out.println("s1 + s2 length is " +  s1.length() + s2.length());
        System.out.println();


        System.out.println("-----String builder-----");
        StringBuilder sb1 = new StringBuilder(s3);
        System.out.println("sb1 = " + sb1);
        sb1.append(s2);
        System.out.println("sb1 = " + sb1);
        sb1.append(s1);
        System.out.println("sb1 = " + sb1);
        sb1.append("!");
        System.out.println("sb1 = " + sb1);

    }
}
