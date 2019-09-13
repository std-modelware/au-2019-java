package ru.au2019.java;


import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.Scanner;

public class LScanner {
    public static void main(String[] args) /*throws Exception*/ {
        System.out.println("LScanner");

//        Scanner in = new Scanner(System.in); // стандартный ввод
//        System.out.print("String: ");
//
//        String name = in.nextLine();
//
//        System.out.println("Result: " + name);
//
//        System.out.println();
//
//        System.out.print("2 words: ");
//        String word1 = in.next();
//        String word2 = in.next();
//
//        System.out.println("Result: " + word1 + "," + word2);

        String dir = System.getProperty("user.dir");
        System.out.println("dir: " + dir);

        try {
            Scanner fin = new Scanner(java.nio.file.Paths.get(dir, "example.txt"), "UTF-8");

            String name = fin.nextLine();
            String word1 = fin.next();
            String word2 = fin.next();

            System.out.println(name + "|" + word1 + "|" + word2);

        } catch (NoSuchFileException e) {
            System.out.println("NoSuchFileException: " + e);
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
    }
}
