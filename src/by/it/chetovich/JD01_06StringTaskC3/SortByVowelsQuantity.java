package by.it.chetovich.JD01_06StringTaskC3;
import by.it.chetovich.JD01_06String.B3SortingWords;

/**
 * @author Yultos_
 * sorts the words in the array that have equal length by vowels quantity
 */
public class SortByVowelsQuantity {
    public static String[] sortByVowelsQuantity (String [] array){
        String regex = "[яиюыаоэуеё]";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                int vow1 = B3SortingWords.countMatches(array[j],regex);
                int vow2 = B3SortingWords.countMatches(array[j+1],regex);
                if (array[j].length()==array[j+1].length()){
                    if (vow1>vow2){
                        String temp = array[j];
                        array[j] = array [j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }
        for (String s : array) {
            System.out.println(s);
        }
        return array;

    }
}
