package by.it.daylidovich.JD01_05_v8.A.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.*;

public class Calculation {
    public static double CalculationExpression(double x, double f){
        return ((sin(pow((PI/8-f),2))+pow((3+pow(x,2)),1/4))/2);
    }
    public static double ReadNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String rLine = reader.readLine();
        rLine.trim();
        return Double.parseDouble(rLine);
    }
}
