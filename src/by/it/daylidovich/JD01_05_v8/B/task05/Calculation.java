package by.it.daylidovich.JD01_05_v8.B.task05;

import static java.lang.Math.*;

public class Calculation {
    public static void CalculationFunction(double a,double p1,double p2,double dp){
        for (double k = p1; k<p2; k+=dp){
            double x;
            if (1.5 > 1.5*k)
                x = pow(acos(k),2);
            else if (3 > 1.5*k)
                     x = pow(E,k)+3.5;
                 else x = k+4.76;
            System.out.printf("При p=%-3.1f и x=%-5.2f  функция z=%-10.2f\n",k,x,(a+1.39*x));
        }
    }
}

