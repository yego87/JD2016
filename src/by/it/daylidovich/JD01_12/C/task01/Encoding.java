package by.it.daylidovich.JD01_12.C.task01;

import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Encoding {
    public static TreeMap<Integer,String> createC1(String string){
        Matcher mat = Pattern.compile("[А-яёЁ]+").matcher(string);
        TreeMap<Integer, String> map = new TreeMap<>();
        int n = 0;
        while (mat.find()){
            n++;
            String st =mat.group();
            map.put(n,st);
        }
        return map;
    }

    public static TreeMap<Integer, String> squeezeC1(TreeMap<Integer, String> map){
        TreeMap<Integer, String> mapOut = new TreeMap<>();
        for (Map.Entry pair: map.entrySet())
            if (!mapOut.containsValue(pair.getValue()))
                mapOut.put((Integer)pair.getKey(),(String)pair.getValue());
        return mapOut;
    }

    public static void printCod(TreeMap<Integer, String> map){
        for (Map.Entry pair: map.entrySet())
            System.out.println(pair.getValue() + "-" + pair.getKey());
    }
}
