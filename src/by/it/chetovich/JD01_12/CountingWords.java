package by.it.chetovich.JD01_12;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user_2 on 26.02.2016.
 */
public class CountingWords {

    public static Map<String, Integer> countWords(String text){

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
