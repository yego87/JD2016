package by.it.daylidovich.JD01_05.A.task04;

import by.it.daylidovich.JD01_05.A.task03.Tabulation;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите а.");
        double a = Tabulation.ReadNumber();
        System.out.println("Введите начальное b.");
        double b1 = Tabulation.ReadNumber();
        System.out.println("Введите конечное b.");
        double b2 = Tabulation.ReadNumber();
        System.out.println("Введите шаг b.");
        double db = Tabulation.ReadNumber();
        Calculation.Calc(a,b1,b2,db);
    }
}
