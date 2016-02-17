package by.it.knyazev.Less_5.M4;

/**
 * Created by Artsem Kniazeu on 15.02.2016.
 */
public class Main {
    public static void main(String... args){
        sum();
    }
    public static double sum(){
        double d = 0;
        for (double a = 0; a <=2; a+=0.2) {
            d=0;
            for (double x=0;x<=6;x++){
                d=d+(Math.pow(7,a)-Math.cos(x));
            }
            System.out.printf("%.0f",d);
            System.out.println();
        }
        return d;
    }
}