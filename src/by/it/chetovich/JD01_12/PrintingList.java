package by.it.chetovich.JD01_12;

import java.util.Collection;
import java.util.List;

/**
 * print list
 */
public class PrintingList {

    public static void printList(Collection<?> list){

        for (Object o : list) {
            System.out.print(o+" ");
        }
        System.out.println();
    }
}
