package by.it.dorostchenok.jd01_05;


import by.it.dorostchenok.jd01_05.math.Task1;
import by.it.dorostchenok.jd01_05.math.Task2;
import by.it.dorostchenok.jd01_05.math.Task3;

public class Main {
    public static void main(String[] args) {
        double x = 1.5;
        System.out.println(Task1.optionA(x));
        System.out.println(Task1.optionB(x));

        System.out.println(Task2.calculate(0.3, -21.17));

        Task3.printTable();
    }
}
