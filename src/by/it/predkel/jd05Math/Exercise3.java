package by.it.predkel.jd05Math;

/**
 * Решить арифметическое выражение в цикле вывести параметр цикла и значение
 */
public class Exercise3 {
    public static void exercise3(){
        for (double t=2; t<=3; t+=0.1){
             System.out.printf("(%.1f)%.4f\t",t,(Math.log(Math.abs(1.3+t))-Math.pow(Math.E,t)));
        }
        System.out.println();
    }
}
