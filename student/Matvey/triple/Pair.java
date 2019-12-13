package lect08.triple;

import java.math.BigDecimal;
import java.util.Comparator;

public class Pair<T extends Comparable<T>> {
    private T first;
    private T second;

    public Pair() {
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(T first){
        this.first = first;
    }
    public void setSecond(T second){
        this.second = second;
    }

    public T getFirst(){return this.first;}
    public T getSecond(){return this.second;}

    public T getMin(){
        if (((Comparable)this.first).compareTo((Comparable)this.second)> 0){
            return this.second;
        }
        return this.first;
    }

    public T getMax(){
        if (((Comparable)this.first).compareTo((Comparable)this.second)< 0){
            return this.second;
        }
        return this.first;
    }

    public double getMean()throws Exception{
       if (this.first instanceof String) {
           throw new StringTypeException();
       }
       if (this.first instanceof Integer || this.first instanceof Double ||this.first instanceof Float) {
           double d = ((Number) this.first).doubleValue() + ((Number) this.second).doubleValue();
           return d/2;
       }

       throw new Exception("Cannot get mean of this type");

    }


    public static void main(String[] args){
        Pair p1 = new Pair<Integer>(3,6);
        System.out.println(p1.getMin());

        Pair p2 = new Pair<String>("abc","def");
        System.out.println(p2.getMax());

        //Pair p3 = new Pair<Pair>(p1,p2); - unable to create p3

        Pair p4 = new Pair<Double>(3.1459,2.7192818284590);
        System.out.println(p4.getMin());


        System.out.println("-----------------MEANS-----------------");
        try {
            System.out.println(p1.getMean());
            System.out.println(p4.getMean());
            System.out.println(p2.getMean());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("-----------------Triples-----------------");
        Triple<Double> t1 = new Triple(2.16,3.14,19.123);
        Triple<String> t2 = new Triple("abc","cde","fgh");

        try {
            System.out.println(t1.getMin());
            System.out.println(t1.getMax());
            System.out.println(t1.getMean());

            System.out.println(t2.getMin());
            System.out.println(t2.getMax());
            System.out.println(t2.getMean());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
