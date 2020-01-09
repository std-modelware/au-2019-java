package ru.au2019.java.hanoi;

import java.util.Stack;

public class Stick {
    private Stack<Disk> stack;
    private String name;

    public Stick(String name) {
        this.stack = new Stack<>();
        this.name = name;
    }

    public boolean push(Disk d){
        if (this.stack.empty()) {
            this.stack.push(d);
            return true;
        }

        Disk top = this.stack.peek();
        if (top.getSize() > d.getSize()) {
            this.stack.push(d);
            return true;
        }

        return false;
    }

    public Disk pop() {
        if (this.stack.empty()) {
            return null;
        }

        return this.stack.pop();
    }

    public String toString() {
        return this.name + ":" + this.stack.toString();
    }

}

