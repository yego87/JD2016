package by.it.chetovich.JD01_02_04;

import java.util.Arrays;

/**
 * Created by user_2 on 08.02.2016.
 */

/** Programma dla re6eniya sistemi lineynih uravneniy metodom Gaussa-Zhordana
 * @author Chatovich Yuliya
 * @author chatovich@gmail.com
 **/

public class Gauss {
    /** Metod dla poiska korney uravneniya
    * @param arr1 Ishodnaya kvadratnaya matrica (v sisteme uravneniy do znaka ravno)
     * @param arr2 Vector y (posle znaka ravno)
     */
    public void searchRoots (double [][] arr1, double [] arr2){
        //copy 2 arrays into one
        int n = arr1.length;
        double [][] array = new double[n][n+1];
        for (int i = 0; i < n; i++) {
            array[i][n] = arr2[i];
            for (int j = 0; j < n; j++) {
                array[i][j] = arr1[i][j];
            }
        }

        //print new array
        PopularMethods.printArrayMatrix(array);


        // pryamoy hod gaussa
        System.out.println("Pramoy hod gaussa");
        double k = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n ; j++) {
                k = array[j][i]/array[i][i];
                for (int l = 0; l < n+1; l++) {
                    array[j][l] = array[j][l]-array[i][l]*k;
                }
            }
        }
        PopularMethods.printArrayMatrix(array);

        System.out.println("Matrix determinant is: "+findDeterminant(array));

        //obratniy hod gaussa
        System.out.println("Obratniy hod gaussa");
        for (int i = n-1; i >0 ; i--) {
            for (int j = i-1; j >= 0 ; j--) {
                k = array[j][i]/array[i][i];
                for (int l = n; l >=0 ; l--) {
                    array[j][l] = array[j][l]-array[i][l]*k;
                }
            }
        }
        PopularMethods.printArrayMatrix(array);

        //privodim diagonal k 1
        System.out.println("Privodim diagonal k 1");
        for (int i = 0; i < n; i++) {
            k = 1/array[i][i];
            for (int j = 0; j < n+1; j++) {
                array[i][j] = array[i][j]*k;
            }
        }

        PopularMethods.printArrayMatrix(array);

        //vivodim rezultat
        double [] result = new double[n];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i][n];
            System.out.println("x["+i+"] = "+result[i]);
        }

        //proverka metoda searchRoots
        if (checkSearchRoots (arr1,result,arr2)) System.out.println("Proverka pro6la uspe6no");
        else System.out.println("neverno");
    }

    /** Metod dla poiska opredelitelya matrici
     *
     * @param array ishodniy massiv posle pramogo i obratnogo hoda gauusa, kogda vse elementi vi6e i nizhe glavnoy diagonali ravni 0
     * @return return opredelitel matrici
     */
    public double findDeterminant (double [][] array){
        double determinant = 1;
        for (int i = 0; i < array.length; i++) {
                determinant*=array[i][i];
            }
        return determinant;
    }

    /** proverka metoda searchRoots putem umnozheniya ishodnou matrici na vi4islennie korni
     *
     * @param arr1 ishodnaya matrica v pervona4alnom vide
     * @param result massiv korney uravneniya
     * @param arr2 massiv y (v sisteme uravneniy stoyali posle znaka ravno)
     * @return vozvras4aet true, esli v rezultate umnozheniya ishodnoy matrici na korni polu4ilis y, i false, esli net
     */
    public boolean checkSearchRoots (double[][]arr1, double[]result, double []arr2){
        double [] y = new double[result.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                y[i]+=arr1[i][j]*result[j];
            }
            if (y[i] != arr2[i]) return false;

        }
        return  true;

    }


}
