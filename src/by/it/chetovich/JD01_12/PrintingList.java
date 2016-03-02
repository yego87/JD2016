package by.it.chetovich.JD01_12;

import java.util.Collection;
import java.util.List;

/**
 * Created by user_2 on 26.02.2016.
 */
public class PrintingList {

    public static void printList(Collection<?> list){

        for (Object o : list) {
            System.out.print(o+" ");
        }
        System.out.println();
    }
}
