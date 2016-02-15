package by.it.lukin.jd02.jd01_3C;

import java.util.Scanner;

/**
 * Created by алексей on 14.02.2016.
 */
public class Main {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите m");
        int m = in.nextInt();
        int[][] A = new int[m][m];

        // Заполяем матрицу
        for (int i=0; i<m; i++)
        {
            for (int j=0; j<m; j++)
            {
                A[i][j] = m*i + j;
            }
        }

        // Вывод на экран
        for (int i=0; i<m; i++)
        {
            for (int j=0; j<m; j++)
            {
                System.out.printf("%3d ", A[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\nrotated\n\n");

        // Переворачиваем на 90
        for (int k=0; k<m/2; k++)
        {
            for (int j=k; j<m-1-k; j++)
            {
                // меняем местами 4 угла
                int tmp = A[k][j];
                A[k][j] = A[j][m-1-k];
                A[j][m-1-k] = A[m-1-k][m-1-j];
                A[m-1-k][m-1-j] = A[m-1-j][k];
                A[m-1-j][k] = tmp;
            }
        }
        // Вывод на экран
        for (int i=0; i<m; i++)
        {
            for (int j=0; j<m; j++)
            {
                System.out.printf("%3d ", A[i][j]);
            }
            System.out.print("\n");
        }
    }
}
