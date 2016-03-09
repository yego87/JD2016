package by.it.veselov.JD01_15;

import java.io.*;

/**
 * Created by yegorveselov on 04.03.16.
 */
public class Matrix {
     public static void main(String[] args){

        int[][] matrix;
         matrix=new int[4][4];
         for (int i=0;i < matrix.length;i++){
             for (int j=0;j < matrix[i].length;j++){
                 matrix[i][j]=(int)(Math.random()*(15*2+1)-15);
             }
         }
         for (int i=0;i < matrix.length;i++,System.out.println()){
             for (int j=0;j < matrix[i].length;j++){
                 System.out.printf("%3d ", matrix[i][j]);
             }
             System.out.println();
         }

         try

         {
             File file = new File("textFile.txt");
             PrintWriter printWriter = new PrintWriter(( new FileWriter(file)));
             for (int i = 0; i < 4; i++) {
                 for (int j = 0; j < 4; j++) {
                     printWriter.printf("%3d ", matrix[i][j]);


                 }
                 printWriter.println();
             }
             printWriter.flush();
         }catch (FileNotFoundException e)
         {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }
         finally {

         }

     }

     }


