package by.it.chetovich.JD01_02_04;

/**
 * Created by Yultos_ on 09.02.2016.
 */
public class PopularMethods {

    static void printArrayMatrix (double [][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4.1f", array[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }

    static void printArrayMatrix (int [][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4.1f", array[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
