package by.it.chetovich.JD01_09;

import java.util.*;

/**
 * prints the list of new variables
 */
public class PrintAssignment {

    public static void printSortVar(String line, Map<String, Var> map, List<String> list){
        if (line.equals("printvar")){
            if (!map.isEmpty()) {
                for (String s : map.keySet()) {
                    System.out.println(s);
                }
            }
            else System.out.println("Список пуст.");
        }
        if (line.equals("sortvar")){
            if (!map.isEmpty()) {
                Collections.sort(list);
                for (String s : list) {
                    System.out.println(s + " = " + map.get(s));
                }
            }
            else System.out.println("Список пуст.");
        }
    }
}
