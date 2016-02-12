package by.it.dorostchenok.jd01_05;

import by.it.dorostchenok.jd01_05.math.*;

public class Main {
    public static void main(String[] args) {
        double x = 1.5;
        System.out.println(Task1.optionA(x));
        System.out.println(Task1.optionB(x));

        System.out.println(Task2.calculate(0.3, -21.17));

        Task3.printTable();
        System.out.println(Task4.calculate(2.408));
        Task5.calculate();
        double a[] = Task6.getArray();
        Task6 task6 = new Task6();
        task6.printArray(a);
        //System.out.println(avg);
    }
}
