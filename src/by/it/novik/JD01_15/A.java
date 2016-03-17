package by.it.novik.JD01_15;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class A {
    public static void main(String[] args) {

        int[][] arr = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (Math.random() * 30) - 15;
            }
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++)
                System.out.printf("%3d%s",arr[i][j]," ");
            System.out.println("");
        }

        String way = System.getProperty("user.dir") + "/src/by/it/novik/";
        String filename = way + "/JD01_15/matrix.txt/";

        try (PrintWriter printWriter = new PrintWriter(new FileWriter(filename)))
        {
            arr = new int[4][4];

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = (int) (Math.random() * 30) - 15;
                }
            }


            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++)
                    printWriter.printf("%3d%s",arr[i][j]," ");
                    printWriter.println();
                System.out.println("");
            }
        }
        catch (IOException e) {
            System.out.println("Not found " + filename.toString());
        }
    }
}

