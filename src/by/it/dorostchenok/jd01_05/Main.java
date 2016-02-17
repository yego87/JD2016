package by.it.dorostchenok.jd01_05;

import by.it.dorostchenok.jd01_05.math.*;

/**
 * JD01-05. Вариант 10.
 */
public class Main {
    public static void main(String[] args) {
        // 1
        double x = 1.5;
        System.out.println(Task1.optionA(x));
        System.out.println(Task1.optionB(x));
        // 2
        System.out.println(Task2.calculate(0.3, -21.17));
        // 3
        Task3.printTable();
        // 4
        System.out.println(Task4.calculate(2.408));
        // 5
        Task5.calculate();
        // 6
        double a[] = Task6.getArray();
        Task6 task6 = new Task6();
        task6.printArray(a, "testname", true);
        double b[] = task6.getEveryThirdElement(a);
        task6.printArray(b, "array", true);
    }
}
