package by.it.daylidovich.JD01_05_v8.B.task06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utils {
    public static double ReadNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String rLine = reader.readLine();
        rLine.trim();
        return Double.parseDouble(rLine);
    }
    public static void PrintArray(double[] array, String name){
        int n =1;
        for (int i=0; i<array.length; i++){
            System.out.printf(name+"[%-1d]=%-5.2f  ",i,array[i]);
            n++;
            if (n>10){
                System.out.println();
                n = 1;
            }
        }
        System.out.println();
    }
    public static double[] CreateArray(double p1, double p2, double dp){
        int n = (int) ((p2-p1)/dp)+1;
        double[] array = new double[n];
        int i = 0;
        for (double k=p1; k<p2+dp; k+=dp){
            array[i] = Math.cos(k/2);
            i++;
        }
        return array;
    }
    public static double MultiplicationArray(double[] array){
        double pr = 1;
        for (int i = 0; i < array.length; i++) {
            pr*=array[i];
        }
        return pr;
    }
    public static double[] MinusArray(double[] arrayIn){
        double[] array = new double[arrayIn.length];
        int n = 0;
        for (int i = 0; i < arrayIn.length; i++) {
            if(0>arrayIn[i] && 0 != i%2){
                array[n] = arrayIn[i];
                n++;
            }
        }
        double[] arrayOut = new double[n];
        for (int i = 0; i < n; i++) {
            arrayOut[i] = array[i];
        }
        if (n==0)
            System.out.println("В массиве нет отрицательных элементов.");
        else{
            System.out.println("Массив отрицательных элементов.");
            PrintArray(arrayOut,"MinusM");
        }
        return arrayOut;
    }
}
