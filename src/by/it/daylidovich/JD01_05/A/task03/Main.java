package by.it.daylidovich.JD01_05.A.task03;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите начало отрезка вычесления.");
        double t1 = Tabulation.ReadNumber();
        System.out.println("Введите конец отрезка вычесления.");
        double t2 = Tabulation.ReadNumber();
        System.out.println("Введите интервал вычисления");
        double dt = Tabulation.ReadNumber();
        Tabulation.CreateTable(t1,t2,dt);
    }
}
