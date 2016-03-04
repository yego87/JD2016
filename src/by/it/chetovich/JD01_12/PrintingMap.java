package by.it.chetovich.JD01_12;

import java.util.Map;

/**
 * Created by user_2 on 26.02.2016.
 */
public class PrintingMap {

    public static void printMap(Map<?, ?> map){

        for (Map.Entry<?, ?> entry : map.entrySet()) {

            System.out.println(entry.getKey()+" "+entry.getValue());

        }
}
}
