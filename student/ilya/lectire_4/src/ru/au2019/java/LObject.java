package ru.au2019.java;

public class LObject {
    public static void main(String[] args) {
        System.out.println("LObject");

        //override - переопределение
        //overload - перегрузка - методы с одинаковыми названиями, но разными аргументами

        LObject o1 = new LObject();
        LObject o2 = new LObject(2, "resdwe", true);

        LObject o3 = new LObject(2);

        System.out.println("LObject");
    }

    private int i;
    private String s;
    private boolean b;
    private int j = 1000;
    private int k = assignK();

    private static int assignK() {
        return 20;
    }

    {
        System.out.println("Every time block");
    }

    static {
        System.out.println("One time block");
    }

    public LObject() {
//        this.i = i;
//        this.s = s;
//        this.b = b;
        System.out.println("LObject() = " + i);
    }


    public LObject(int i){
        this(i, "string1", false);
    }


    public LObject(int i, String s, boolean b) {
        this.i = i;
        this.s = s;
        this.b = b;
        System.out.println("LObject(i, s, b)" + i);
    }

}
