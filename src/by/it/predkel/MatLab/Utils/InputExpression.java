package by.it.predkel.MatLab.Utils;


import by.it.predkel.MatLab.*;
import by.it.predkel.MatLab.OtherClasses.Patterns;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Разбиение строки на объекты
 */
public class InputExpression {
    static Pattern pat = Pattern.compile(Patterns.exMat);
    static Pattern pat1 = Pattern.compile(Patterns.exVec);
    static Pattern pat2 = Pattern.compile(Patterns.exVal);

    public static Var findExpression(String rLine) throws IOException,IllegalArgumentException {
        Matcher chislo=pat2.matcher(rLine);
        Matcher mat1 = pat1.matcher(rLine);
        if (mat1.matches()){
            return new MatrixVar(findMassExpression(rLine));
        }else if (chislo.matches()) {
            return new FloatVar(chislo.group());
        }else
        System.out.print("Некорректный ввод данных");
        return null;
    }
    public static double[][] findMassExpression(String rLine) throws IOException,IllegalArgumentException {
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
                    mass[l][m] = Double.parseDouble(mat2.group());
                    m++;
                }
                l++;
            }
            return mass;
        } else if (!mat.matches()) {
            int countCol = 0;
            Matcher mat1 = pat1.matcher(rLine);
            if (mat1.matches()) {
                Matcher mat2 = pat2.matcher(mat1.group());
                while (mat2.find()) {
                    countCol++;
                }

                double[][] mass = new double[0][countCol];
                while (mat1.find()) {
                    mat2 = pat2.matcher(mat1.group());
                    int m = 0;
                    while (mat2.find()) {
                        mass[m][0] = Double.parseDouble(mat2.group());
                        m++;
                    }
                }
                return mass;
            }
        }
        System.out.print("чтото пошло не так");
        return null;
    }
}