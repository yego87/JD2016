package by.it.predkel.MatLab;

import by.it.predkel.MatLab.OtherClasses.Patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Admin on 21.02.2016.
 */
public class InputExpression {
    public static double[][] inputMatrix(String rLine) throws IOException {
        /*InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String rLine = bufferedReader.readLine();
        bufferedReader.close();*/
        //////////////////////////////////////
        // String[] expression = rLine.trim().split(" ");

        Pattern pat = Pattern.compile(Patterns.exMat);
        Pattern pat1 = Pattern.compile(Patterns.exVec);
        Pattern pat2 = Pattern.compile(Patterns.exVal);
        //for (int i = 0; i < expression.length; i += 2) {
        Matcher mat = pat.matcher(rLine);
        if (mat.matches()) {
            int countRow = 0, countCol = 0;
            Matcher mat1 = pat1.matcher(mat.group());
            while (mat1.find()) {
                countRow++;
                Matcher mat2 = pat2.matcher(mat1.group());
                while (mat2.find()) {
                    countCol++;
                }
            }
            double[][] mass = new double[countRow][countCol / countRow];
            int l = 0;
            while (mat1.find()) {
                Matcher mat2 = pat2.matcher(mat1.group());
                int m = 0;
                while (mat2.find()) {
                    mass[l][m] = Float.parseFloat(mat2.group());
                    m++;
                }
                l++;
            }
            return mass;
        } else {
            int countCol = 0;
            Matcher mat1 = pat1.matcher(rLine);
            if (mat1.matches()) {
                //countRow++;
                Matcher mat2 = pat2.matcher(mat1.group());
                while (mat2.find()) {
                    countCol++;
                }

                double[][] mass = new double[0][countCol];
                //int l = 0;
                while (mat1.find()) {
                    mat2 = pat2.matcher(mat1.group());
                    int m = 0;
                    while (mat2.find()) {
                        mass[0][m] = Float.parseFloat(mat2.group());
                        m++;
                    }
                }
                return mass;

            }
        }
        System.out.print("Введены некорректные данные");
        return null;
    }
}