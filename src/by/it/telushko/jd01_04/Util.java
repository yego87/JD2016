package by.it.telushko.jd01_04;
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
        m=gaussForward(m);         //пямой ход
        m=gaussReverse(m);        //обратный ход
        m=mainDiagTo1(m);        //преобразование главной диагонали
        if(showSteps)InOut.arrayPrint2D(m);
        double[] x=new double[n];
        for (int i = 0; i <n ; i++)
            x[i]=m[i][n];
        return x;
    }
    public static double[][] gaussForward(double[][]m){
        double k;
        int n=m.length;
        int minusCount=0;
        if(m.length==m[0].length) minusCount=n;     // в цикл, исходя из задачи, попадет либо квадратная матрица,
        if(m.length+1==m[0].length) minusCount=n+1; // либо матрица с доп.сотлбцом (для решения СЛАУ)
        if(2*m.length==m[0].length) minusCount=n*2; // либо матрица удвоенной длины (для поиска обратной)

            for (int diag = 0; diag <n-1 ; diag++) {
            for (int row = diag+1; row <n; row++) {
                k=m[row][diag]/m[diag][diag];
                for (int col = 0; col <minusCount ; col++) //minusCount количество вычислений в строке(зависит от типа задания)
                    m[row][col]=m[row][col]-m[diag][col]*k;
            }
        }
        return m;
    }
    public static double[][] gaussReverse(double[][]m){
        double k;
        int n=m.length;
        int minusCount=0;// переменная, определяющая, квадратный массив или нет(для случая поиска определителя)
        if(m.length==m[0].length) minusCount=n;
        if(m.length+1==m[0].length) minusCount=n+1;
        if(2*m.length==m[0].length) minusCount=n*2;
        for (int diag = n-1; diag >0 ; diag--) {
            for (int row = 0; row <diag ; row++) {
                k=m[row][diag]/m[diag][diag];
                for (int col = 0; col <minusCount ; col++)
                    m[row][col]=m[row][col]-m[diag][col]*k;
            }
        }
        return m;
    }
    public static double[][] mainDiagTo1 (double[][]m){
        double k;
        int n=m.length;
        int minusCount=0;// переменная, определяющая, квадратный массив или нет(для случая поиска определителя)
        if(m.length==m[0].length) minusCount=n;
        if(m.length+1==m[0].length) minusCount=n+1;
        if(2*m.length==m[0].length) minusCount=n*2;
        for (int i = 0; i <n ; i++) {
            k=1/m[i][i];
            for (int j = 0; j <minusCount ; j++)
                m[i][j]=m[i][j]*k;
        }
        return m;
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
    public static double[][] reverseMatrix(double mA[][]){
        double[][] m = new double[mA.length][mA.length*2]; //операционная матрица
        double[][] diagMatrix = {{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}};
        double[][] mR=new double[mA.length][mA.length]; //обратная матрица
        //заполняем операционную матрицу
        for (int i = 0; i <mA.length ; i++) for (int j = 0; j <mA.length ; j++) m[i][j]=mA[i][j];
        for (int i = 0; i <mA.length ; i++) for (int j = mA.length; j <2*mA.length ; j++) m[i][j]=diagMatrix[i][j-mA.length];

        m=gaussReverse(m);
        m=gaussForward(m);
        m=mainDiagTo1(m);

        for (int i = 0; i <mA.length ; i++) {
            for (int j = 0; j <mA.length ; j++) {
                mR[i][j]=m[i][j+mA.length];
            }
        }
        return mR;
    }
}
