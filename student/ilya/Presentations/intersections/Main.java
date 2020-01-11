package intersections.java;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        class Test<T extends PPrint & CConcatenate> {};

        Test<Class1> test1 = new Test<>();
//        Test<Class2> test2 = new Test<>();

        class Test1<T extends List & RandomAccess> {};

        Test1<ArrayList> al1 = new Test1<>();
//        Test1<LinkedList> v1 = new Test1<>();

        int b = 3;
        double d = 4.0;
        System.out.println( b + d );
        b += d;
        System.out.println(b);

        // a ~= b   ==   a = (T) ( a ~ b )
        System.out.println( b*d );
        b *= d;
        System.out.println(b);

    }
}
