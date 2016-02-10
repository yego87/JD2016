package by.it.telushko.jd01_04;

/**
 * Created by Владимир on 09.02.2016.
 */
public class Util {
    public static double[] findRoot(double[][]mA,double[] mY, boolean showSteps){
        int n=mA.length; //размер системы уравнений
        double[][]m=new double[n][n+1];//операционная матрица
        for (int row = 0; row <n ; row++)
            for (int col = 0; col <n ; col++)
                m[row][col]=mA[row][col];
        for (int row = 0; row <n ; row++)
            m[row][n]=mY[row];
        if(showSteps) InOut.arrayPrint2D(m);
        double k;
        //пямой ход
        for (int diag = 0; diag <n-1 ; diag++) {
            for (int row = diag+1; row <n; row++) {
                k=m[row][diag]/m[diag][diag];
                for (int col = 0; col <n+1 ; col++)
                    m[row][col]=m[row][col]-m[diag][col]*k;
            }
        }
        //обратный ход
        for (int diag = n-1; diag >0 ; diag--) {
            for (int row = 0; row <diag ; row++) {
                k=m[row][diag]/m[diag][diag];
                for (int col = 0; col <n+1 ; col++)
                    m[row][col]=m[row][col]-m[diag][col]*k;
            }
        }
        //вывод главной диагонали
        for (int i = 0; i <n ; i++) {
            k=1/m[i][i];
            for (int j = 0; j <n+1 ; j++)
                m[i][j]=m[i][j]*k;
        }
        if(showSteps)InOut.arrayPrint2D(m);
        double[] x=new double[n];
        for (int i = 0; i <n ; i++)
            x[i]=m[i][n];
        return x;
    }

    public static double[] arrayMulVector(double[][]x,double[]y){
        double[] z=new double[x.length];
        for (int i = 0; i <x.length ; i++)
            for (int j = 0; j <y.length ; j++)
                z[i]=z[i]+x[i][j]*y[j];
        return z;
    }

    public static double[][] arrayMulVector(double[][]x,double[][]y){
        double[][] z=new double[x.length][y[0].length];
        for (int i = 0; i <x.length ; i++) {
            for (int j = 0; j <y[0].length ; j++) {
                for (int k = 0; k <y.length ; k++) {
                    z[i][j]=z[i][j]+x[i][k]*y[k][j];
                }
            }
        }
        return z;
    }

}
