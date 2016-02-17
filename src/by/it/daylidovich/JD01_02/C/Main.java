package by.it.daylidovich.JD01_02.C;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Matrix matrix = new Matrix();
        int[][] array = matrix.CreateMatrix();
        matrix.PrintMatrix(array);
        System.out.println("Транспонированная матрица.");
        matrix.PrintMatrix(matrix.Transpose(array));
        System.out.println("Матрица повернутая на 90 градусов влево.");
        matrix.PrintMatrix(matrix.TurnLeft(array));
        System.out.println("Матрица с вычитом среднего арефметического строк\n(шестой столбец среднее арефметическое строки).");
        matrix.PrintMatrix(matrix.SubtractSA(array));
        System.out.println("Матрица без строк и столбцов с максимальным значением.");
        matrix.PrintMatrix(matrix.DeleteMax(array));
        System.out.println("Матрица с минимальным в начале.");
        matrix.PrintMatrix(matrix.MinimumInStart(array));
        System.out.println("Матрица с нулями в конце строки.");
        matrix.PrintMatrix(matrix.ZeroAtEnd(array));
    }
}
