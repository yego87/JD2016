package by.it.dorostchenok.jd01_12.variant_c.tasks;


import java.util.Collections;
import java.util.List;

public class VariantC2 <T extends  Comparable<T>> {

    public List<T> getUnion(List<T> list1, List<T> list2) {
        list1.removeAll(list2);
        list1.addAll(list2);
        Collections.sort(list1);
        return list1;
    }

    public List<T> getCross(List<T> list1, List<T> list2) {
        list1.retainAll(list2);

        return list1;
    }
}
