package by.it.dorostchenok.jd01_12.variant_a;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class MyCollect {

    public static List<String> getUnion(List<String> list1, List<String> list2) {
        list1.removeAll(list2);
        list1.addAll(list2);
        Collections.sort(list1);
        return list1;
    }

    public static List<String> getCross(List<String> list1, List<String> list2) {
        list1.retainAll(list2);

        return list1;
    }
}
