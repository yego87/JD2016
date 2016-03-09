package by.it.chetovich.JD01_13;

import java.io.IOException;

/**
 * sqrt from int
 */
public class SqrtFromInt {

    public static double calcSqrt (int n){

        if (n>0) return Math.sqrt(n);
        else{
            System.out.print("Impossible operation taking sqrt from negative number.");
            return 0;
        }
    }
}
