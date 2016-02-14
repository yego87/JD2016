package by.it.predkel.JD06String.LevelB;

import java.nio.Buffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * длина 5 начинается на согласную..косяк
 */
public class Consonant5Len {
    public static void сonsonant5Len(String str) {
        String[] wordArray = str.split("[\\s,.:!?]+");
        StringBuffer strB=new StringBuffer(str);
        Pattern pat = Pattern.compile("([йцкнгшщзхфвпрлджсмтб][а-яА-яёЁ]{4})");
        for (String word : wordArray) {
            Matcher mat = pat.matcher(word);
            if (mat.find()) {
                strB.delete(mat.start(),mat.end());
            }
        }
        System.out.print(strB);
    }
}