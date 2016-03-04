package by.it.predkel.MatLab.OtherClasses;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Разбиение строки на объекты
 */
public class InputExpression {

    public static double[][] inputMatrix(String rLine) throws IOException,IllegalArgumentException {

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
            Matcher mat3=pat1.matcher(mat.group());
            double[][] mass = new double[countRow][countCol / countRow];
            int l = 0;
            while (mat3.find()) {
                Matcher mat2 = pat2.matcher(mat3.group());
                int m = 0;
                while (mat2.find()) {
                    mass[l][m] = Float.parseFloat(mat2.group());
                    m++;
                }
                l++;
            }
            return mass;
        } else if (!mat.matches()) {
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
                        mass[m][0] = Float.parseFloat(mat2.group());
                        m++;
                    }
                }
                return mass;

            }
        }else
            throw new IllegalArgumentException();
            //System.out.print("Введены некорректные данные");
            return null;
    }
}