package to11.november.EnumMap;

import java.util.Collection;
import java.util.EnumMap;

public class Main {

    public enum myEnum {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
    };


    public static void main(String[] args) {
        //public class EnumMap<K extends Enum<K>,V>
        //  extends AbstractMap<K,V>
        //  implements Serializable, Cloneable

        EnumMap<myEnum, String> em = new EnumMap<>(myEnum.class);
        //System.out.println(em[Monday]);

        System.out.println(em.isEmpty());

        {

            em.put(myEnum.Monday, "1");
            em.put(myEnum.Tuesday, "Dienstag");
            em.put(myEnum.Wednesday, "Mittwoch");
            em.put(myEnum.Thursday, "Donnerstag");
            em.put(myEnum.Friday, "Freitag");
            em.put(myEnum.Saturday, "Samstag");
            em.put(myEnum.Sunday, "Sonntag");
        }

        Collection<String> sets = em.values();
        System.out.println(sets);


        for (myEnum i: myEnum.values()){
            System.out.println(i.toString() +"      "+ em.get(i));
        }

        System.out.println("//////////////////////////");
        em.put(myEnum.Monday, "Montag");


        for (myEnum i: em.keySet()){
            System.out.println(i+"   "+ em.get(i));
        }


        String s = em.get(myEnum.Friday);
        System.out.println(s);
        System.out.println(em);


    }
}