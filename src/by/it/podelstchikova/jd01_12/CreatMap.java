package by.it.podelstchikova.jd01_12;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreatMap {
    public static Map<String , String> createMap (String s){
Map<String, String> map= new TreeMap<>();
        Pattern pat = Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher mat = pat.matcher(s);
        int i= 1;
        while (mat.find()){
            String key = Character.toString(mat.group().charAt(0))+i;
            map.put(key,mat.group());
            i++;
        }
        return map;
    }

    public static Map<String , String> sharMap(Map<String , String> map){

        Set <String> set = new LinkedHashSet<>(map.values());
        Map<String, String> mapShar= new TreeMap<>();
        for (String s : set) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (s.equals(entry.getValue())){ mapShar.put(entry.getKey(),s);
                break;}

            }
        }
        return mapShar;
    }
}
