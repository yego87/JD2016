package by.it.predkel.JD15Flows;

import java.io.*;

/**
 * Created by Admin on 06.03.2016.
 */
public class MatrixInFile {
    public static void matrixIn() throws IOException {
        int[][] mass=new int[4][4];
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                mass[i][j]=(int)(-15+Math.random()*30);
                System.out.printf("%3d ",mass[i][j]);
            }
            System.out.println();
        }

        String src = System.getProperty("user.dir") + "/src/by/it/predkel/";
        String fin = src + "JD15Flows/text.txt";
        File fl=new File(fin);

        try(BufferedWriter data=new BufferedWriter(new FileWriter(fl))){
            for (int i = 0; i < mass.length; i++) {
                for (int j = 0; j < mass[i].length; j++) {
                    data.write(mass[i][j]+" ");
                }
                data.newLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файла нет: " + fin);
        }

    }
}
