package by.it.chetovich.JD01_02_04;

import java.util.Arrays;

/**
 * Created by Yultos_ on 04.02.2016.
 */
public class C3Matrix90degree {
    public void turnMatrix (int [][]array){
        int [][] matrix90degree = new int [array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                matrix90degree [i][j] = array [array.length-i-1][array.length-j-1];
            }
        }
        System.out.println(Arrays.deepToString(matrix90degree));
    }
}
