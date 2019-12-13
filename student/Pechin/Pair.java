package com.academicuni.dz;


public class Pair<T> {
    public T a;
    public T b;
    public static void main(String[] args) throws NotANumberInPairException {
        int a = 15;
        int b = 5;
        int c = 20;
        Pair<Integer> t = new Pair(a, b);
        System.out.println(t.max());
        System.out.println(t.min());
        System.out.println(t.mean());
        System.out.println(t.toString());
        Pair<String> t2 = new Pair("lol", "kek");
        System.out.println(t2.toString());
        System.out.println(t2.max());
    }

    public Pair(T A, T B) {
        a = A;
        b = B;

    }
    public T min() throws NotANumberInPairException {
        try {
            double da = ((Number) a).doubleValue();
            double db = ((Number) b).doubleValue();
            return da > db ? b : a;
        }
        catch (java.lang.ClassCastException e) {
            NotANumberInPairException exc = new NotANumberInPairException();
            throw exc;
        }
    }
    public T max() throws NotANumberInPairException {
        try {
            double da = ((Number) a).doubleValue();
            double db = ((Number) b).doubleValue();
            return da < db ? b : a;
        }
        catch (java.lang.ClassCastException e) {
            NotANumberInPairException exc = new NotANumberInPairException();
            throw exc;
        }
    }
    public Double mean() throws NotANumberInPairException {
        try {
            return (((Number) a).doubleValue() + ((Number) b).doubleValue()) / 2;
        }
        catch (java.lang.ClassCastException e) {
            NotANumberInPairException exc = new NotANumberInPairException();
            throw exc;
        }
    }
    public String toString(){
        return "( " + a.toString() + ", " + b.toString() +" )";
    }
    public T getA(){
        return a;
    }
    public T getB(){
        return b;
    }
}


