package by.it.knyazev.JD01.Less_5.M3;

/**
 * Created by Artsem Kniazeu on 15.02.2016.
 */
public class Main {
    public static void main(String... args){
        double x =  2.1;
        double f = 0;
        for (double a = 3.5; a <=25.5 ; a+=2.5) {
            f = Math.asin(Math.toRadians(x/2))+1.2*a;
            System.out.print("a = ");
            System.out.printf("%.2f", a, "\t");
            System.out.print(" f = ");
            System.out.printf("%.2f", f);
            System.out.println();
        }
    }
}
