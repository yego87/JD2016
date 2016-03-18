package by.it.podelstchikova.jd01_12;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user_2 on 26.02.2016.
 */
public class PrintMap {

    public static void printMap(Map<?, ?> map){

        for (Map.Entry<?, ?> entry : map.entrySet()) {

            System.out.println(entry.getKey()+" "+entry.getValue());

        }
}
    public Map<String, Integer> countWords(String text){

        Map<String, Integer> map = new HashMap<>();
        Pattern pat = Pattern.compile("[a-zA-Z]+");
        Matcher mat = pat.matcher(text);
        while (mat.find()){
            String word = mat.group();
            if (map.containsKey(word)){
                int count = map.get(word);
                count++;
                map.put(word,count);
            }
            else map.put(word,1);
        }
        return map;
    }
}
