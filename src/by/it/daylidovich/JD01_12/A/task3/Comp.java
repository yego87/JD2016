package by.it.daylidovich.JD01_12.A.task3;

import java.util.Comparator;

public class Comp implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 >= 0 && o2 < 0)
            return -1;
        else if (o1 < 0 && o2 >= 0)
            return 1;
        else return 0;
    }
}
