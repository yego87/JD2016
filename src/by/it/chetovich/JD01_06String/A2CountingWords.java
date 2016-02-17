package by.it.chetovich.JD01_06String;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * counts how many times each word appears in the text
 */
public class A2CountingWords {
    public void CalculateWords(StringBuilder s) {

        Pattern pat = Pattern.compile("[а-яА-ЯёЁ]+");
        Pattern patAround = Pattern.compile("[^а-яА-ЯёЁ]");
        String[] array = patAround.split(s);
        Matcher mat = pat.matcher(s);

        Map<String, Integer> map = new HashMap<>();

        while (mat.find()) {
            int count = 0;
            for (String s1 : array) {
                if (s1.equalsIgnoreCase(mat.group())) count++;
            }
            map.put(mat.group().toLowerCase(), count);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
    

