package by.it.chetovich.JD01_06StringTaskC3;

/**
 * @author Yultos_
 * sort the array by the length of its elements
 */
public class SortWordsByLength {
    public static String [] sortWordsByLength(String [] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j].length()<array[j+1].length()){
                    String temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (String s : array) {
            System.out.println(s);
        }
        return array;
    }

}
