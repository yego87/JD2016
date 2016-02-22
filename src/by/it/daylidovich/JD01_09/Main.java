package by.it.daylidovich.JD01_09;

import by.it.daylidovich.JD01_09.varables.Float.VarableFloat;
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
        double[] vec2 = {4,5,6};
        System.out.println("Сложение");
        System.out.println(new VarableVector(vec1).add(new VarableFloat("3")));
        System.out.println(new VarableVector(vec1).add(new VarableVector(vec2)));
        System.out.println("Вычитание");
        System.out.println(new VarableVector(vec2).sub(new VarableFloat("3")));
        System.out.println(new VarableVector(vec2).sub(new VarableVector(vec1)));
        System.out.println("Умножение");
        System.out.println(new VarableVector(vec1).mult(new VarableFloat("2")));
        System.out.println(new VarableVector(vec1).mult(new VarableVector(vec2)));
        System.out.println("Деление");
        System.out.println(new VarableVector(vec1).div(new VarableFloat(2)));

    }
}
