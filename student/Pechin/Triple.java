package com.academicuni.dz;


public class Triple<T> {
    public T a;
    public T b;
    public T c;
    public static void main(String[] args) throws NotANumberInPairException {
        int a = 15;
        int b = 5;
        int c = 20;
        Triple<Integer> t = new Triple(a, b, c);
        System.out.println(t.max());
        System.out.println(t.min());
        System.out.println(t.mean());
        System.out.println(t.toString());
        Triple<String> t2 = new Triple("lol", "kek", "owo");
        System.out.println(t2.toString());
        System.out.println(t2.max());
    }
    public Triple(T A, T B, T C) {
        a = A;
        b = B;
        c = C;
    }
    public T min() throws NotANumberInPairException {
    try {
        double da = ((Number) a).doubleValue();
        double db = ((Number) b).doubleValue();
        double dc = ((Number) c).doubleValue();
        return da > db ? db > dc ? c : b : da > dc ? c : a;
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
        double dc = ((Number) c).doubleValue();
        return da < db ? db < dc ? c : b : da < dc ? c : a;
    }
        catch (java.lang.ClassCastException e) {
                NotANumberInPairException exc = new NotANumberInPairException();
                throw exc;
                }
    }
    public Double mean() throws NotANumberInPairException {
    try {
        return (((Number) a).doubleValue() + ((Number) b).doubleValue() + ((Number) c).doubleValue()) / 3;
    }
        catch (java.lang.ClassCastException e) {
        NotANumberInPairException exc = new NotANumberInPairException();
        throw exc;
        }
    }
    public String toString(){
        return "( " + a.toString() + ", " + b.toString() + ", " + c.toString() + " )";
    }
    public T getA(){
        return a;
    }
    public T getB(){
        return b;
    }
    public T getC(){
        return c;
    }
}


