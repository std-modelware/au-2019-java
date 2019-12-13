package to11.november.priorityQ;

import java.util.PriorityQueue;

public class queue500 {


    public static void main(String[] args){
        System.out.println("Queue500");
        PriorityQueue<Integer> q500 = new PriorityQueue<>();
        long t1 = 0;
        long t2 = 0;

        for(int k=0;k<50;k++) {
            long check1 = System.nanoTime();
            for (int i = 0; i < 500; i++) {
                q500.add(500-i);
            }
            long check2 = System.nanoTime();
            while (q500.isEmpty()==false){
                q500.poll();
            }
            long check3 = System.nanoTime();
            q500.clear();

            t1 = t1 + check2 - check1;
            t2 = t2 + check3 - check2;
        }
        System.out.println(t1/500/50);
        System.out.println(t2/500/50);

    }
}
