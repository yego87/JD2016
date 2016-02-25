package by.it.chetovich.JD01_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * prints the list of new variables
 */
public class PrintAssignment {

    /**
     *
     * @param map список новых переменных и их значений
     * @param list список имен переменных, нужен для сортировки
     */
    public static void printSortVar(Map<String, Var> map, List<String> list) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();

        if (!line.isEmpty()) {

            if ("printvar".equals(line)) {
                if (!map.isEmpty()) {
                    for (String s : map.keySet()) {
                        System.out.println(s);
                    }
                } else System.out.println("Список пуст.");

            } else if ("sortvar".equals(line)) {
                if (!map.isEmpty()) {
                    Collections.sort(list);
                    for (String s : list) {
                        System.out.println(s + " = " + map.get(s));
                    }
                } else System.out.println("Список пуст.");

            } else {
                System.out.println("Что-то вы не то ввели, может попробуете ещё раз.");
                printSortVar(map, list);
            }
        }
    }
}
