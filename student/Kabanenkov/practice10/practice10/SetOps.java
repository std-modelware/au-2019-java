package practice10;

import java.lang.reflect.InvocationTargetException;
import java.util.Set;

public class SetOps {
    private static<T> Set<T> createEmptySet(Set<? extends T> set) throws SetOpsException {
        var ctors = set.getClass().getConstructors();
        if (ctors.length == 0) {
            throw new SetOpsException("No public constructors were found\n");
        }

        Set<T> result;
        for (var ctor : ctors) {
            if (ctor.getParameterTypes().length == 0) {
                try {
                    result = (Set<T>)ctor.newInstance();
                    return result;
                } catch (InstantiationException | InvocationTargetException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        throw new SetOpsException("Couldn't find a constructor that takes no arguments.");
    }

    private static<T> void checkCompatibility(Set<? extends T> s1, Set<? extends T> s2) throws SetOpsException {
        if (!s1.getClass().equals(s2.getClass())) {
            throw new SetOpsException("s1 and s2 have different implementations.\n");
        }
    }

    public static<T> Set<? extends T> union(Set<? extends T> s1, Set<? extends T> s2) throws SetOpsException {
        checkCompatibility(s1, s2);
        Set<T> result = createEmptySet(s1);

        result.addAll(s1);
        result.addAll(s2);

        return result;
    }

    public static<T> Set<? extends T> minus(Set<? extends T> s1, Set<? extends T> s2) throws SetOpsException {
        checkCompatibility(s1, s2);
        Set<T> result = createEmptySet(s1);

        result.addAll(s1);
        result.removeAll(s2);

        return result;
    }

    public static<T> Set<? extends T> intersection(Set<? extends T> s1, Set<? extends T> s2) throws SetOpsException {
        checkCompatibility(s1, s2);
        Set<T> result = createEmptySet(s1);

        return minus(union(s1, s2), union(minus(s1, s2), minus(s2, s1)));
    }
}
