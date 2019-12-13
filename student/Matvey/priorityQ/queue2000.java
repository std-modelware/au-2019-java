package to11.november.priorityQ;

import java.util.PriorityQueue;

public class queue2000 {


    public static void main(String[] args){
        System.out.println("Queue2000");
        PriorityQueue<Integer> q2000 = new PriorityQueue<>();
        long t1 = 0;
        long t2 = 0;

        for(int k=0;k<50;k++) {
            long check1 = System.nanoTime();
            for (int i = 0; i < 2000; i++) {
                q2000.add(2000-i);
            }
            long check2 = System.nanoTime();
            while (q2000.isEmpty()==false){
                q2000.poll();
            }
            long check3 = System.nanoTime();
            q2000.clear();

            t1 = t1 + check2 - check1;
            t2 = t2 + check3 - check2;
        }
        System.out.println(t1/2000/50);
        System.out.println(t2/2000/50);

    }
}
