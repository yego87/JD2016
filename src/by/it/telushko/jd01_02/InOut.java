package by.it.telushko.jd01_02;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InOut {

    public static String[] consoleReadLine() throws IOException {
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        String rLine = bufferedReader.readLine();
        String[] val;
        val=rLine.split(" ");
        return val;
    }
    public static String consoleLineInput() {
        Scanner inLine = new Scanner(System.in);
        String a = inLine.nextLine();//строку(букву), соответствующую заданию
        return a;
    }
    public static int consoleIntInput() {
        Scanner inStr = new Scanner(System.in);
        int b = inStr.nextInt();//считываем число, соответствующее заданию
        return b;
    }
    public static double consoleDoubleInput() {
        Scanner inStr = new Scanner(System.in);
        double b = inStr.nextDouble();//считываем число, соответствующее заданию
        return b;
    }
    public static int[] strToInt(String[] val){
        int[] v = new int[val.length];
        int i=0;
        for(String s:val){
            v[i]=Integer.valueOf(s);
            i++;
        }
        return v;
    }
    public static void printMatrix(int[][] matrix, int size){
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size ; j++) {

                System.out.printf("%3d",matrix[i][j]);
            }
            System.out.println("");
        }
    }
    public static void printMatrix(int[][] matrix, int sizeI,int sizeJ){
        for (int i = 0; i <sizeI ; i++) {
            for (int j = 0; j <sizeJ ; j++) {
                System.out.printf("%3d",matrix[i][j]);
            }
            System.out.println("");
        }
    }
}




