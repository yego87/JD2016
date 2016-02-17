package by.it.chetovich.JD01_06String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * deletes all words that start with consonant and contain 5 letters
 */
public class B1DeletingConsonantWords {
    public void deleteWordsStartConsonant(StringBuilder s){
        Pattern pat = Pattern.compile("\\s[чсмтбждлрпвфйцкнгшщзх][а-яА-ЯёЁ]{4}\\b", Pattern.CASE_INSENSITIVE);
        String [] array = pat.split(s);
        for (String s1 : array) {
            System.out.print(s1);
        }
    }
}
