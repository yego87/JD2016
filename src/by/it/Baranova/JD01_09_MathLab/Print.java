package by.it.Baranova.JD01_09_MathLab;


import by.it.Baranova.JD01_09_MathLab.vars.VarImpl;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Ekaterina on 2/26/16.
 */
public class Print {

    public static void printvar (Map <String,VarImpl> hashMap){
        if (!hashMap.isEmpty()) {
            for (Map.Entry<String,VarImpl> pair: hashMap.entrySet())
                System.out.println(pair.getKey()+"="+pair.getValue());
        }
        else System.out.println("Список пуст.");
    }

    public static void sortvar (TreeMap<String,VarImpl> treeMap) {
        if (!treeMap.isEmpty()) {
            for (Map.Entry<String, VarImpl> pair:treeMap.entrySet())
                System.out.println(pair.getKey()+"="+pair.getValue());
        }
        else System.out.println("Список пуст.");

    }
}
