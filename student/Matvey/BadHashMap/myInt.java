package to29.november;

public class myInt {
    private int s;
    public myInt(int i){
        this.s = i;
    }

    public String toString(){
        Integer q = (Integer)this.s;
        return q.toString();
    }

    private static int statint = 0;
    private final int hash(){
        return 169-(statint-13)*((statint++)-13);
    }

    @Override
    public int hashCode() {
        return hash();
    }
}
