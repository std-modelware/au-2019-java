package practice08;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

// T is expected is to have a constructor T(String) that constructs a Number from the String
// and toString() to convert the Number to a String
// Thus Pair works with Integer, Double, etc...
public class Pair<T extends Number & Comparable> {
    private T first, second;

    public Pair() {}

    public Pair(T first) {
        this.first = first;
    }

    public Pair(T first, T second) {
        this(first);
        this.second = second;
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

    public T min() {
        return first.compareTo(second) <= 0 ? first : second;
    }

    public T max() {
        return first.compareTo(second) >= 0 ? first : second;
    }

    public T mean() throws BadTypeException, ConstructorFailedException {
        BigDecimal result = new BigDecimal(first.toString())
                .add(new BigDecimal(second.toString()))
                .divide(new BigDecimal(2));

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
