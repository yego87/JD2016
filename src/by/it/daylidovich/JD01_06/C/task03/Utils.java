package by.it.daylidovich.JD01_06.C.task03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
    public static int countVowels(String st){
        Matcher matcher = Pattern.compile("[УуЕеЁёЫыАаОоЭэЯяИиЮю]").matcher(st);
        int count = 0;
        while (matcher.find())
            count++;

        return count;
    }

    public static String[] copyArray(String[] arrayIn){
        String[] array = new String[arrayIn.length];
        for (int i = 0; i < arrayIn.length; i++) {
            array[i] = arrayIn[i];
        }
        return array;
    }

    public static String selectionWord(String string){
        Matcher matcher = Pattern.compile("[А-яЁё]+").matcher(string);
        String s = new String();
        while (matcher.find())
            s = matcher.group();
        return s;
    }
}
