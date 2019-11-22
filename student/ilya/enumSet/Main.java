package EnumSet;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // EnumSet <- AbstractSet <- AbstractCollection

        Set<Week> es = EnumSet.allOf(Week.class); //все элементы включены

        System.out.println(es.size());

        for (Week d : es) {
            System.out.println(d);
        }
        // другой способ вывести:
        System.out.println(es);

        System.out.println("==============");
        es.remove(Week.Thus);
        for (Week d : es) {
            System.out.print(d + ", ");
        }
        System.out.println();

        es.add(Week.Thus);

        System.out.println("==============");
        System.out.println(es.contains(Week.Fri) ? "yes" : "no");
        es.remove(Week.Fri);
        System.out.println(es.contains(Week.Fri) ? "yes" : "no");

        System.out.println("==============");
        for (Week day : EnumSet.range(Week.Wed, Week.Fri)) System.out.println(day);



    }
    public enum Week {Mon, Thus, Wed, Thur, Fri, Sut, Sun};


}
