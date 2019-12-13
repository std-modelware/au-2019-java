package to29.november;

public class myStr {
    private String s;
    public myStr(String s){
        this.s = s;
    }
    public myStr(int i){
        Integer q = (Integer)i;
        this.s = q.toString();
    }

    public String toString(){
        return this.s;
    }

    private static int statint = 0;
    private final int hash(){
        return 169-(statint-13)*((statint++)-13);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
