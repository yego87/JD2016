package by.it.predkel.jd05Math;

/**
 * Решить арифметическое выражение
 */
public class Exercise2 {
    public static void exercise2(double a,double x){
        double z=Math.log(Math.abs((a-1.12*x)/4))-Math.sqrt((x*Math.pow(a,3)));
         System.out.printf("%.4f",z);
        System.out.println();
    }
}
