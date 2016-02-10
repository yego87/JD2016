package by.it.daylidovich.JD01_05.A.task01;

import static java.lang.Math.*;

public class Calculation {
    public static double CalculationExpression(double a, double b){
        return (pow(1/tan(PI/4-1),4)+pow((a+1.5),1/3)+pow((a-b),8)-b/(asin(pow(abs(a),2))));
    }
}
