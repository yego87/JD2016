package by.it.Baranova.JD01_15.A;

import by.it.Baranova.JD01_13_Exception.A.NegativeNumberException;

import java.io.*;

/**
 * Created by Ekaterina on 3/4/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String src = System.getProperty("user.dir") + "/src/by/it/Baranova/";
        String filename = src + "JD01_15/array.txt";
        File f = new File(filename);
        int[][] numbers = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                numbers[i][j] = (int) (Math.random() * 31 - 15);
            }
        }

        PrintWriter wr=null;
        try {
            wr=new PrintWriter(new FileWriter(f));
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    wr.printf("%3d ",numbers[i][j]);
                    System.out.printf("%3d ",numbers[i][j]);
                }
                System.out.println();
                wr.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файла нет:" + filename);
        } finally {
            if (wr != null) {
                wr.close();
            }

        }
    }
}
