package by.it.solonovich.JD01_work;

/**
 * Created by Кирилл on 12.02.2016.
 */
public class Zadanie14 {
    public static void main(String[] args) {
        int[][] matr;
        matr = new int[5][5];
        matr[0][0] = 1;
        matr[0][1] = 1;
        matr[0][2] = 1;
        matr[0][3] = 1;
        matr[0][4] = 1;
        matr[1][0] = 0;
        matr[1][1] = 1;
        matr[1][2] = 1;
        matr[1][3] = 1;
        matr[1][4] = 0;
        matr[2][0] = 0;
        matr[2][1] = 0;
        matr[2][2] = 1;
        matr[2][3] = 0;
        matr[3][0] = 0;
        matr[3][1] = 1;
        matr[3][2] = 1;
        matr[3][3] = 1;
        matr[3][4] = 0;
        matr[4][0] = 1;
        matr[4][1] = 1;
        matr[4][2] = 1;
        matr[4][3] = 1;
        matr[4][4] = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matr[i][j] + "\t");
            }
            System.out.println();
        }}}
