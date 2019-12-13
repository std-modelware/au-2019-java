package practice02;

import java.util.Collection;
import java.util.Iterator;

public class AnotherStack<T> implements Collection<T> {
    static final int INITIAL_SIZE = 10;
    static final int MULTIPLIER = 2;

    private Object[] data;
    private int len;
    private int capacity;

    public AnotherStack() {
        data = new Object[INITIAL_SIZE];
        len = 0;
        capacity = INITIAL_SIZE;
    }

    @Override
    public int size() {
        return len;
    }

    @Override
    public boolean isEmpty() {
        return len == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size(); ++i)
            if (data[i].equals(o))
                return true;
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] arr = new Object[size()];
        System.arraycopy(data, 0, arr, 0, size());
        return arr;
    }

    @Override
    public <T1> T1[] toArray(T1[] t1s) {
        return (T1[])data;
    }

    @Override
    public boolean add(Object o) {
        if (o == null)
            return false;

        if (size() >= capacity) {
            capacity *= MULTIPLIER;
            Object[] data_ = new Object[capacity];
            if (len >= 0) System.arraycopy(data, 0, data_, 0, len);
            data = data_;
        }

        data[len] = o;
        ++len;

        return true;
    }

    @Override
    public boolean remove(Object o) {
        boolean found = false;
        for (int i = 0; i < size()-1; ++i) {
            if (data[i].equals(o)) {
                found = true;
                --len;
            }
            if (found)
                data[i] = data[i+1];
        }
        if (!found && size() > 0 && data[size()-1].equals(o)) {
            found = true;
            --len;
        }
        return found;
    }

    @Override
    public boolean addAll(Collection collection) {
        for (Object o : collection)
            add(o);
        return collection.size() != 0;
    }

    @Override
    public void clear() {
        len = 0;
    }

    @Override
    public boolean retainAll(Collection collection) {
        boolean changed = false;

        for (Object o : collection) {
            if (contains(o)) {
                remove(o);
                changed = true;
            }
        }

        return changed;
    }

    @Override
    public boolean removeAll(Collection collection) {
        boolean changed = false;

        for (Object o : collection) {
            if (remove(o))
                changed = true;
        }

        return changed;
    }

    @Override
    public boolean containsAll(Collection collection) {
        for (Object o : collection) {
            if (!contains(o))
                return false;
        }

        return true;
    }

    public T top() {
        if (size() == 0)
            return null;

        return (T)data[size()-1];
    }

    public void push(T t) {
        add(t);
    }

    public T pop() {
        if (size() == 0)
            return null;

        --len;
        return (T)data[len];
    }
}
