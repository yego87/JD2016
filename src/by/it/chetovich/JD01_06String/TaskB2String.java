package by.it.chetovich.JD01_06String;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * sorts sentences by words quantity
 */
public class TaskB2String {
    public void sortTextBySentences (StringBuilder s){
        Pattern pat = Pattern.compile("[.!?] ?");


        String [] array = pat.split(s);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j].split(" ").length>array[j+1].split(" ").length){
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
}