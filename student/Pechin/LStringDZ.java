package com.academicuni.dz;

public class LStringDZ {
    public static void main(String[] args) {
        int sz = 8;
        String sym = "#";

        StringBuilder sb1 = new StringBuilder("");
        for (int i = 0; i < sz; i++){
            sb1.append(new String(new char[2 * sz - i]).replace("\0", " "));
            sb1.append(new String(new char[2 * i + 1]).replace("\0", sym));
            sb1.append("\n");
        }
        for (int i = 0; i < sz; i++){
            sb1.append(new String(new char[sz - i]).replace("\0", " "));
            sb1.append(new String(new char[2 * i + 1]).replace("\0", sym));
            sb1.append(new String(new char[2 * (sz - i) - 1]).replace("\0", " "));
            sb1.append(new String(new char[2 * i + 1]).replace("\0", sym));
            sb1.append("\n");
        }

        System.out.println(sb1);

    }
}
