import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectinTask {
    public static void main(String[] args){
        FooClass foo = new FooClass();
        StringBuilder info = new StringBuilder();

        try{
            Field[] fields = foo.getClass().getDeclaredFields();
            System.out.println("Fields:");
            for (int i=0;i<fields.length;i++){
                System.out.println("  "+fields[i]);
            }

            Method[] methods = foo.getClass().getDeclaredMethods();
            System.out.println("Methods:");
            for (int i=0; i<methods.length; i++){
                System.out.println("    "+methods[i]);
            }

            Constructor[] constructors = foo.getClass().getDeclaredConstructors();
            System.out.println("Constructors:");
            for (int i=0; i<constructors.length; i++){
                System.out.println("  "+constructors[i]);
            }

            String classname = "FooClass";

            Class LTestClass = Class.forName(classname);
            Object testClass = LTestClass.newInstance();
            Method testMesthod = LTestClass.getMethod("print");
            testMesthod.invoke(testClass);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}



class FooClass{
    private int i;
    private boolean b;
    private String s1;
    public String s2 = "FooClass example";
    protected double p = 3.1123;
    public FooClass(){
        this.i = -1;
        this.b = true;
        this.s1 = "Sample text";
    }
    public FooClass(int i,boolean b){
        this.i = i;
        this.b = b;
        this.s1 = "Sample text";
    }


    public int getI(){
        return this.i;
    }

    public boolean getNotB(){
        if (this.b)
            return false;
        return true;
    }

    public void print(){
        System.out.println("Fooclass.print():: "+i+"  "+b+"  "+s1+"  "+s2);
    }
}