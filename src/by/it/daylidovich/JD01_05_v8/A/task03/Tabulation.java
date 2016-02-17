package by.it.daylidovich.JD01_05_v8.A.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tabulation {
    public static double ReadNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String rLine = reader.readLine();
        rLine.trim();
        return Double.parseDouble(rLine);
    }
    public static void CreateTable(double t1, double t2, double dt){
        for (double i = t1; i < t2+dt; i+=dt) {
            System.out.printf("%5.2f   %5.2f\n",i,(Math.log(1.3+i)-Math.pow(Math.E,i)));
        }
    }
}
