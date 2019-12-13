package ru.au2019.java;

import java.util.Arrays;

public class LArray {
    public static void main(String[] args) {
        System.out.println("LArray");

        int[] ia1 = new int[10];
        int ia2[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        for (int i = 0; i < ia1.length; i++) {
            System.out.print(ia1[i] + ", ");
        }

        System.out.println();

        for (int i : ia2) {
            System.out.print(i + ", ");
        }

        System.out.println();

        for (float i : new float[] {1.1f, 1.2f, 1.3f}) {
            System.out.print(i + ", ");
        }

        String[] sa1 = new String[10];

        String[] sa2 = args;

        System.out.println();

        String[] sa3 = Arrays.copyOf(args, args.length);
        sa2[0] = "new value";
        System.out.println("args[0] = " + args[0]);
        System.out.println("sa3[0] = " + sa3[0]);

        System.out.println();

        //
        //объявление
        double [][] array2D;
        //инициализация
        array2D = new double[9][9];

        int [][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(matrix[0][1]);

        System.out.println(matrix);

        System.out.println(Arrays.deepToString(matrix));

        System.out.println();

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("|%d|", value);
            }
            System.out.println();
        }

        System.out.println();

        int[] tmp = matrix[0];
        matrix[0] = matrix[1];
        matrix[1] = tmp;

        System.out.println(Arrays.deepToString(matrix));

        //неровные массивы
        int[][] example = new int[5][];

        example[0] = new int[1];
        example[1] = new int[2];
        example[2] = new int[3];
        example[3] = new int[4];
        example[4] = new int[5];

        System.out.println(Arrays.deepToString(example));

    }
}
