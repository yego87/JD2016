package by.it.predkel.jd01.GaussJordan;

/**
 * умножение матрицы на вектор или другую матрицу
 */
public class ArrayMul {
    public static double[] arrayMulVector(double[][] x, double[] y){
        double[] z=new double[x.length];
        for (int i=0; i<x.length; i++){
            for (int j=0; j<y.length; j++){
                z[i]=z[i]+x[i][j]*y[j];
            }
        }
        return z;
    }
    public static double[][] arrayMulArray(double[][] x, double[][] y){
        double[][] z=new double[x.length][y[0].length];
        for (int i=0; i<x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                for (int k = 0; k < y[0].length; k++) {
                    z[i][j] = z[i][j] + x[i][k] * y[k][j];
                }
            }
        }
        return z;
    }
}
