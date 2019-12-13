package to11.november.priorityQ;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

public class Main {
    public static int f(int i){
        Random ran = new Random();
        int a = ran.nextInt(20);
        int b = ran.nextInt(20);
        int c = ran.nextInt(20);

        return i*i*a + i*b + c;
    }


    public static void main(String[] args) {
        //java.lang.Object
        //  java.util.AbstractCollection<E>
        //      java.util.AbstractQueue<E>
        //          java.util.PriorityQueue<E>

        //public class PriorityQueue<E>
        //  extends AbstractQueue<E>
        //    implements Serializable

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int qi;
        queue.add(50000);
        for (int i = 0; i < 10; i++) {
            qi = f(i);
            queue.add(qi);
            //System.out.print(qi+"    ");
            System.out.println(queue);
        }
        System.out.println();

        System.out.println(queue); //вернет "неупорядоченную" строку
        while(!queue.isEmpty()){
            System.out.print(queue.poll()+ "   ");
            //queue.peek(); - выдает min, но не удоляет из Queue
        }
        System.out.println();
        queue.clear();


        System.out.println("=================");
        PriorityQueue<Integer> queue2 = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = o1.toString();
                String s2 = o2.toString();
                if(s1.length() > s2.length()){
                    return -1;
                }
                if (s1.length() == s2.length()){
                    return 0;
                }
                return 1;
            }
        });

        for (int i = 0; i < 10; i++) {
            qi = f(i);
            queue2.add(qi);
        }

        System.out.println(queue2);

        Integer[] integers = {3,5,9,768};
        Integer[] ints = queue2.toArray(integers);
        for(int i:ints) {
            System.out.print(i+"   ");
        }
        System.out.println();



        while(!queue2.isEmpty()){
            System.out.print(queue2.poll() + "   ");
        }
        System.out.println();
        System.out.println(queue2.comparator()); //если стандартный - null
        System.out.println(queue.comparator());

        System.out.println("=============");

    }
}