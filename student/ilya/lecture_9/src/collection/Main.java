package collection;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Collections");

        ArrayList<Integer> al0 = new ArrayList<>();

        Collection<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
        c.add(6);

        Iterator<Integer> i = c.iterator();
        while (i.hasNext()) {
            Integer item = i.next();
            i.remove();
            System.out.println(item);
        };

        System.out.println("size" + c.size());
        i = c.iterator();
        while (i.hasNext()) {
            Integer item = i.next();
            System.out.println(item);
        }


        //Collections types
        //ArrayList динамически расширяется и сокращается. Индексируется. Последовательность.
        List<Integer> al = new ArrayList<>();

        List<Integer> ll1 = new LinkedList<Integer>();
        Deque<Integer> ll2 = new LinkedList<Integer>();



        Collection<Integer> c0 = new ArrayList<>();


    }
}
