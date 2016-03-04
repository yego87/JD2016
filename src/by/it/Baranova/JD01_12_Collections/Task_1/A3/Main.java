package by.it.Baranova.JD01_12_Collections.Task_1.A3;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Ekaterina on 3/2/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Integer[] mA = {5, 6, 23, -3, 98, 3, 5, 89, 45, -4};
        List<Integer> sortReverse= Arrays.asList(mA);
        System.out.println("Коллекция до преобразования "+sortReverse);
        Collections.sort(sortReverse, new NewComparator());
        System.out.println("Коллекция до преобразования "+sortReverse);
    }
}
