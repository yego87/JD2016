package by.it.chetovich.CheckBracesForMatlab;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * check
 */
public class CheckBraces {


    public static void searcPattern (){

        /*
        Map<String, String> map = new HashMap<>();
        StringBuilder s = new StringBuilder("(5+4*(2+3))/[2-1]");*/

        //String innerEx = "([\\w+\\-*/=.]+)";
        //String bracesEx = "[\\(]"+innerEx+"[\\)]|[\\[]"+innerEx+"[\\]]";
        //Pattern pat = Pattern.compile("[\\(]([\\w\\+\\-\\*\\/\\=]+)[\\)]|[\\[](\\1)[\\]]");
        /*Pattern pat = Pattern.compile(bracesEx);
        int i = 0;
        while (pat.matcher(s).find()){
            Matcher mat = pat.matcher(s);
            String group = pat.matcher(s).group();
            System.out.println(group);
            map.put("b"+i,group);
            i++;
            s.replace(mat.start(),mat.end(),"b"+i);
            mat.reset();
        }
        */
    }

    public static StringBuilder findMatch (StringBuilder s, String bracesEx, Pattern pat, int i, Matcher mat, Map<String, String>map){

        while (mat.find()){
            String group = mat.group();
            System.out.println(group);
            map.put("b"+i,group);
        }
        return s;
    }
}
