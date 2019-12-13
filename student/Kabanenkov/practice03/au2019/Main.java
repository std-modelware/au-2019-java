package au2019;

import practice03.BigAndUglyWrapper;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String[] strs = { "there", "hello" };

        ArrayList<BigAndUglyWrapper<String>> wrappers = new ArrayList<>(strs.length);

        for (String str : strs) wrappers.add(new BigAndUglyWrapper<>(str));

        wrappers.get(0).swap(wrappers.get(1));

        System.out.println(wrappers.get(0).getObj());
        System.out.println(wrappers.get(1).getObj());


        Collections.sort(wrappers);

        for(BigAndUglyWrapper wrapper : wrappers) {
            System.out.println(wrapper.getObj());
        }
    }
}
