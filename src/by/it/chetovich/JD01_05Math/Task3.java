package by.it.chetovich.JD01_05Math;

/**
 * Created by user_2 on 10.02.2016.
 */
public class Task3 {
    public void searchF (double x){
        double f = 0;
        for (double a = 0; a <=2 ; a+=0.2) {
            f = Math.pow(Math.E,a*x) - 3.45*a;
            System.out.print("a = ");
            System.out.printf("%.1f", a, "\t");
            System.out.print(" f = ");
            System.out.printf("%.4f", f);
            System.out.println();
        }
    }
}
