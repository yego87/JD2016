package by.it.chetovich.JD01_02_04;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Yultos_ on 04.02.2016.
 */
public class C7MatrixZeroInTheEnd {
    public void putZerosInTheBack (int [][]array){
        for (int i = 0; i < array.length; i++) {
            sortByZero (array[i]);
        }
        System.out.println(Arrays.deepToString(array));
    }

    private int [] sortByZero (int [] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j]==0){
                    array[j]=array[j+1];
                    array[j+1]=0;
                }
            }
        }
        return array;
    }
}
