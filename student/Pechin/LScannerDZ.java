package com.academicuni.dz;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class LScannerDZ {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("test.txt");
        Scanner in = new Scanner(file);
        StringBuilder sb1 = new StringBuilder("");
        while (in.hasNext()){
            sb1.append(in.nextLine());
            sb1.append("\n");
        }
        System.out.println(sb1);
    }
}
