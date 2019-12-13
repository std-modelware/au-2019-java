package practice03;

public class BigAndUglyWrapper<T extends Comparable<T>> implements Comparable<BigAndUglyWrapper<T>>{
    private T obj;

    public static int cnt = 0;

    public BigAndUglyWrapper(T t) {
        obj = t;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T t) {
        this.obj = t;
        cnt++;
        System.out.println(cnt);
    }

    @Override
    public int compareTo(BigAndUglyWrapper<T> wrapper) {
        return this.obj.compareTo(wrapper.getObj());
    }

    public void swap(BigAndUglyWrapper<T> wrapper) {
        T tmp = obj;
        obj = wrapper.getObj();
        wrapper.setObj(tmp);
    }
}
