package by.it.chetovich.JD01_02_04;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Yultos_ on 03.02.2016.
 */
public class CMatrix {

    /**
     *
     * @param n
     * @return
     */
    public int [][] createMatrix(int n){
        int [][]array = new int [n][n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               array[i][j]=rand.nextInt(2*n+1)-n;
                System.out.printf("%5d", array[i][j]);
            }
            System.out.println();


        }
        //System.out.println(Arrays.deepToString(array));
        return array;


    }
}
