package by.it.podelstchikova.jd04;

public class TaskAndBndC {

    public static double[] findRoot(double[][] mX,double[]mY)
    {
        int n=mX.length;
        double[][]newmX = new double[n][n+1];
        double[][]newmXTest=new double[n][n];
        double[] x=new double[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                newmX[i][j]=mX[i][j];
                newmXTest[i][j]=mX[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            newmX[i][n]=mY[i];
        }
        double[][]c=new double[n][n];
        System.out.println("Вывод матрицы");
        TaskAndBndC.printMatrix(newmX);
        newmX= TaskAndBndC.forwardTrace(newmX,false,c);
        System.out.println("Прямой ход");
        TaskAndBndC.printMatrix(newmX);
        TaskAndBndC.findDeterminate(newmX);
        double[][] nM= new double[newmX.length][newmX.length+1];
        nM= TaskAndBndC.reverseTrase(newmX,false,c);
        System.out.println("Обратный ход");
        TaskAndBndC.printMatrix(nM);

        c=TaskAndBndC.forwardTrace(newmX,true,c);
        c=TaskAndBndC.reverseTrase(newmX,true,c);
        for (int i = 0; i < n; i++) {
            double k=1/nM[i][i];
            for (int j = 0; j < n+1; j++) {

                nM[i][j]=nM[i][j]*k;
                if (j<n)
                c[i][j]*=k;
            }
        }
        for (int i = 0; i < n; i++) {
            x[i]=nM[i][n];
        }


         TaskAndBndC.test(x,newmXTest,mY);
         System.out.println("Обратная матрица:\n результат проверки");
        boolean k=TaskAndBndC.test2(c,newmXTest);

        System.out.println(k);
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + "\t\t");
            }
            System.out.println();

        }
return x;
    }

    public static boolean  test2(double[][] c,double[][]nM)
    {
        double[][] rez = new double[c.length][nM[0].length];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j <nM[0].length ; j++) {
                for (int k = 0; k < nM.length; k++) {
                    rez[i][j]+=c[i][k]*nM[k][j];
                }
            }
        }
        for (int i = 0; i < rez.length; i++) {
            for (int j = 0; j < rez[i].length; j++) {
                if((i!=j)&& (rez[i][j]==1)) return  false;
                if ((i==j)&& (rez[i][j]!=1)) return false;
                if ((i==j)&& (rez[i][j]==1)) return true;
                if ((i!=j)&& (rez[i][j]!=1)) return true;
            }

        }
        return  true;
    }
    public static double[][] reverseTrase(double[][] newmX,boolean e,double[][] c )
    {
        int n=newmX.length;
        double k=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j)c[i][j]=1;
                else c[i][j]=0;
            }
        }
        for (int i = n-1; i >0 ; i--) {
            for (int j = 0; j < i; j++) {
                k=newmX[j][i]/newmX[i][i];
                for (int l = 0; l < n+1; l++) {
                    newmX[j][l]-=newmX[i][l]*k;
                    if (l<n)  c[j][l]-=newmX[i][l]*k;
                }
            }
        }
        if (e) return c;
        return newmX;

    }

    public static void  findDeterminate(double[][] newmX)
    {
        double k=1;
        for (int i = 0; i < newmX.length; i++) {
            k*=newmX[i][i];
        }
        System.out.println("determinant:\t\t"+k);
    }
    public  static double[][] forwardTrace(double[][] newmX,boolean e, double[][] c)
    {  int n =newmX.length;
        double k=0;
        for (int i = 0; i < n-1; i++)
        {
            for (int l = i+1; l < n; l++) {

                k=newmX[l][i]/newmX[i][i];
                for (int j = 0; j < n+1; j++)
                {
                    newmX[l][j]=newmX[l][j]-newmX[i][j]*k;
                    if(j<n) c[l][j]-=newmX[i][j]*k;

                }
            }
        }
        if (e) return c;
        return newmX;
    }

    public static void printMatrix(double[][] A)
    { int n=A.length;

        for (int i = 0; i < n; i++) {
        int m=A[i].length;
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j]+"\t\t");

            }
            System.out.println();
        }
    }

    public static void test(double[] x,double[][]mN,double[] y)
    {
        int k =mN.length;
        double[] rez= new double[k];
        for (int i = 0; i < k; i++)
        {
            for (int j = 0; j < k; j++)
            {
                rez[i]+=mN[i][j]*x[j];
            }
        }
        boolean tf=true;
        for (int i = 0; i < k; i++)
        {
            if (rez[i]!=y[i])
            {
                tf = false;
                break;
            }
        }
        if (tf) System.out.println("Верно");
        else System.out.println("не Верно");
    }


}

