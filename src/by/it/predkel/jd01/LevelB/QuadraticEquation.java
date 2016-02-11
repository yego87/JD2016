package by.it.predkel.jd01.LevelB;

import java.io.IOException;

/**
 * Решение квадратного уравнения
 */
public class QuadraticEquation {
    public static void quadraticEquation() throws IOException {
        System.out.println(" A=");
        int a=System.in.read();
        System.out.println(" B=");
        int b = System.in.read();
        System.out.println("C=");
        int c = System.in.read();
        int de = b * b - 4 * a * c;
        double x1 = b / (2 * a) + de / 2 / a;
        double x2 = -b / (2 * a) + de / 2 / a;
        System.out.println("x1 = " + x1 + " x2 = " + x2);
    }
}
