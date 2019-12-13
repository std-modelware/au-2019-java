package stack;

import javax.lang.model.type.NullType;
import java.util.EmptyStackException;

public class LStack {
    private int l;
    private int now;
    private int[] array;


    public static void main(String[] args) throws Exception {
        try {
            System.out.println("LStack");
            LStack stack = new LStack(5);

            //System.out.println(stack.pop());

            for (int j = 0; j < 7; j++) {
                stack.push(j * j);
            }

            System.out.println(stack.pop());
            System.out.println(stack.pop());


            for (int j = 0; j < 5; j++) {
                System.out.print(stack.array[j] + " ");
            }

            System.out.println("\nmain finished without empty-stack-errors");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public LStack() {
        this.l = 10;
        this.now = -1;
        this.array = new int[10];
    }

    public LStack(int i) {
        this.l = i;
        this.now = -1;
        this.array = new int[i];
    }

    public int pop() throws Exception {
        if (this.now == -1) {
            throw new Exception("Empty stack");
        } else {
            int t = this.array[this.now--];
            this.array[this.now + 1] = 0;
            return t;
        }
    }

    public boolean push(int i) {
        if (this.now == this.l - 1) {
            System.out.println("Full stack");
            return false;
        } else {
            this.now += 1;
            this.array[this.now] = i;
            return true;
        }
    }

    public int getLength() {
        return this.l;
    }
}
