package by.it.knyazev.Less_5.M6;

import org.jetbrains.annotations.Contract;

/**
 * Created by Artsem Kniazeu on 15.02.2016.
 */
public class Main {
    public static void main(String... args){
        // d=lg|k+6|
        double x = -3;
        double y = 2;
        int s = 25;
        double[] array = new double[s];
        int i=0;
        for (Double k = -2.8; k < 2 ; k+=0.2,i++) {
            array[i]=Math.log10(Math.abs(k+6));
            System.out.print("a["+i+"] -  ");
            System.out.printf("%.3f",array[i]);
            System.out.println();
        }
        System.out.println("sum = "+ sum(array));
    }
    public static double sum(double [] array){
        double z = 0;
        for (double k:array){
            boolean b = (k%2 == 0);
            if (b) {
            }else{
                int i = 0;
                z = z + array[i];
                i++;
            }
        }
        return z;
    }
}
