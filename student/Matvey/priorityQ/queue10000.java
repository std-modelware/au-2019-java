package to11.november.priorityQ;

import java.util.PriorityQueue;

public class queue10000 {


    public static void main(String[] args){
        System.out.println("Queue10000");
        PriorityQueue<Integer> q10000 = new PriorityQueue<>();
        long t1 = 0;
        long t2 = 0;

        for(int k=0;k<50;k++) {
            long check1 = System.nanoTime();
            for (int i = 0; i < 10000; i++) {
                q10000.add(10000-i);
            }
            long check2 = System.nanoTime();
            while (q10000.isEmpty()==false){
                q10000.poll();
            }
            long check3 = System.nanoTime();
            q10000.clear();

            t1 = t1 + check2 - check1;
            t2 = t2 + check3 - check2;
        }

        System.out.println(t1/10000/50);
        System.out.println(t2/10000/50);


        System.out.println("find min = O(1)\n" + "delete min = O(log n)\n" + "add element = O(log n)");
    }
}
