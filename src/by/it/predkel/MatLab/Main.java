package by.it.predkel.MatLab;

import by.it.predkel.MatLab.Utils.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Admin on 19.02.2016.
 */
public class Main{

    private static void one(Var v){
        if (v!=null)
            v.outPut();
    }

    public static void main (String [] args) throws IOException {
        /*try {
            System.out.println("\nпроверка операций со скалярами");
            one(new FloatVar("1").add(new FloatVar("2")));
            one(new FloatVar("9").sub(new FloatVar("7")));
            one(new FloatVar("1.5").mul(new FloatVar("2")));
            one(new FloatVar("-4").div(new FloatVar("-1")));

            String vec = "{{1,2,3}}";
            String mat = "{{1,2,3}{1,2,3}{1,2,3}}";
            System.out.println("\nпроверка операций с векторами справа и скалярами слева");
            one(new MatrixVar(vec).add(new FloatVar("2")));
            one(new MatrixVar(vec).sub(new FloatVar("1")));
            one(new MatrixVar(vec).mul(new FloatVar("2")));
            one(new MatrixVar(vec).div(new FloatVar("1")));

            System.out.println("\nпроверка операций со скалярами справа и векторами слева");
            one(new FloatVar("1").add(new MatrixVar(vec)));
            one(new FloatVar("2").sub(new MatrixVar(vec)));
            one(new FloatVar("1").mul(new MatrixVar(vec)));
            one(new FloatVar("2").div(new MatrixVar(vec)));

            System.out.println("\nпроверка операций с двумя векторами");
            one(new MatrixVar(vec).add(new MatrixVar(vec)));
            one(new MatrixVar(vec).sub(new MatrixVar(vec)));
            one(new MatrixVar(vec).mul(new MatrixVar(vec)));
            one(new MatrixVar(vec).div(new MatrixVar(vec)));

            System.out.println("\nпроверка операций с матрицей и вектором (не реализовано)");
            one(new MatrixVar(mat).add(new MatrixVar(vec)));
            one(new MatrixVar(mat).sub(new MatrixVar(vec)));
            one(new MatrixVar(mat).mul(new MatrixVar(vec)));
            one(new MatrixVar(mat).div(new MatrixVar(vec)));
*/          MyLogger log=MyLogger.GetLogger();

        try {
            TextBuilder report=new TextBuilder();
            report.createHeader();
            report.createTime();
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String rLine = "";
            System.out.println("Введите выражение. Все кроме скобок через пробел. " +
                    "Введите 'print' если хотите вывести введенные вами ранее переменные. " +
                    "Введите 'end', если хотите выйти");
            do {
                rLine = bufferedReader.readLine();
                report.createOperation(rLine);
                if (rLine.equals("print")) {
                    CalculationClass.sortvar();
                } else {
                    //CalculationClass.input(rLine);
                    StringBuilder result=Recursion.realRecurs(new StringBuilder(rLine));
                    System.out.println(result);
                    report.createResult(result.toString());
                }
            } while (!rLine.equals("end"));
            bufferedReader.close();
            report.createTime();
            report.getText();
        }catch (NullPointerException e){
            log.write(e);
        }

/*
        }catch  (IOException | IllegalArgumentException e){
            System.out.println("Некорректный ввод данных");
        }catch (ArithmeticException e){
            System.out.println("Деление на ноль!");
        }
        */
    }
}