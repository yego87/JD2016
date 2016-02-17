package by.it.chetovich.JD01_06StringTaskC3;

import by.it.chetovich.JD01_06String.B3SortingWords;

/**
 * sorts alphabetically, i'll help to group equal words further
 */
public class AlphabeticSortIfEqualVowels {
    public static String [] alphabeticSort (String [] array){
        String regex = "[яиюыаоэуеё]";

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                int vow1 = B3SortingWords.countMatches(array[j], regex);
                int vow2 = B3SortingWords.countMatches(array[j+1],regex);
                if (vow1==vow2&&array[j].length()==array[j+1].length()){
                    if (array[j].charAt(0)>array[j+1].charAt(0)){
                        String temp = array[j];
                        array[j] = array [j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }
        return array;
    }
}
