package by.it.daylidovich.JD01_09;

import by.it.daylidovich.JD01_09.varables.Float.VarableFloat;
import by.it.daylidovich.JD01_09.varables.Matrix.VarableMatrix;
import by.it.daylidovich.JD01_09.varables.Vector.VarableVector;

public class Main {
    public static void main(String[] args){
        System.out.println("Проверка работы с числами.");
        System.out.println(new VarableFloat("1").add(new VarableFloat("2")));
        System.out.println(new VarableFloat("5").sub(new VarableFloat("3")));
        System.out.println(new VarableFloat("4").mult(new VarableFloat("2")));
        System.out.println(new VarableFloat("9").div(new VarableFloat("3")));

        System.out.println("Проверка работы с векторами.");
        double[] vec1 = {1,2,3};
        System.out.println("Сложение");
        System.out.println(new VarableVector(vec1).add(new VarableFloat("3")));
        System.out.println(new VarableVector(vec1).add(new VarableVector("{4,5,6}")));
        System.out.println("Вычитание");
        System.out.println(new VarableVector("{4,5,6}").sub(new VarableFloat("3")));
        System.out.println(new VarableVector("{4,5,6}").sub(new VarableVector(vec1)));
        System.out.println("Умножение");
        System.out.println(new VarableVector(vec1).mult(new VarableFloat("2")));
        System.out.println(new VarableVector(vec1).mult(new VarableVector("{4,5,6}")));
        System.out.println("Деление");
        System.out.println(new VarableVector(vec1).div(new VarableFloat(2)));

        System.out.println("Проверка матриц");
        double[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        String string = "{{1,2,3},{4,5,6},{7,8,9}}";
        System.out.println("Сложение");
        System.out.println(new VarableMatrix(matrix).add(new VarableFloat(5)));
        System.out.println(new VarableMatrix(matrix).add(new VarableMatrix(string)));
        System.out.println("Вычитание");
        System.out.println(new VarableMatrix(matrix).sub(new VarableFloat(5)));
        System.out.println(new VarableMatrix(matrix).sub(new VarableMatrix(string)));
        System.out.println("Умножение");
        System.out.println(new VarableMatrix(matrix).mult(new VarableFloat(2)));
        System.out.println(new VarableMatrix("{{33,34,12},{33,19,10},{12,14,17},{84,24,51},{43,71,21}}").mult(new VarableMatrix("{{10,11,34,55},{33,45,17,81},{45,63,12,16}}")));
    }
}
