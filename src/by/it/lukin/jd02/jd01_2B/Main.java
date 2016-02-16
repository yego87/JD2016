package by.it.lukin.jd02.jd01_2B;

import java.util.Scanner;

/**
 * Created by алексей on 14.02.2016.
 */
public class Main {
    public  static  void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];

        int row = 0;
        int col = 0;
        int dx = 1;
        int dy = 0;
        int dirChanges = 0;
        int visits = n;

        for (int i = 0; i < n * n; i++)
        {
            matrix[row][col] = i + 1;
            if (--visits == 0)
            {
                visits = n * (dirChanges % 2) + n * ((dirChanges + 1) % 2) -(dirChanges / 2 - 1) - 2;
                int temp = dx;
                dx = -dy;
                dy = temp;
                dirChanges++;
            }
            col += dx;
            row += dy;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }


    }
}

