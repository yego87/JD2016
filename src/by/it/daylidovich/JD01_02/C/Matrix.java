package by.it.daylidovich.JD01_02.C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class Matrix {
    static int N;

    public int[][] CreateMatrix() throws IOException {
        System.out.print("Введите размер матрицы:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String rLine = reader.readLine();
        N = Integer.parseInt(rLine);
        Random random = new Random();
        int[][] array = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                    array[i][j]=random.nextInt(2*N+1)-N;
            }
        }
        return array;
    }

    public int[][] ArrayCopy(int[][] arrayIn){
        int[][] arrayOut = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <N; j++) {
                arrayOut[i][j] = arrayIn[i][j];
            }
        }
        return arrayOut;
    }

    public void PrintMatrix(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" \t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void PrintMatrix(double[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.format("%.2f", array[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public int[][] Transpose(int[][] arrayIn){
        int[][] array = ArrayCopy(arrayIn);
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int x = array[i][j];
                array[i][j]=array[j][i];
                array[j][i]=x;
            }
        }
        return array;
    }

    public int[][] TurnLeft(int[][] arrayIn){
        int[][] arrayOut = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arrayOut[i][j] = arrayIn[j][N-i-1];
            }
        }
        return arrayOut;
    }

    public double[][] SubtractSA(int[][] arrayIn){
        double[][] arrayOut = new double[N][N+1];
        for (int i = 0; i < N; i++) {
            double sa = 0;
            for (int j = 0; j < N; j++) {
                int sum = 0;
                for (int k = 0; k < N; k++) {
                    sum += arrayIn[i][k];
                }
                sa =1.0*sum/N;
                arrayOut[i][j] = arrayIn[i][j]-sa;
            }
            arrayOut[i][N]=sa;
        }
        return arrayOut;
    }

    public int[][] DeleteMax(int[][] array){
        int[][] arrayIn = ArrayCopy(array);
        int max = arrayIn[0][0];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (max<arrayIn[i][j])
                    max = arrayIn[i][j];
            }
        }
        System.out.println("Максимальное значение:" + max);
        ArrayList<Integer> iMax = new ArrayList<Integer>();
        ArrayList<Integer> jMax = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (max == arrayIn[i][j]){
                    iMax.add(i);
                    jMax.add(j);
                }
            }
        }

        for (int i = 0; i < iMax.size()-1; i++) {
            for (int j = 0; j < iMax.size() - i - 1; j++) {
                if (iMax.get(j) < iMax.get(j+1)){
                    int x = iMax.get(j);
                    iMax.set(j,iMax.get(j+1));
                    iMax.set(j+1,x);
                }
            }
        }

        int position = 0;
        while (iMax.size()-1 > position)
        {
            if (iMax.get(position) == iMax.get(position+1))
                iMax.remove(position);
            else position++;
        }

        for (int i = 0; i < jMax.size()-1; i++) {
            for (int j = 0; j < jMax.size() - i - 1; j++) {
                if (jMax.get(j) < jMax.get(j+1)){
                    int x = jMax.get(j);
                    jMax.set(j,jMax.get(j+1));
                    jMax.set(j+1,x);
                }
            }
        }

        position = 0;
        while (jMax.size()-1 > position)
        {
            if (jMax.get(position) == jMax.get(position+1))
                jMax.remove(position);
            else position++;

        }

        int n = N;
        for (int k : iMax){
            if (n-1 != k){
                for (int i = k; i < n; i++) {
                    for (int l = 0; l < N; l++) {
                        arrayIn[i][l]=arrayIn[i+1][l];
                    }
                }
                n--;
            }
            else n--;
        }

        int m = N;
        for (int k : jMax)
        {
            if (m-1 != k){
                for (int j = k; j < m-1; j++) {
                    for (int l = 0; l < n; l++) {
                        arrayIn[l][j]=arrayIn[l][j+1];
                    }
                }
                m--;
            }
            else m--;
        }

        int[][] arrayOut = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m; j++) {
                arrayOut[i][j] = arrayIn[i][j];
            }
        }
        return arrayOut;
    }

    public int[][] MinimumInStart(int[][] array){
        int[][] arrayIn =ArrayCopy(array);
        int min = arrayIn[0][0];
        int iMin = 0;
        int jMin = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (min>arrayIn[i][j]) {
                    min = arrayIn[i][j];
                    iMin = i;
                    jMin = j;
                }
            }
        }
        System.out.println("Минимальное значение:"+min);
        for (int i = iMin; i > 0; i--) {
            for (int j = 0; j < N; j++) {
                int x = arrayIn[i][j];
                arrayIn[i][j] = arrayIn[i-1][j];
                arrayIn[i-1][j] = x;
            }
        }
        for (int j = jMin; j > 0; j--) {
            for (int i = 0; i < N; i++) {
                int x = arrayIn[i][j];
                arrayIn[i][j] = arrayIn[i][j-1];
                arrayIn[i][j-1] = x;
            }
        }

        return arrayIn;
    }

    public int[][] ZeroAtEnd(int[][]  array){
        int[][] arrayIn = ArrayCopy(array);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N-1; j++) {
                for (int k = 0; k < N-j-1; k++) {
                    if(0 == arrayIn[i][k]){
                        int x = arrayIn[i][k];
                        arrayIn[i][k] = arrayIn[i][k+1];
                        arrayIn[i][k+1] = x;
                    }

                }
            }
        }
        return arrayIn;
    }
}
