package by.it.predkel.JD06String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user_2 on 12.02.2016.
 */
public class SameWords {
    public static void insert5th7thLetter(String str){
        String regex="[а-яА-Я]";
        Pattern pat=Pattern.compile(regex);
        String[] strmass=str.split(regex);

    }
}
