package by.it.chetovich.JD01_12;

import java.util.Map;

/**
 * prints map
 */
public class PrintingMap {

    public static void printMap(Map<?, ?> map){

        for (Map.Entry<?, ?> entry : map.entrySet()) {

            System.out.println(entry.getKey()+" "+entry.getValue());

        }
}
}
