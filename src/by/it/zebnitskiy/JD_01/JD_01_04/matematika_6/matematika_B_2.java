package by.it.zebnitskiy.JD_01.JD_01_04.matematika_6;

/**
 * Created by Зебницкий Максим on 2/19/2016.
 */
//Вариант 13;
public class matematika_B_2 {
    public static void main(String[] args){
        int a = 0;
        int b = 7;
        int i = 0;
        double array[ ] = new double[20];
        for (double x  = 0; x < 7 ; x+=0.4 ){
            i++;
            array[i] = x + Math.sin(x);
                         System.out.print("t [" + i + "] - " );
                              System.out.printf("%.3f",array[i]);
                                System.out.println();
        }
                     System.out.printf("summa = " + "%.3f",summa(array));
    }
                            public static double summa(double[] array){
        double s = 0;
        int i =0;
        for (double x : array){
            if (x>3){
                s = s + array[i];
            }
            i++;
        }
        return s;
    }
}
