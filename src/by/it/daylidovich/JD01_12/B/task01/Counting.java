package by.it.daylidovich.JD01_12.B.task01;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Counting  {
    public static void countingWord(String stIn){
        String regex = "[\\w]+";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(stIn);
        HashMap<String, Integer> map = new HashMap<>();
        while (mat.find()){
            String st =mat.group();
            map.put(st , map.getOrDefault(st, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println("\"" + entry.getKey() + "\" встречается " + entry.getValue() + " раз.");
        }
    }
}
