package by.it.dorostchenok.jd01_05.math;

import static java.lang.Math.tan;
import static java.lang.Math.pow;

public class Task3 {
    public static void printTable(){

        double x = 3.567;
        int tableWidth = 20;
        for (double a = 3.5; a <= 25.5; a += 3.75){
            double y = (1.0 / tan(pow(x, 3))) + 2.24 * a * x;
            //if()
            System.out.println("┃ " + a +"\t┃ " + y + "┃" );
        }
        System.out.println("");
        System.out.println("┏━━━━━━━┳━━━━━━━┓");
        System.out.println("┃ param ┃ value ┃");
        System.out.println("┗━━━━━━━┻━━━━━━━┛");

        String s = String.format("%1s%8s%9s%10s", "one", "two", "three", "four");
        System.out.println(s);

    }
}
