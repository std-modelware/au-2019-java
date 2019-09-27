package ru.au2019.java;

public class LObject {
    public static void main(String[] args) {
        System.out.println("LObject");

        // Класс может иметь несколько конструкторов
        // override - переопределение
        // overload - перегрузка

        LObject o1 = new LObject();
        LObject o2 = new LObject(1, "string", true);

        LObject o3 = new LObject(2);

        System.out.println("LObject");
    }

    private int i;
    private String s;
    private boolean b;
    private int j = 1000;
    private int k = assignK();

    private static int assignK() {
        return 200;
    }

    {
        System.out.println("object block");
    }

    static {
        System.out.println("class block");
    }

    public LObject() {
//        this.i = 0;
//        this.s = null;
//        this.b = false;
        System.out.println("LObject::LObject() i = " + i);
    }

    public LObject(int i, String s, boolean b) {
        this.i = i;
        this.s = s;
        this.b = b;
        System.out.println("LObject::LObject(int i, String s, boolean b) i = " + i);
    }

    public LObject(int i) {
        // вызов другого конструктора
        this(i, "string 1", false);
        System.out.println("LObject::LObject(int i) i = " + i);

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
