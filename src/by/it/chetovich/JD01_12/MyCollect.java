package by.it.chetovich.JD01_12;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by user_2 on 26.02.2016.
 */
public class MyCollect {

    public static Set<Integer> getUnion(Set<Integer> a, Set<Integer>b){

        Set<Integer> set = new HashSet<>(a);
        set.addAll(b);
        return set;

    }

    public static Set<Integer> getCross (Set<Integer> a, Set<Integer>b){

        Set<Integer> set = new HashSet<>();
        for (Integer integer : a) {
            if (b.contains(integer)) set.add(integer);
        }
        return set;
    }
}
