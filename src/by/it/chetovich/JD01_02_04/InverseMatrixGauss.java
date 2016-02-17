package by.it.chetovich.JD01_02_04;

import java.util.Arrays;

/**
 * Created by Yultos_ on 09.02.2016.
 */
public class InverseMatrixGauss {
    public void inverseMatrix (double [][] array){
        int n = array.length;
        //sozdaem edini4nuyu matricu
        double [][] oneArr = new double[n][n];
        for (int i = 0; i < n; i++) {
            oneArr[i][i] = 1;
        }
        //sozdaem bolshuyu matricu i kopiruem v nee ishodnuyu i edini4nuyu
        double [][] bigArr = new double[n][2*n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bigArr[i][j] = array[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bigArr[i][n+j] = oneArr[i][j];
            }
        }
        System.out.println("bol6aya matrica");
        PopularMethods.printArrayMatrix(bigArr);

        //pramoy hod gaussa
        System.out.println("pramoy hod gaussa");
        double k = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                k = bigArr[j][i]/bigArr[i][i];
                for (int l = 0; l < 2*n; l++) {
                    bigArr[j][l] = bigArr[j][l]-bigArr[i][l]*k;
                }
            }
        }
        PopularMethods.printArrayMatrix(bigArr);

        //obratniy hod gaussa
        System.out.println("Obratniy hod gaussa");
        for (int i = n-1; i >0 ; i--) {
            for (int j = i-1; j >= 0 ; j--) {
                k = bigArr[j][i]/bigArr[i][i];
                for (int l = 2*n-1; l >0 ; l--) {
                    bigArr[j][l] = bigArr[j][l]-bigArr[i][l]*k;
                }
            }
        }
        PopularMethods.printArrayMatrix(bigArr);

        //privodim diagonal k 1
        System.out.println("Privodim diagonal k 1");
        for (int i = 0; i < n; i++) {
            k = 1/bigArr[i][i];
            for (int j = 0; j < 2*n; j++) {
                bigArr[i][j] = bigArr[i][j]*k;
            }
        }

        PopularMethods.printArrayMatrix(bigArr);

        //matrica, kotoraya bila edini4noy, teper stala obratnoy, vivodim ee
        System.out.println("obratnaya matrica");
        double [][] inverseMatrica = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inverseMatrica[i][j] = bigArr[i][j+n];
            }
        }
        PopularMethods.printArrayMatrix(inverseMatrica);

        //proverim pravilnost metoda inverseMatrix putem peremnozheniya ishodnoq matrica na obratnuyu
        double[][] arrayForCheck = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < n; l++) {
                    arrayForCheck[i][j] +=  array[i][l] * inverseMatrica[l][j];
                }
            }

        }

        System.out.println("rezultat proverki");
        PopularMethods.printArrayMatrix(arrayForCheck);
        //if (Arrays.equals(arrayForCheck,oneArr)) System.out.println("proverka pro6la uspe6no");
        //else System.out.println("neverno");


    }
}
