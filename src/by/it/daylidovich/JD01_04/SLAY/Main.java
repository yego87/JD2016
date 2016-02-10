package by.it.daylidovich.JD01_04.SLAY;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Введите оснавную матрицу.");
        double[][] m = InOut.EnterMatrix();
        System.out.println("Введите матрицу свободных членов.");
        double[] y = InOut.EnterArray();
        System.out.println("Корни уравнений.");
        InOut.PrintArray(SLAY.FindRoot(m,y));

        System.out.println("Определитель основной матрицы:"+SLAY.Determinant(m));

        System.out.println("Матрица обратная основной матрице.");
        InOut.PrintMatrix(SLAY.InverseMatrix(m));

    }
}
