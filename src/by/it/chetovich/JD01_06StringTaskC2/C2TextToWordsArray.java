package by.it.chetovich.JD01_06StringTaskC2;

import java.util.regex.Pattern;

/**
 * @author Yultos_
 * creates an array containing all words of the text in lower case
 */
public class C2TextToWordsArray {
    /**
     *
     * @param text from main that we want to divide by words and put them into an array
     * @return array containing all words from the text
     */
    public static String [] createWordsArrayFromText (StringBuilder text){
        Pattern pat = Pattern.compile("[^а-яА-ЯёЁ]+", Pattern.CASE_INSENSITIVE);
        return pat.split(text.toString().toLowerCase());
    }
}
