package by.it.predkel.MatLab.Utils;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Admin on 16.03.2016.
 */
public class Recursion {
    static Pattern littleBracket=Pattern.compile("([\\(](\\w+)\\s?[\\+\\-\\*/]\\s?(\\w+)[\\)])");
    static Pattern anyBracket=Pattern.compile("[(].*[)]");

    public static void preparationForRerecurs(StringBuilder str) throws IOException {
            //realRecurs(str);
        System.out.println(str);
    }
    public static StringBuilder realRecurs(StringBuilder str) throws IOException {

        Matcher mat=anyBracket.matcher(str);
        if (mat.find()){
            int start =mat.start();
            int end =mat.end();
            String tmp=mat.group();
            StringBuilder sb=(new StringBuilder(tmp).deleteCharAt(tmp.length() - 1).deleteCharAt(0));
            str.delete(start,end);
            str.insert(start,realRecurs(sb));
        }
        if (str.toString().trim().split(" ").length<2){
            return str;
        }
        return new StringBuilder(CalculationClass.input(str.toString()));
    }
}
