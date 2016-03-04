package by.it.Baranova.JD01_12_Collections.Task_1.A3;

import java.util.Comparator;

/**
 * Created by Ekaterina on 3/2/16.
 */
public class NewComparator implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2) {
            return -1;
        }
        if (o1 < o2) {
            return 1;
        }
        return 0;
    }
}
