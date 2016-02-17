package by.it.predkel.JD06String.LevelA;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Нахождение слов в строке начинающиеся и заканчивабщиеся на гласную
 */
public class VowelsBeginEnd {
    public static void vowelsBeginEnd(String str) {
        String[] wordArray = str.split("[\\s,.:!?]+");
        Pattern pat = Pattern.compile("^[аоэиуыеёюя].*[аоэиуыеёюя]$");
        for (String word : wordArray) {
            Matcher mat = pat.matcher(word);
            if (mat.find()) {
                System.out.println(word);
            }
        }
    }
}





