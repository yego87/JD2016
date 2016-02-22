package by.it.predkel.MatLab;

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
    public static float[][] input() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String rLine = bufferedReader.readLine();
        bufferedReader.close();
        int a = 0, b = 0;
        String[] num0 = rLine.trim().split(" ");
        Pattern pat0 = Pattern.compile(" ");
        float[][] fullMat = new float[0][];
        for (String part0 : num0) {//массив всех элементов
            Matcher mat0 = pat0.matcher(part0);
            if (mat0.matches()) {
                String[] temp0 = part0.trim().split("[{|}{|}]");
                String[] mas0 = temp0[0].trim().split("\\s*,\\s*");
                a = temp0.length;
                b = mas0.length;
            }
            fullMat = new float[a][b];


            String[] num = rLine.trim().split(" ");//массив всех элементов
            Pattern pat = Pattern.compile("[{(\\s*\\d+(\\s*,|}))+]+");
            for (String part : num) {//массив всех элементов
                Matcher mat = pat.matcher(part);
                if (mat.matches()) {
                    String[] temp = part.trim().split("[{|}{|}]");

                    for (int i = 0; i < temp.length; i++) {//массив MatrixVar
                        String[] mas = temp[i].trim().split("\\s*,\\s*");
                        //Pattern pat1 = Pattern.compile(",");
                        //Matcher mat1 = pat.matcher(temp[i]);
                        //while (mat1.find()){
                        for (int j = 0; j < mas.length; j++) {
                            fullMat[i][j] = Float.parseFloat(mas[j]);
                        }

                        //}

                    }
                }
            }
        }
        return fullMat;
    }
}
