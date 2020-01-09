package ru.au2019.java.hanoi;

public class Main {
    public static void main(String[] args) {
        Stick s1 = new Stick("1");
        Stick s2 = new Stick("2");
        Stick s3 = new Stick("3");

        for (int i = 10; i > 0; i--) {
            s1.push(new Disk(i));
        }

        System.out.println("----------------");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        StickManager.move(s1, s2);
        System.out.println("----------------");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        StickManager.move(s1, s3);
        System.out.println("----------------");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        StickManager.move(s2, s3);
        System.out.println("----------------");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
