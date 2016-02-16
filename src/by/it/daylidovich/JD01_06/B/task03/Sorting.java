package by.it.daylidovich.JD01_06.B.task03;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sorting {
    public static int countChar(String st, char symbol){
        String regex = "[" + symbol + "]";
        Matcher matcher = Pattern.compile(regex).matcher(st);
        int count = 0;
        while (matcher.find())
            count++;
        return count;
    }

    public static String[] createArrayOfWord(String st){
        Matcher matcher = Pattern.compile("[А-яёЁ]+").matcher(st);
        ArrayList<String> arrayList = new ArrayList<>();
        while (matcher.find()){
            arrayList.add(matcher.group());
        }

        String[] array = new String[arrayList.size()];
        for (int i = 0; i < array.length; i++)
            array[i] = arrayList.get(i).trim();
        return array;
    }

    public static String[] sortText(String[]  array, char symbol){

        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (countChar(array[j], symbol) > countChar(array[j+1], symbol))
                {
                    String st = array[j];
                    array[j] = array[j+1];
                    array[j+1] = st;
                }
            }
        }

        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (countChar(array[j], symbol) == countChar(array[j+1], symbol) && array[j].compareTo(array[j+1]) > 0)
                {
                    String st = array[j];
                    array[j] = array[j+1];
                    array[j+1] = st;
                }
            }
        }
        return array;
    }
}
