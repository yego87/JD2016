package by.it.chetovich.JD01_12;

import java.util.HashSet;
import java.util.Set;

/**
 * cross and union of generic sets
 */
public class MyCollectForC2 {

    public static <T> Set<T> getUnion(Set<T> a, Set<T>b){

        Set<T> set = new HashSet<>(a);
        set.addAll(b);
        return set;

    }

    public static <T>Set<T> getCross (Set<T> a, Set<T>b){

        Set<T> set = new HashSet<>();
        for (T T : a) {
            if (b.contains(T)) set.add(T);
        }
        return set;
    }
}
