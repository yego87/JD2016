package by.it.daylidovich.JD01_04.SLAY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InOut {
    public static String ReadLine() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String rLine = reader.readLine();
        return rLine;
    }
    public static double[] ConvertToDoubleArray(String s){
        s.trim();
        String[] st = s.split(" ");
        double[] array = new double[st.length];
        for (int i = 0; i < st.length; i++) {
            array[i] = Double.parseDouble(st[i]);
        }
        return array;
    }
    public static double[][] EnterMatrix() throws IOException {
        boolean isEmpty = false;
        double[][] matrix = new double[50][50];
        int n = 0;
        while (!isEmpty){
            String st = ReadLine();
            if (st.equals(""))
                isEmpty = true;
            else{
                double[] array = ConvertToDoubleArray(st);
                for (int i = 0; i < array.length; i++) {
                    matrix[n][i] = array[i];
                }
                n++;
            }
        }

        double[][] matrixOut = new double[n][n];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                matrixOut[i][j] = matrix[i][j];
            }
        }

        return matrixOut;
    }
    public static double[] EnterArray() throws IOException {
        String st = ReadLine();
        return ConvertToDoubleArray(st);
    }
    public static void PrintArray(double[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%-4.2f   ", array[i]);
        }
        System.out.println();
    }
    public static void PrintMatrix(double[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%-4.2f   ", array[i][j]);
            }
            System.out.println();
        }
    }
}
