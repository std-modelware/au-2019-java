package badMap;

public class newString {
    private String string;

    public newString(String string) {
        this.string = string;
    }

    public newString() {
        this.string = new String();
    }


    @Override
    public int hashCode() {
        return 5;
    }
}
