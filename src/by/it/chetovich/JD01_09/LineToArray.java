package by.it.chetovich.JD01_09;

import java.util.regex.Pattern;

/**
 * Created by Yultos_ on 21.02.2016.
 */
public class LineToArray {

    public static String[] convertLineToArray(String s){

        Pattern pat = Pattern.compile("[\\+\\-\\/\\*]"); //разбиваем на 2 переменных и  заносим их в массив
        String[] array = pat.split(s);
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].trim();
        }
        return array;
    }
}
