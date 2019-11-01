package ru.au2019.java.wildcardtype;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wildcard Type");

        ArrayList<Employee> listE = new ArrayList<>();

        listE.add(new Worker());
        listE.add(new Owner());
        listE.add(new Manager());

        for (Employee e : listE) {
            System.out.println(e);
        }

        System.out.println("--------------------");

        Main.Print1(listE);

        System.out.println("--------------------");

        ArrayList<Manager> listM = new ArrayList<>();
        listM.add(new Manager());
        listM.add(new Manager());
        listM.add(new Manager());

        ArrayList<Worker> listW = new ArrayList<>();
        listW.add(new Worker());
        listW.add(new Worker());
        listW.add(new Worker());

        ArrayList<Owner> listO = new ArrayList<>();
        listO.add(new Owner());
        listO.add(new Owner());
        listO.add(new Owner());

        ArrayList<String> listS = new ArrayList<>();
        listS.add("String 1");
        listS.add("String 2");
        listS.add("String 3");

//        Main.Print1(listW);
//        Main.Print1(listM);
//        Main.Print1(listO);


        Main.Print2(listM);
        System.out.println("--------------------");

        Main.Print2(listW);
        System.out.println("--------------------");

        Main.Print2(listO);
        System.out.println("--------------------");

        Main.Print2(listS);
        System.out.println("--------------------");

        // --------------------------------
        Main.Print3(listM);
        System.out.println("--------------------");

        Main.Print3(listW);
        System.out.println("--------------------");

        Main.Print3(listO);
        System.out.println("--------------------");

//        Main.Print3(listS);
//        System.out.println("--------------------");

        // ---------------------------
        ArrayList<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);

        ArrayList<Double> listDouble = new ArrayList<>();
        listDouble.add(1.0);
        listDouble.add(2.0);
        listDouble.add(3.0);

        ArrayList<Object> listObject = new ArrayList<>();
        listObject.add(new Integer(100));
        listObject.add(new Double(200.0));
        listObject.add("string");

        ArrayList<Number> listNumber = new ArrayList<>();
        listNumber.add(new Integer(10));
        listNumber.add(new Double(20.0));
        listNumber.add(new Number() {
            @Override
            public int intValue() {
                return 30;
            }

            @Override
            public long longValue() {
                return 30L;
            }

            @Override
            public float floatValue() {
                return 30.0f;
            }

            @Override
            public double doubleValue() {
                return 30.0;
            }

            public String toString() {
                return "I am here";
            }
        });

        // -------------------------
        ArrayList<? extends Number> list1 = listInteger;
        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        System.out.println(list1.get(2));

        System.out.println("--------------");
        list1 = listDouble;
        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        System.out.println(list1.get(2));

        // list1 = listObject;

        System.out.println("--------------");
        list1 = listNumber;
        System.out.println(list1.get(0).intValue());
        System.out.println(list1.get(1).doubleValue());
        System.out.println(list1.get(2).floatValue());

        // работает только на чтение
        // записывать нельзя
        // list1.add(new Integer(1));

        ArrayList<? super Integer> list2 = listInteger;
        System.out.println(list2.get(0));
        System.out.println(list2.get(1));
        System.out.println(list2.get(2));

        // list2 = listDouble;
        list2 = listNumber;
        System.out.println(((Integer) list2.get(0)).intValue());
        System.out.println(((Double) list2.get(1)).doubleValue());
        System.out.println(list2.get(2));

        list2 = listObject;
        System.out.println(list2.get(0));
        System.out.println(list2.get(1));
        System.out.println(list2.get(2));

        list2.add(new Integer(12));

    }

    public static void Print1(ArrayList<Employee> list) {
        for (Employee e : list) {
            System.out.println(e);
        }
    }

    public static void Print2(ArrayList<?> list) {
        for (Object e : list) {
            System.out.println(e);
        }
    }

    public static void Print3(ArrayList<? extends Employee> list) {
        for (Employee e : list) {
            System.out.println(e);
        }
    }
}
