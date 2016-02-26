package by.it.chetovich.JD01_12;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * creates, sort and deletes duplicates in values
 */
public class CreatingMapWithCodes {
    /**
     *
     * @param s text containing objects, that should be placed into a map
     * @return map containing objects ant their codes
     */
    public static Map<String , String> createMap (String s){

        Map<String, String> map= new HashMap<>();
        Pattern pat = Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher mat = pat.matcher(s);
        int i= 1;
        while (mat.find()){
            //code is the first literal of the object plus index number
            String key = Character.toString(mat.group().charAt(0))+i;
            map.put(key,mat.group());
            i++;
        }
        return map;
    }

    /**
     *
     * @param map map with objects and their codes
     * @return sorted map where codes of the objects are sorted in ascending order
     */
    public static Map<String , String> sortMap (Map<String , String> map){

        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        Map<String, String> mapSorted= new LinkedHashMap<>();
        for (String s : list) {
            mapSorted.put(s, map.get(s));
        }
        return mapSorted;

    }

    /**
     *
     * @param map map with objects and their codes
     * @return map with unique objects and their codes in ascending order
     */
    public static Map<String , String> sharpenMap (Map<String , String> map){

        Set <String> set = new LinkedHashSet<>(map.values());
        Map<String, String> mapSharpened= new LinkedHashMap<>();
        for (String s : set) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (s.equals(entry.getValue())){ mapSharpened.put(entry.getKey(),s);
                break;}

            }
        }
        mapSharpened = sortMap(mapSharpened);
        return mapSharpened;
    }
}
