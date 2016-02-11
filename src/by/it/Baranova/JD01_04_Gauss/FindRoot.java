package by.it.Baranova.JD01_04_Gauss;

/**
 * Created by Ekaterina on 2/8/16.
 */
public class FindRoot {
    public static double[] FindingRoot(double [][] mA, double [] mY, boolean showSteps){
        int n=mA.length;
        double [][]m=new double[n][n+1];
        for (int row =0; row <n; row++) {
            for (int col=0; col<n;col++) {
                m[row][col]=mA[row][col];
            }
        }
        for (int row=0;row<n;row++) {
            m[row][n] = mY[row];
        }
        if (showSteps) InOut.arrayPrint2D (m,"m");
        if (showSteps) InOut.arrayPrint2D (m);

        double k;
        for (int diag=0;diag<n-1;diag++){
            for (int row=diag+1;row<n;row++){
                k=m[row][diag]/m[diag][diag];
                for (int col=0;col<n+1;col++){
                    m[row][col]=m[row][col]-m[diag][col]*k;
                }
            }
        }
        if (showSteps) InOut.arrayPrint2D(m);
        for (int diag=n-1;diag>0;diag--){
            for (int row=0;row<diag;row++){
                k=m[row][diag]/m[diag][diag];
                for (int col=0;col<n+1;col++){
                    m[row][col]=m[row][col]-m[diag][col]*k;
                }
            }
        if (showSteps) InOut.arrayPrint2D(m);
        }
        for (int i=0;i<n;i++){
            k=1/m[i][i];
            for (int j=0;j<n+1;j++){
                m[i][j]=m[i][j]*k;
            }
        }
        if (showSteps) InOut.arrayPrint2D(m);
        double []x=new double [n];
        for (int i=0;i<n;i++){
            x[i]=m[i][n];
        }
        return x;
    }

    public static double [] ArrayMulVector (double[][] x,double [] y){
        double [] z=new double [x.length];
        for (int i=0;i<x.length;i++){
            for (int j=0;j<y.length;j++){
                z[i]=z[i]+x[i][j]*y[j];
            }
        }
        return z;
    }
    public static double FindDeterminant (double [][]mA){
        int n=mA.length;
        double [][]m=new double[n][n];
        for (int row =0; row <n; row++) {
            for (int col=0; col<n;col++) {
                m[row][col]=mA[row][col];
            }
        }
        double k;
        for (int diag=0;diag<n-1;diag++){
            for (int row=diag+1;row<n;row++){
                k=m[row][diag]/m[diag][diag];
                for (int col=0;col<n;col++){
                    m[row][col]=m[row][col]-m[diag][col]*k;
                }
            }
        }
        double determ=1;
        for (int i=0;i<n;i++) {
            determ = determ * m[i][i];
        }
        return determ;
    }

    public static double [][] InverseMatrix (double [][]mA){
        int n=mA.length;
        double [][]m=new double[n][n];
        for (int i =0; i <n; i++) {
                m[i][i]=1;
        }
        double [][]mextra=new double[n][n];
        for (int row =0; row <n; row++) {
            for (int col = 0; col < n; col++) {
                mextra[row][col] = mA[row][col];
            }
        }
        double k;
        for (int diag=0;diag<n-1;diag++){
            for (int row=diag+1;row<n;row++){
                k=mextra[row][diag]/mextra[diag][diag];
                int j=0;
                for (int col=0;col<n;col++){
                    mextra[row][col]=mextra[row][col]-mextra[diag][col]*k;
                    m[row][col]=m[row][col]-m[diag][col]*k;
                }
            }
        }
        for (int diag=n-1;diag>0;diag--){
            for (int row=0;row<diag;row++){
                k=mextra[row][diag]/mextra[diag][diag];
                    for (int col = 0; col < n; col++) {
                        mextra[row][col] = mextra[row][col] - mextra[diag][col] * k;
                        m[row][col]=m[row][col]-m[diag][col]*k;
                    }
                }
            }

        for (int i=0;i<n;i++){
            k=1/mextra[i][i];
            for (int j=0;j<n;j++){
                m[i][j]=m[i][j]*k;
            }
        }

        return m;
    }
    public static double [][] arrayMulVector (double [][]x, double[][]y) {
        double [][] z=new double[x.length][y[0].length];
        for (int i=0;i<x.length;i++){
            for (int j=0;j<y[0].length;j++){
                for (int k=0;k<y.length;k++){
                    z[i][j]=z[i][j]+x[i][k]*y[k][j];
                }
            }
        }
    return z;
    }

}

