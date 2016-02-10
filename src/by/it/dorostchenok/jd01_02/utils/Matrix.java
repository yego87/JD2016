package by.it.dorostchenok.jd01_02.utils;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;

public class Matrix {

    public static void printMatrix(double[][] matrix){
        for(double[] row : matrix){
            System.out.println(Arrays.toString(row));
        }
    }

    /**
     * Generate matrix with size matrixSize and fill it with random values from
     * -matrixSize to matrixSize
     * @param matrixSize size of matrix to generate
     * @return generated matrix double[][] with size matrixSize
     */
    public static double[][] generateMatrix(int matrixSize){

        double[][] matrix = new double[matrixSize][matrixSize];
        Random random = new Random(Calendar.getInstance().getTimeInMillis());
        for(int i = 0; i < matrixSize; i++){
            for(int j = 0; j < matrixSize; j++){
                int randInt = random.nextInt() % matrixSize + 1;
                if(random.nextInt() > 0){
                    randInt *= 1;
                }
                else {
                    randInt *= -1;
                }
                matrix[i][j] = randInt;
            }
        }
        return matrix;
    }

    /**
     *
     * @param matrix matrix to find max element for
     * @return max element of matrix
     */
    public static double getMaxElement(double[][] matrix){
        double maxElement = Double.MIN_VALUE;
        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix[row].length; col++){
                if (matrix[row][col] > maxElement){
                    maxElement = matrix[row][col];
                }
            }
        }
        return maxElement;
    }

    /**
     *
     * @param row row index to delete
     * @param column column index to delete
     * @param matrix matrix for delete row/column
     * @return matrix without row and column specified in params row, column
     */
    public static double[][] removeRowColumn(int row, int column, double[][] matrix){
        //System.out.println("row: "+ row + " col: " + column);
        double[][] cutedMatrix = new double[matrix.length - 1][matrix.length - 1];
        for (int row1 = 0, row2 = 0; row1 < matrix.length; row1++, row2++){
            if (row1 == row){
                //row1++;
                row2--;
                continue;
            }
            for (int col1 = 0, col2 = 0; col1 < matrix.length; col1++, col2++){
                if (col1 == column){
                    if (col1 == matrix.length - 1) continue;
                    col1++;
                }
                cutedMatrix[row2][col2] = matrix[row1][col1];
            }
        }
        return cutedMatrix;
    }
}
