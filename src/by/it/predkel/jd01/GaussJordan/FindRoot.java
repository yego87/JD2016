package by.it.predkel.jd01.GaussJordan;

/**
 * Нахождение корней СЛАУ
 */
public class FindRoot {
    public static double[] findRoot(double[][] massA, double[] massY){
        double[][] massAll =new double[massA.length][massA.length+1];
        for (int i=0; i<massA.length; i++){
            for (int j=0; j<massA.length; j++){
                massAll[i][j]=massA[i][j];
            }
        }
        for (int i=0; i<massAll.length; i++){
            massAll[i][massAll.length]=massY[i];
        }
        double k;
        for (int diag=0; diag<massA.length-1; diag++){
            for (int row=diag+1; row<massA.length; row++){
                k=massAll[row][diag]/massAll[diag][diag];
                for (int col=0; col<massA.length+1; col++){
                    massAll[row][col]=massAll[row][col]-massAll[diag][col]*k;
                }
            }
        }
        for (int diag=massA.length-1; diag>0; diag--){
            for (int row=0; row<diag; row++){
                k=massAll[row][diag]/massAll[diag][diag];
                for (int col=0; col<massA.length+1; col++){
                    massAll[row][col]=massAll[row][col]-massAll[diag][col]*k;
                }
            }
        }
        for (int i=0; i<massA.length; i++){
            k=1/massAll[i][i];
            for (int j=0; j<massAll.length+1; j++){
                massAll[i][j]=massAll[i][j]*k;
            }
        }
        double[] massX=new double[massA.length];
        for (int i=0; i<massAll.length; i++){
            massX[i]=massAll[i][massAll.length];
        }
        return massX;
    }
}
