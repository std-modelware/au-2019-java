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

        System.out.println();
        System.out.println("=========================");

        Main.Print1(listE);

        System.out.println();
        System.out.println("=========================");

        ArrayList<Manager> listM = new ArrayList<>();
        listM.add(new Manager());
        listM.add(new Manager());
        listM.add(new Manager());

        ArrayList<Worker> listW = new ArrayList<>();
        listW.add(new Worker());
        listW.add(new Worker());
        listW.add(new Worker());

        ArrayList<String> listS = new ArrayList<>();
        listS.add("String");
        listS.add("String");
        listS.add("String");

        ArrayList<Owner> listO = new ArrayList<>();
        listO.add(new Owner());
        listO.add(new Owner());
        listO.add(new Owner());

//        Main.print1(listW);
        Main.Print2(listM);
        Main.Print2(listW);
        Main.Print2(listO);
        Main.Print2(listS);

        Main.Print3(listM);
        Main.Print3(listW);
        Main.Print3(listO);


        System.out.println();
        System.out.println("=========================");
        //==========================

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
        listObject.add("String");

        ArrayList<Number> listNumber = new ArrayList<>();
        listNumber.add(new Integer(100));
        listNumber.add(new Double(200.0));
        listNumber.add(new Number() {
            @Override
            public int intValue() {
                return 30;
            }

            @Override
            public long longValue() {
                return 20;
            }

            @Override
            public float floatValue() {
                return 10;
            }

            @Override
            public double doubleValue() {
                return 200;
            }

            public String toString() {
                return "I am here";
            }
        });

        //=======================
        ArrayList<? extends Number> list1 = listInteger;
        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        System.out.println(list1.get(2));

        list1 = listDouble;
        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        System.out.println(list1.get(2));

        System.out.println("==================");
        list1 = listNumber;
        System.out.println(list1.get(0).intValue());
        System.out.println(list1.get(1).doubleValue());
        System.out.println(list1.get(2).floatValue());

//        list1.add(new Integer(1))

        System.out.println("==================");
        ArrayList<? super Integer> list2 = listInteger;
        System.out.println(list2.get(0));
        System.out.println(list2.get(1));
        System.out.println(list2.get(2));

        System.out.println("==================");

        list2 = listNumber;
        System.out.println( ((Integer) list2.get(0)).intValue());
        System.out.println( ((Double) list2.get(1)).doubleValue());
        System.out.println(list2.get(2));

        list2 = listObject;
        System.out.println(list2.get(0));
        System.out.println(list2.get(1));
        System.out.println(list2.get(2));

        list2.add(new Integer(12));








    }


    public static void Print1(ArrayList<Employee> list){
        for (Employee e: list) {
            System.out.println(e);
        }
        System.out.println();
    }

    public static void Print2(ArrayList<?> list){
        for (Object e: list) {
            System.out.println(e);
        }
        System.out.println();
    }

    public static void Print3(ArrayList<? extends Employee> list){
        for (Employee e: list) {
            System.out.println(e);
        }
        System.out.println();
    }

}
