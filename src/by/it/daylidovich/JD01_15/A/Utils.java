package by.it.daylidovich.JD01_15.A;

import java.io.*;

public class Utils {
    public static int[][] createMatrix(){
        int[][] matrix = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = (int)(Math.random()*30) - 15;
            }
        }
        return matrix;
    }

    public static void printMatrixToConsole(int[][] matrix){
        for (int[] aMatrix : matrix) {
            for (int anAMatrix : aMatrix) {
                System.out.printf("%3d ", anAMatrix);
            }
            System.out.println();
        }
    }

    public static void printMatrixToFile(int[][] matrix){
        try{
            PrintWriter printer = new PrintWriter(new FileWriter("src\\by\\it\\daylidovich\\JD01_15\\A\\matrix.txt"));
            for (int[] aMatrix : matrix) {
                for (int anAMatrix : aMatrix) {
                    printer.printf("%3d ", anAMatrix);
                }
                printer.println();
            }
            printer.close();
        } catch (IOException e) {
            System.out.println("Ошибка записи.");
        }
    }
}
