package by.it.predkel.MatLab.Utils;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Admin on 16.03.2016.
 */
public class Recursion {
    static Pattern littleBracket=Pattern.compile("([\\(](\\w+)\\s?[\\+\\-\\*/]\\s?(\\w+)[\\)])");
    static Pattern anyBracket=Pattern.compile("[\\(].*[\\)]");

    public static void preparationForRerecurs(StringBuilder str) throws IOException {
        if(checkString(str)){
            realRecurs(str);
        }
        System.out.println(str);
    }
    private static boolean checkString(StringBuilder str){
        Matcher mat=anyBracket.matcher(str);
        return mat.matches();
    }
    private static StringBuilder realRecurs(StringBuilder str) throws IOException {
      //  str.deleteCharAt(0);str.deleteCharAt(str.length());
        Matcher mat=anyBracket.matcher(str);
        if (mat.matches()){
            str.insert(0," ");
            int k = str.indexOf(mat.group());
            str.delete(k+1,k+mat.group().length());
            str.insert(k,realRecurs((new StringBuilder(mat.group())).deleteCharAt(0).deleteCharAt(str.length()-1)));
        }else {
            CalculationClass.input(str.toString());
        }
        return null;
    }
    private void operations(String str){

    }
}
