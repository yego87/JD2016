package by.it.Baranova.JD01_12_Collections;

import java.util.Map;
import java.util.regex.Pattern;

/**
 * Created by Ekaterina on 2/28/16.
 */
public class Utils {
    /**
     * Перевод  строки в массив
     * @param sb
     * @return
     */
    public static String[] StringToArray(String sb){
        Pattern p1=Pattern.compile("[-,;:.!?()\\s]+");
        String [] words=p1.split(sb);
        return words;
    }

    /**
     * Вывод в консоль HashMap
     * @param hashMap
     */
    public static void printHashmap1 (Map<String,Integer> hashMap){
        if (!hashMap.isEmpty()) {
            for (Map.Entry<String,Integer> pair: hashMap.entrySet())
                System.out.println(pair.getKey()+"="+pair.getValue());
        }
        else System.out.println("Список пуст.");
    }

    /**
     * Вывод в консоль TreeMap
     * @param treeMap
     */
    public static void printTreemap (Map<Integer,String> treeMap){
        if (!treeMap.isEmpty()) {
            for (Map.Entry<Integer,String> pair: treeMap.entrySet())
                System.out.println(pair.getKey()+"="+pair.getValue()+"  ");
        }
        else System.out.println("Список пуст.");
    }

    /**
     * Вывод в консоль HashMap
     * @param hashMap
     */
    public static void printHashmap (Map<Integer,String> hashMap){
        if (!hashMap.isEmpty()) {
            for (Map.Entry<Integer,String> pair: hashMap.entrySet())
                System.out.println(pair.getKey()+"="+pair.getValue());
        }
        else System.out.println("Список пуст.");
    }
}
