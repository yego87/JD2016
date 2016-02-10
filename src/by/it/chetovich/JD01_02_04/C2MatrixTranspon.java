package by.it.chetovich.JD01_02_04;

import java.util.Arrays;

/**
 * Created by Yultos_ on 04.02.2016.
 */
public class C2MatrixTranspon {
    public int [][] transponMatrix (int [][]array){
        int [][] transponArr = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                transponArr[i][j] = array[j][i];
            }

        }
        return transponArr;
    }
}
