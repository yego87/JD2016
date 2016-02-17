package by.it.chetovich.JD01_06String;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * sorts words by the quantity of predefined letter
 */
public class B3SortingWords {
    public void sortWordsByLetter (StringBuilder s, String symbol){
        Pattern pat = Pattern.compile("[^а-яА-ЯёЁ]+");
        String [] array = pat.split(s.toString().toLowerCase());
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (countMatches(array[j],symbol)<countMatches(array[j+1],symbol)){
                    String temp = array[j];
                    array[j] = array [j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (countMatches(array[j],symbol)==countMatches(array[j+1],symbol)){
                    if (array[j].charAt(0)>array[j+1].charAt(0)){
                        String temp = array[j];
                        array[j] = array [j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static int countMatches (String  s, String symbol){
        int count = 0;
        Pattern pat = Pattern.compile(symbol);
        Matcher mat = pat.matcher(s);
        while (mat.find()) count++;
        return count;
    }

}
