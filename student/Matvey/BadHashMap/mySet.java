package to29.november;

import java.util.HashSet;
import java.util.Iterator;

public class mySet<T> extends HashSet<T>{

    public static <T> mySet<T> crossing(HashSet<T> hs1, HashSet<T> hs2){
        HashSet<T> res = new HashSet<>();
        for(T i:hs1){
            if(hs2.contains(i)){
                res.add(i);
            }
        }
        return (mySet)res;
    }

    public static <T> mySet<T> union(HashSet<T> hs1, HashSet<T> hs2){
        HashSet<T> res = (HashSet<T>)hs1.clone();
        for (T i:hs2){
                res.add(i);

        }
        return (mySet)res;
    }

    public static <T> mySet<T> difference(HashSet<T> hs1, HashSet<T> hs2){
        HashSet<T> res = new HashSet<>();
        for(T i:hs1){
            if(!hs2.contains(i)){
                res.add(i);
            }
        }

        return (mySet)res;
    }

}
