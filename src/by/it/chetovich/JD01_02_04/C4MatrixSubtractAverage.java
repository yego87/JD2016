package by.it.chetovich.JD01_02_04;

import java.util.Arrays;

/**
 * Created by Yultos_ on 04.02.2016.
 */
public class C4MatrixSubtractAverage {
    public void subtractAverage (int [][]array){
        int [][] newArr = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            int average = calculateAverage(array[i]);
            System.out.println("Average in the line "+(i+1)+": "+average);
            for (int j = 0; j < array.length; j++) {
                newArr[i][j] = array[i][j]-average;
            }
        }
        System.out.println(Arrays.deepToString(newArr));
    }

    private int calculateAverage (int [] array){
        int sum =0;
        int quantity = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
            quantity++;
        }
        return sum/quantity;
    }
}
