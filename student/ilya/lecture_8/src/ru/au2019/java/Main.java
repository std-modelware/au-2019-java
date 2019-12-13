package ru.au2019.java;

public class Main {
    public static void main(String[] args) throws Exception_01{
        System.out.println("Exception");

        Exception_01 exc01 = new Exception_01();

        // error happened
        try {
            System.out.println("before");
            throw exc01;
//            System.out.println("after");
        } catch (Exception_01 e) {
            System.out.println("Exception_01 caught");
        }


        //throw exc01;

        //throw new Exception_02();

        //============================
        SomeClass sc1 = new SomeClass();
        SomeClass sc2 = new SomeClass("The string");

        try {
            sc2.Method();
            sc1.Method();
        } catch (SomeClassException e) {
            System.out.println(e.getMessage());
        }

        //===============
        try {
            //sc2.Method();
            sc1.Method();
        } catch (SomeClassStringisEmptyException e) {
            System.out.println(e.getMessage());
        } catch (SomeClassException e) {
            System.out.println(e.getMessage());
        }


        //===============
        try {
            try {
                sc1.Method();
            } catch (SomeClassStringisEmptyException e) {
                System.out.println(e.getMessage());
                Exception_01 exc_01 = new Exception_01();
                exc_01.initCause(e);
                throw exc_01;
            }
        } catch (Exception_01 e) {
            System.out.println("Exception_01 caught");
            System.out.println("The cause is " + e.getCause().getMessage());
        }




        //==================
        try {
            sc2.Method();
        } catch (SomeClassStringisEmptyException e) {
            System.out.println(e.getMessage());
            StackTraceElement[] ste = e.getStackTrace();
            e.printStackTrace();
        } finally {
            System.out.println("I am the finally");
        }


    }
}
