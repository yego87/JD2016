package by.it.predkel.JD12Collections;

import java.util.*;

/**
 * Created by Admin on 01.03.2016.
 */
public class MyTreeMap {
    public static void treeMap() {
        TreeMap<String, String> treemap = new TreeMap<>();

        // Добавляем ключи и значения в treemap

        treemap.put("Key2", "Item4");
        treemap.put("Key1", "Item5");
        treemap.put("Key3", "Item3");
        treemap.put("Key5", "Item1");
        treemap.put("Key4", "Item2");
        // использую класс set для обращения к ключу и значению как к одному целому
        Set set = treemap.entrySet();
        // и итератор для простого прохода по всем элементам дерева
        Iterator it = set.iterator();

  /*      List<Map.Entry<String, String>> entryList = new ArrayList<>( treemap.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });*/
        while (it.hasNext()) {
            Map.Entry me = (Map.Entry) it.next();
            System.out.println(me);//в treemap-е все повторяющиеся ключи переписываются
        }
    }
}
