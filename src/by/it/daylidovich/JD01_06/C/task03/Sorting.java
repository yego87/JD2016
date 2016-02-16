package by.it.daylidovich.JD01_06.C.task03;

import java.util.Arrays;

public class Sorting {
    public static String[] sortedByLength(String[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (Utils.selectionWord(array[j]).length() < Utils.selectionWord(array[j+ 1]).length())
                {
                    String x = array[j];
                    array[j] = array[j+1];
                    array[j+1] = x;
                }
            }
        }
        return array;
    }

    public static String[] sortedByVowels(String[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (Utils.countVowels(array[j]) > Utils.countVowels(array[j + 1]) && Utils.selectionWord(array[j]).length() == Utils.selectionWord(array[j+ 1]).length())
                {
                    String x = array[j];
                    array[j] = array[j+1];
                    array[j+1] = x;
                }
            }
        }
        return array;
    }

    public static String[] countEquals(String[] arrayIn){

        String[] array = Utils.copyArray(arrayIn);

        int count = 1;
        int countNull = 0;
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].equals(array[i+1]))
            {
                count++;
                countNull++;
                array[i] = null;
            }
            else if (1 != count)
                 {
                     array[i] += " " + count;
                     count = 1;
                 }
        }

        String[] arrayOut = new String[arrayIn.length - countNull];
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null){
                arrayOut[n] = array[i];
                n++;
            }
        }
        return arrayOut;
    }
}
