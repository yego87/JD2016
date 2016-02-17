package by.it.predkel.JD06String.LevelA;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Заменить 5ую и 7ую букву на #
 */
public class Insert5th7thLetter {
    public static String insert5th7thLetter(String str){
        StringBuilder strB=new StringBuilder(str);
        String regex="[а-яА-я]{5,}";
        Pattern pat=Pattern.compile(regex);
        Matcher mat=pat.matcher(strB);
        while (mat.find()){
            if (mat.end()-mat.start()>6){
                strB.setCharAt(mat.start()+6,'#');
            }
            strB.setCharAt(mat.start()+4,'#');
        }
        return strB.toString();
    }
}
