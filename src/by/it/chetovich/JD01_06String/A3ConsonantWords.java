package by.it.chetovich.JD01_06String;

import javax.swing.text.MutableAttributeSet;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Calculates words that start and end with consonant letter
 */
public class A3ConsonantWords {
    public void calcWordsWithConsonant (StringBuilder s){
        Pattern pat = Pattern.compile("[^а-яА-ЯёЁ]");
        String [] array = pat.split(s);

        Pattern pat1 = Pattern.compile("[чсмтбждлрпвфйцкнгшщзх]([а-яА-ЯЁё]+)?[чсмтбждлрпвфйцкнгшщзх]",Pattern.CASE_INSENSITIVE);
        int count = 0;
        for (String s1 : array) {
            Matcher mat = pat1.matcher(s1);
            if (mat.matches()) {
                count++;
                System.out.println(s1);
            }
        }
        System.out.println("Words that start and end with a consonant letter: "+count);
    }
}
