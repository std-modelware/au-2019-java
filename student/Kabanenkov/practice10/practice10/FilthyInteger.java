package practice10;

public class FilthyInteger {
    private int val;

    public FilthyInteger(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    @Override
    public int hashCode() {
        return val;
    }
}
