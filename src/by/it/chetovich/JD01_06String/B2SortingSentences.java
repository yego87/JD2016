package by.it.chetovich.JD01_06String;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * sorts sentences by words quantity
 */
public class B2SortingSentences {
    public static void sortTextBySentences (String s){
        Pattern pat = Pattern.compile("[а-яА-ЯёЁ\\s,:;\\-0-9]+(ит.п.т.д.\\s)*?[\\.!?]");
        Matcher mat = pat.matcher(s);
        int count = 0;
        while (mat.find()) count++; //s4itaem koli4estvo vhozhdeniy, eto budet dlina massiva
        mat.reset();
        String [] array = new String[count];
        int i = 0;
        while (mat.find()){ //zapolnaem masssiv
            array[i] = mat.group();
            i++;
        }
        System.out.println(count);

        /*for (String s1 : array) {
            s1 = s1.trim();
        }*/
        for (int j = 0; j < array.length; j++) {
            array[j] = array[j].trim();
        }

        for (int k = 0; k < array.length; k++) {
            for (int j = 0; j < array.length-1; j++) {
                int lineLength1 = splitString(array[j],"[\\s,;:\\-]+").length; //razdelaem stroku na massiv slov,
                int lineLength2 = splitString(array[j+1],"[\\s,;:\\-]+").length;
                if (lineLength1>lineLength2){
                    String temp = array[j];
                    array[j] = array [j+1];
                    array[j+1] = temp;
                }
            }
        }

        for (String s1 : array) {
            System.out.println(s1);
        }
    }

    private static String[] splitString (String s, String regex){
        Pattern pat = Pattern.compile(regex);
        return pat.split(s);

    }
}