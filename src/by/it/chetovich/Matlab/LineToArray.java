package by.it.chetovich.Matlab;

import java.util.regex.Pattern;

/**
 * divides line into 2 elements and put them in the array
 */
public class LineToArray {
    /**
     *
     * @param s line to convert to array
     * @return array of 2 elements
     */

    public static String[] convertLineToArray(String s){

        Pattern pat = Pattern.compile(Patterns.operationType); //разбиваем на 2 переменных и  заносим их в массив
        String[] array = pat.split(s);
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].trim();
        }
        return array;
    }
}
