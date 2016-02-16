package by.it.daylidovich.JD01_06.A.task02;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Counting  {
    public static void countingWord(String stIn){
        String regex = "[А-яёЁ]+";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(stIn);
        HashMap<StringBuffer, Integer> map = new HashMap<>();
        while (mat.find()){
            String st =mat.group();
            boolean isIn = true;
            for (Map.Entry<StringBuffer, Integer> entry: map.entrySet())
            {
                if (st.contentEquals(entry.getKey())) {
                    entry.setValue(entry.getValue() + 1);
                    isIn = false;
                }
            }
            if (isIn)
                map.put(new StringBuffer(st), 1);
        }
        for (Map.Entry<StringBuffer, Integer> entry: map.entrySet()){
            System.out.println("\"" + entry.getKey() + "\" встречается " + entry.getValue() + " раз.");
        }
    }
}
