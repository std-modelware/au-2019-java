package to29.november;

import java.util.HashSet;


public class SetMain {

    public static <T> HashSet<T> crossing(HashSet<T> hs1, HashSet<T> hs2){
        HashSet<T> res = new HashSet<>();
        for(T i:hs1){
            if(hs2.contains(i)){
                res.add(i);
            }
        }
        return res;
    }

    public static <T> HashSet<T> union(HashSet<T> hs1, HashSet<T> hs2){
        HashSet<T> res = (HashSet<T>)hs1.clone();
        for (T i:hs2){
            if(!res.contains(i)){
                res.add(i);
            }
        }
        return res;
    }

    public static <T> HashSet<T> difference(HashSet<T> hs1, HashSet<T> hs2){
        HashSet<T> res = new HashSet<>();
        for(T i:hs1){
            if(!hs2.contains(i)){
                res.add(i);
            }
        }

        return res;
    }


    public static void main(String[] args){

        mySet<Integer> set1 = new mySet<>();
        mySet<Integer> set2 = new mySet<>();

        set1.add(4);
        set1.add(-523);
        set1.add(123);
        set1.add(-2);
        set1.add(0);
        set1.add(8);

        set2.add(4);
        set2.add(-523);
        set2.add(129);
        set2.add(-888);
        set2.add(13);
        set2.add(83);

        System.out.println(union(set1,set2));
        System.out.println(crossing(set1,set2));
        System.out.println(difference(set1,set2));
        System.out.println(difference(set2,set1));

    }
}
