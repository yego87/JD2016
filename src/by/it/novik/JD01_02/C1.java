package by.it.novik.JD01_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class C1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.print("Please, print a number >");

        String rLine = bufferedReader.readLine();
       // String rLine ="5 15 896";
        bufferedReader.close();
        int n = Integer.valueOf(rLine);

        int[][] matrix = generateMatrix(n);

        printMatrix(matrix);

        System.out.println("sum is " + computeSum(matrix));
    }

    public static int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = generateNumber(n);
            }
        }

        return matrix;
    }

    public static int generateNumber(int max) {
        return (int)(Math.random() * 2 * max) - max;
    }

    public static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }

            System.out.println("");
        }
    }

    public static int computeSum(int[][] matrix) {
        int sum = 0;

        boolean isFirstPositiveMet = false;

        for(int[] row : matrix) {
            for (int el : row) {
                if (isFirstPositiveMet) {
                    sum += el;

                    if (el > 0) {
                        sum -= el;
                        isFirstPositiveMet = false;

                        break;
                    }
                }

                if (el > 0) {
                    isFirstPositiveMet = true;
                }
            }
        }

        return sum;
    }


}
