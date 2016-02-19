package by.it.knyazev.Less_5.M6;

/**
 * Created by Artsem Kniazeu on 19.02.2016.
 */
public class New {
    public static void main(String[] args) {
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
        System.out.println("summa = " + summa(array));
    }

    public static double summa(double[] array){
        double s = 0;
        int i = 0;
        for (double x : array){
            if (x>3){
                s = s + array[i];
            }
            i++;
        }
        return s;
    }
}
