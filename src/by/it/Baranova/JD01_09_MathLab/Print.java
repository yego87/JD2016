package by.it.Baranova.JD01_09_MathLab;


import by.it.Baranova.JD01_09_MathLab.vars.VarImpl;

import java.util.Collections;
import java.util.List;
import java.util.Map;

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

    public static void sortvar (List<String> list,Map<String,VarImpl> hashMap) {
        if (!list.isEmpty()) {
            Collections.sort(list);
            for (String s:list)
                System.out.println(s+"="+hashMap.get(s));
        }
        else System.out.println("Список пуст.");

    }
}
