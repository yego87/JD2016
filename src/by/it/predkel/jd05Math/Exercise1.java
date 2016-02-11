package by.it.predkel.jd05Math;

/**
 * Решить арифметическое выражение
 */
public class Exercise1 {
    public static void exercise1(double a, double b){
        double y=Math.tan(Math.pow((a+b),2))-Math.pow((a+1.15),1/3)+a*Math.pow(b,5)-b/Math.log(Math.pow(a,2));
         System.out.printf("%.4f",y);
        System.out.println();
    }
}
