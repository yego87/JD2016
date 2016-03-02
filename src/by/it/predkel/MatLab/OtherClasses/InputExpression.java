package by.it.predkel.MatLab.OtherClasses;

import by.it.predkel.MatLab.FloatVar;
import by.it.predkel.MatLab.MatrixVar;
import by.it.predkel.MatLab.Var;

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
    private static void one(Var v){
        if (v!=null) v.outPut();
    }

    public static void input() throws IOException,IllegalArgumentException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String rLine = bufferedReader.readLine();
        bufferedReader.close();
        String[] expression = rLine.trim().split(" ");

        ArrayList<Var> varArr = new ArrayList<>();

        Pattern pat = Pattern.compile(Patterns.exMat);
        Pattern pat1 = Pattern.compile(Patterns.exVec);
        Pattern pat2 = Pattern.compile(Patterns.exVal);
        for (int i = 0; i < expression.length; i += 2) {
            Matcher mat = pat.matcher(expression[i]);
            Matcher mat1 = pat1.matcher(expression[i]);
            Matcher mat2 = pat2.matcher(expression[i]);
            if ((mat.matches()) || (mat1.matches())) {
                varArr.add(new MatrixVar(expression[i]));
            } else if (mat2.matches()) {
                varArr.add(new FloatVar(expression[i]));
            } else
                throw new IllegalArgumentException();
        }

        for (int i=1,count=0;i<expression.length;i+=2,count+=2){
            switch (expression[i].trim().charAt(0)){
                case '+':
                    one(varArr.get(count).add(varArr.get(count+1)));
                    break;
                case '-':
                    one(varArr.get(count).sub(varArr.get(count+1)));
                    break;
                case '*':
                    one(varArr.get(count).mul(varArr.get(count+1)));
                    break;
                case '/':
                    one(varArr.get(count).div(varArr.get(count+1)));
                    break;
            }
        }
    }
    public static double[][] inputMatrix(String rLine){

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
        //System.out.print("Введены некорректные данные");
        return null;
    }
}