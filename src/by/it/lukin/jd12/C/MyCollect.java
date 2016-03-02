package by.it.lukin.jd12.C;

import java.util.HashSet;
import java.util.Set;


public class MyCollect {
    public static <T> Set<T> getCross(Set<T> a, Set<T> b) throws NullPointerException{
        if (a == null)
            throw new NullPointerException("Множество a = null");
        if (b == null)
            throw new NullPointerException("Множество b = null");

        Set<T> crossElements = new HashSet<T>();
        for (T element: a) {
            if (b.contains(element)) {
                crossElements.add(element);
            }
        }
        return crossElements;
    }

    public static <T> Set<T> getUnion(Set<T> a,Set<T> b) throws NullPointerException{
        if (a == null)
            throw new NullPointerException("Множество a = null");
        if (b == null)
            throw new NullPointerException("Множество b = null");

        Set<T> unionElements = new HashSet<T>();
        unionElements.addAll(a);
        unionElements.addAll(b);
        return unionElements;
    }
}
