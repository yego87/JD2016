package by.it.daylidovich.JD01_05_v8.B.task06;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        double p1=-8, p2=-2;
        System.out.println("Введите интервал.");
        double dp = Utils.ReadNumber();
        System.out.println("Созданный массив.");
        double[] M =Utils.CreateArray(p1, p2, dp);
        Utils.PrintArray(M,"M");
        double[] minusM = Utils.MinusArray(M);
        System.out.printf("Произведение отрицательных элементов %-3.2f\n",Utils.MultiplicationArray(minusM));
    }
}
