package by.it.chetovich.JD01_06String;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Change letters 5 and 7 in every word
 */
public class A1ChangingLetters {
    public void changeLiterals(StringBuilder s) {

        Pattern pat = Pattern.compile("[а-яА-ЯёЁ]{5,}");
        Matcher mat = pat.matcher(s);
        while (mat.find()){
            s.setCharAt(mat.start()+4,'#');
            if (mat.end()-mat.start()>7) s.setCharAt(mat.start()+6,'#');
        }
        System.out.println(s);
    }
}




