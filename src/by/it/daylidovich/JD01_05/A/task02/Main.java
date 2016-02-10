package by.it.daylidovich.JD01_05.A.task02;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.print("Введите x:");
        double x = Calculation.ReadNumber();
        System.out.println();
        System.out.print("Введите f:");
        double f = Calculation.ReadNumber();
        System.out.println();
        System.out.printf("Результат выражения равен %-20.2f \n",Calculation.CalculationExpression(x,f));
        System.out.printf("Результат выражения при x=2570 и f=0.873 равен %-20.2f\n", Calculation.CalculationExpression(2570,0.873));
    }
}