package by.it.dorostchenok.jd01_02.tasks;

import by.it.dorostchenok.jd01_02.utils.Matrix;

import java.util.Arrays;

public class TaskC {

    //task1
    public void getSumOfELementsInPositiveRange(double[][] matrix){
        for (double[] row : matrix) {
            double sumOfElements = 0;
            boolean isFirstPositiveSet = false;
            int[] positiveIndexes = new int[2];
            for (int index = 0; index < row.length; index++){
                if(row[index] > 0){
                    if (!isFirstPositiveSet){
                        positiveIndexes[0] = index;
                        isFirstPositiveSet = true;
                    }else {
                        positiveIndexes[1] = index;
                        break;
                    }
                }
            }

            for (int i = positiveIndexes[0] + 1; i < positiveIndexes[1]; i++){
                sumOfElements += row[i];
            }
            System.out.println("Row: " + Arrays.toString(row) + " Sum: " + sumOfElements);
        }
    }

    /**
     * Implementation of Task 2 from Group C
     * @param matrix matrix to transpose
     * @return transposed matrix
     */
    public double[][] transposeMatrix(double[][] matrix){
        double[][] transposedMatrix = new double[matrix.length][matrix.length];
        for (int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix.length; col++){
                transposedMatrix[col][row] = matrix[row][col];
            }
        }
        return transposedMatrix;
    }

    /**
     * Implementation of Task 3 from Group C
     * @param matrix
     * @return
     */
    public double[][] turnMatrix(double[][] matrix){
        double[][] turnedMatrix = new double[matrix.length][matrix.length];
        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix.length; col++){
                turnedMatrix[matrix.length - 1 - col][row] = matrix[row][col];
            }
        }
        return turnedMatrix;
    }

    /**
     * Implementation of Task 4 from Group C
     * @param matrix
     * @return
     */
    public double[][] avgMatrix(double[][] matrix){
        double[][] avgMatrix = new double[matrix.length][matrix.length];
        for (int row = 0; row < matrix.length; row++){
            double rowSum = 0;
            for (int col = 0; col < matrix[row].length; col++){
                rowSum = rowSum + matrix[row][col];
            }

            for (int col = 0; col < matrix[row].length; col++){
                matrix[row][col] = matrix[row][col] - rowSum / matrix[row].length;
            }
        }
        return matrix;
    }

    /**
     * Implementation of Task 5 from Group C
     * @param matrix
     * @return
     */
    public double[][] deleteMaxRowsCols(double[][] matrix){
        double maxElement = Matrix.getMaxElement(matrix);
        double[][] newMatrix = matrix;

        while (maxElement == Matrix.getMaxElement(newMatrix)) {
            boolean stopLoop = false;
            for (int row = 0; row < newMatrix.length; row++){
                for (int col = 0; col < newMatrix[row].length; col++){
                    if (newMatrix[row][col] == maxElement){
                        newMatrix = Matrix.removeRowColumn(row, col, newMatrix);
                        stopLoop = true;
                        break;
                    }
                }
                if (stopLoop) break;
            }
        }
        return newMatrix;
    }
}
