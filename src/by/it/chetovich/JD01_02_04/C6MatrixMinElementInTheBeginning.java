package by.it.chetovich.JD01_02_04;

/**
 * Created by Yultos_ on 07.02.2016.
 */
public class C6MatrixMinElementInTheBeginning {
    public int [][] moveMinElement  (int [][] array){
        int rowPosition = (searchMinElement(array))[0];
        int colPosition = (searchMinElement(array))[1];
        if (rowPosition!=0){
            for (int j = 0; j < array.length; j++) {
                int x = array[0][j];
                array[0][j] = array [rowPosition][j];
                array [rowPosition][j] = x;
            }
        }
        if (colPosition!=0){
            for (int i = 0; i < array.length; i++) {
                int x = array[i][0];
                array[i][0] = array [i][colPosition];
                array [i][colPosition] = x;
            }
        }
        return array;

    }
    private int [] searchMinElement (int [][] array){
        int min = array[0][0];
        int rowPosition =0;
        int colPosition =0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j]<min){
                    min=array[i][j];
                    rowPosition = i;
                    colPosition = j;

                }
            }
        }
        int [] minPositions = {rowPosition,colPosition};
        return minPositions;
    }
}
