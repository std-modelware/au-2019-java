package au2019;

import practice02.AnotherStack;

public class Main {
    public static void main(String[] args) {
        for (String s : args)
            System.out.println(s);

        AnotherStack<String> st = new AnotherStack<>();
        st.add("Hello world!");

        for (Object s : st.toArray())
            System.out.println(s);

        System.out.println(st.contains("Hello world!"));
        System.out.println(st.size());
        st.remove("Hello world!");
        System.out.println(st.contains("Hello world!"));
        System.out.println(st.size());

        st.push("s 1");
        st.push("s 2");
        st.push("s 3");

        System.out.println(st.top());
        st.pop();
        System.out.println(st.top());
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();

        System.out.println(st.size());
        st.add(null);
        System.out.println(st.size());
    }
}


















/*import swap.BigAndUglyWrapper;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String strs[] = { "there", "hello" };



        ArrayList<BigAndUglyWrapper<String>> wrappers = new ArrayList<>(strs.length);

        for(int i = 0; i < strs.length; ++i) {
            wrappers.add(new BigAndUglyWrapper<>(strs[i]));
        }

        wrappers.get(0).swap(wrappers.get(1));

        System.out.println(wrappers.get(0).getObj());
        System.out.println(wrappers.get(1).getObj());


        //Collections.sort(wrappers);

        //for(BigAndUglyWrapper wrapper : wrappers) {
        //    System.out.println(wrapper.getObj());
        //}
    }
}*/


