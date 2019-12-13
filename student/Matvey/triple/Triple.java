package lect08.triple;

import java.math.BigDecimal;

public class Triple<T extends Comparable<T>> {
    private T first;
    private T second;
    private T third;

    public Triple() {
    }

    public Triple(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public void setThird(T third) {
        this.third = third;
    }

    public T getFirst() {
        return this.first;
    }

    public T getSecond() {
        return this.second;
    }

    public T getThird() {
        return this.third;
    }

    public T getMin() {
        if (((Comparable) this.first).compareTo((Comparable) this.second) > 0) {
            if (((Comparable) this.second).compareTo((Comparable) this.third) > 0) {
                return third;
            }
            return second;
        }
        if (((Comparable) this.first).compareTo((Comparable) this.third) > 0) {
            return third;
        }
        return first;
    }

    public T getMax() {
        if (((Comparable) this.first).compareTo((Comparable) this.second) < 0) {
            if (((Comparable) this.second).compareTo((Comparable) this.third) < 0) {
                return third;
            }
            return second;
        }
        if (((Comparable) this.first).compareTo((Comparable) this.third) < 0) {
            return third;
        }
        return first;
    }


    public double getMean() throws Exception {
        if (this.first instanceof String) {
            throw new StringTypeException();
        }
        boolean f = false;
        if (this.first instanceof Integer) f = true;
        if (this.first instanceof Double) f = true;
        if (this.first instanceof Float) f = true;

        if (f == false) throw new Exception("Cannot get mean of this type");
        double d = ((Number) this.first).doubleValue() + ((Number) this.second).doubleValue() + ((Number) this.third).doubleValue();
        return d / 3;
    }
}
