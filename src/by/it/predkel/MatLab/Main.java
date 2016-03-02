package by.it.predkel.MatLab;

import by.it.predkel.MatLab.OtherClasses.InputExpression;

import java.io.IOException;

/**
 * Created by Admin on 19.02.2016.
 */
public class Main{

    private static void one(Var v){
        if (v!=null)
            v.outPut();
    }

    public static void main (String [] args) throws IOException {

        System.out.println("\nпроверка операций со скалярами");
        one(new FloatVar("1").add(new FloatVar("2")));
        one(new FloatVar("9").sub(new FloatVar("7")));
        one(new FloatVar("1.5").mul(new FloatVar("2")));
        one(new FloatVar("-4").div(new FloatVar("-1")));

        String vec="{{1,2,3}}";
        String mat="{{1,2,3}{1,2,3}}";
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

        InputExpression.input();
    }
}