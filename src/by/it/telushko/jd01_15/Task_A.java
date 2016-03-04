package by.it.telushko.jd01_15;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Task_A {
    public static void taskA1(int size, int start, int end) throws IOException {
        int[][] matrix=new int[size][size];
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size ; j++) {
                matrix[i][j]= (int)(Math.random()*(end-start)+start);
            }
        }

        System.out.println("Задание А-1");
        String src = System.getProperty("user.dir")+"/src/by/it/telushko/";
        String filename = src+"jd01_15/matrix.txt";
        System.out.println(filename);
        try(PrintWriter printer = new PrintWriter(new FileWriter(filename))){
            for (int i = 0; i <matrix.length ; i++) {
                for (int j = 0; j <matrix[i].length ; j++) {
                    printer.printf("%4d",matrix[i][j]);
                }
                printer.println();
            }

            printer.close();
            for (int i = 0; i <matrix.length ; i++) {
                for (int j = 0; j <matrix[i].length ; j++) {
                    System.out.printf("%4d",matrix[i][j]);
                }
                System.out.println("");
            }

        }
        catch (IOException e){
            throw new IOException("Ошибка файла"+filename,e);
        }
    }
}
