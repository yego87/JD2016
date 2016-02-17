package by.it.predkel.jd01.GaussJordan;

/**
 * Нахождение детерминанта матрицы
 */
public class FindDeterminant {
    public static double findDeterminant(double[][] mass) {
        double l;
        for (int diag = 0; diag < mass.length-1; diag++) {
            for (int row = diag + 1; row < mass.length; row++) {
                l = mass[row][diag] / mass[diag][diag];
                for (int col = 0; col < mass.length; col++) {
                    mass[row][col] = mass[row][col] - mass[diag][col] * l;
                }
            }
        }
        double m=1;
        for (int diag=0; diag<mass.length; diag++){
            m*=mass[diag][diag];
        }
        return m;
    }
}
