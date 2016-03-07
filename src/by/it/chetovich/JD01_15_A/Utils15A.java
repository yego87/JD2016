package by.it.chetovich.JD01_15_A;

import java.io.PrintWriter;
import java.util.Random;

/**
 * @author Yultos_
 */
public class Utils15A {

    /**
     *
     * @param n matrix length
     * @return matrix with [n][n] elements
     */
    public static int [][] createMatrix (int n ){

        Random rand = new Random();
        int [][] array = new int [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = rand.nextInt(31)-15;
            }
        }
        return array;
    }


    /**
     *
     * @param matrix matrix to be printed on console
     */
    public static void printMatrixToConsole (int [][] matrix){

        for (int[] a : matrix) {
            for (int b : a) {
                System.out.printf("%3d ",b );
            }
            System.out.println();
        }

    }


    /**
     *
     * @param matrix matrix to be printed on console
     * @param print PrintWriter to print matrix to a file
     */
    public static void printMatrixToFile (int [][] matrix, PrintWriter print){

        for (int[] a : matrix) {
            for (int b : a) {
                print.printf("%3d ",b );
            }
            print.println();
        }
    }

}
