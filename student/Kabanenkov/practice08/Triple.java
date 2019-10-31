package practice08;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

// T is expected is to have a constructor T(String) that constructs a Number from the String
// and toString() to convert the Number to a String
// Thus Triple works with Integer, Double, etc...
public class Triple<T extends Number & Comparable> {
    private T first, second, third;

    public Triple() {}

    public Triple(T first) {
        this.first = first;
    }

    public Triple(T first, T second) {
        this(first);
        this.second = second;
    }

    public Triple(T first, T second, T third) {
        this(first, second);
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public T getThird() {
        return third;
    }

    public void setThird(T third) {
        this.third = third;
    }

    public T min() {
        if(first.compareTo(second) <= 0)
            return first.compareTo(third) <= 0 ? first : third;
        else
            return second.compareTo(third) <= 0 ? second : third;
    }

    public T max() {
        if(first.compareTo(second) >= 0)
            return first.compareTo(third) >= 0 ? first : third;
        else
            return second.compareTo(third) >= 0 ? second : third;
    }

    public T mean() throws BadTypeException, ConstructorFailedException {
        BigDecimal result = new BigDecimal(first.toString())
                .add(new BigDecimal(second.toString()))
                .add(new BigDecimal(third.toString()))
                .divide(new BigDecimal(3));

        // Since Java can't do "new T();"
        try {
            Constructor ctor = first.getClass().getDeclaredConstructor(String.class);
            return (T)ctor.newInstance(result.toString());
        } catch (NoSuchMethodException e) {
            throw new BadTypeException();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new ConstructorFailedException();
        }
    }
}
