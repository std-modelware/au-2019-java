package ru.au2019.java.generic;

public class Triple<T extends Comparable<T>> {
    private T first;
    private T second;
    private T third;


    public Triple(T f, T s, T t) {
        this.first = f;
        this.second = s;
        this.third = t;
    }

    public Triple() {}

    public T getMin(){
        if (((Comparable)this.first).compareTo((Comparable)this.second) > 0 ){
            // this.second is less
            if (((Comparable)this.second).compareTo((Comparable)this.third) > 0 ) {
                return this.third;
            } else {
                return this.second;
            }
        } else {
            //this.first is less
            if (((Comparable)this.first).compareTo((Comparable)this.third) > 0 ) {
                return this.third;
            } else {
                return this.first;
            }
        }
    }

    public float getMean() throws CanNotTakeMeanException {
        if (this.first instanceof String) {
            throw new CanNotTakeMeanException();
        }
        float i1 = 0;
        float i2 = 0;
        float i3 = 0;

        if (this.first instanceof Integer) {
            i1 = (Integer) this.first;
            i2 = (Integer) this.second;
            i3 = (Integer) this.third;
        }

        if (this.first instanceof Float) {
            i1 = (Float) this.first;
            i2 = (Float) this.second;
            i3 = (Float) this.third;
        }
        return (i1 + i2 + i3)/3;
    }




}
