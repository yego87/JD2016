package by.it.predkel.jd01.LevelC;

import java.util.Random;
import java.util.Scanner;

/**
 * Генерация матрицы случайных чисел в диапазоне [-n;n], где n - размерность
 */
public class RandomMatrix {
    public static int[][] randomMatrix() {
        System.out.println("Генерация рандомного");
        Scanner in = new Scanner(System.in);
        int dimension = in.nextInt();
        int[][] mass1 = new int[dimension][dimension];
        Random rand = new Random();
        for (int i = 0; i < (dimension); i++) {
            for (int j = 0; j < (dimension); j++) {
                mass1[i][j] = ((int)(Math.random()*11)-dimension);
                System.out.printf("%3d ", mass1[i][j]);
            }
            System.out.print('\n');
        }
    return mass1;
    }
}
