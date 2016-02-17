package by.it.knyazev.Less_5.M5;

/**
 * Created by Artsem Kniazeu on 15.02.2016.
 */
public class Main {
    public static void main(String... args){
        double a;
        double b = 0;
        for (double i = -6; i < 2; i+=0.5) {
            if ((i/2)>-2 && (i/2)<=-1){
                b = Math.sin(Math.pow(i,2));
            }
            if ((i/2)>-1 && (i/2)<0.2){
                b = Math.cos(Math.pow(i,2));
            }
            if ((i/2)==0.2){
                b = 1/Math.tan(Math.pow(i,2));
            }
            a = Math.log10(Math.abs(b+2.74));
            System.out.printf("%.1f",a);
            System.out.println();

        }
    }
}
