package by.it.chetovich.JD01_02_04;

import java.util.Arrays;

/**
 * Created by user_2 on 05.02.2016.
 */
public class C5SubtractLinesRowsWithMax {
    public void createMatrixWithoutMax (int [][] array){
        int max = searchMax(array);
        System.out.println("max "+ max);
        // calculate how many rows there are in the new array
        int newArrRowsQuantity = 0;
        for (int i = 0; i < array.length; i++) {
           if (!checkMaxInRow(array[i], max)) newArrRowsQuantity++;
        }
        // calculate how many columns there are in the new array
        int newArrColsQuantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (!checkMaxInCols(array, max, i)) newArrColsQuantity++;
        }

        System.out.println("New array dimensions: "+newArrRowsQuantity+", "+newArrColsQuantity);

// create new array
        int [][] newArr = new int[newArrRowsQuantity][newArrColsQuantity];
        int newRow=0;
        int newCol=0;

// check every element, if its row or column contains max element, if not - copy it to a new array
        for (int i = 0; i < array.length; i++) {
            if(!checkMaxInRow(array[i],max)) {
                for (int j = 0; j < array[i].length; j++) {
                    if(!checkMaxInCols(array,max,j)){
                        if (newCol<=newArrColsQuantity-1) {
                            newArr[newRow][newCol] = array[i][j];
                            newCol++;
                        }
                        else {
                            newCol=0;
                            newRow++;
                            newArr[newRow][newCol] = array[i][j];
                            newCol++;
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(newArr));
    }

    private int searchMax(int [][]array){
        int max=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (max<array[i][j]) max = array[i][j];
            }
        }
        return max;
    }


    private boolean checkMaxInRow (int [] array, int max){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==max) return true;
        }
        return false;
    }

    private boolean checkMaxInCols (int [][] array, int max, int i){
            for (int j = 0; j < array.length; j++) {
                if (array[j][i]==max) return true;
            }
        return false;
    }

}
