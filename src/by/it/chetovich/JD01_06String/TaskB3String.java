package by.it.chetovich.JD01_06String;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * sorts words by the quantity of predefined letter
 */
public class TaskB3String {
    public void sortWordsByLetter (StringBuilder s, String symbol){
        Pattern pat = Pattern.compile("[^а-яА-ЯёЁ]+");
        String [] array = pat.split(s);
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (countMatches(array[j])<countMatches(array[j+1])){
                    String temp = array[j];
                    array[j] = array [j+1];
                    array[j+1] = temp;
                }


            }

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (countMatches(array[j])==countMatches(array[j+1])){
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

    private int countMatches (String  s){
        int count = 0;
        Pattern pat = Pattern.compile("м");
        Matcher mat = pat.matcher(s);
        while (mat.find()) count++;
        return count;
    }

}
