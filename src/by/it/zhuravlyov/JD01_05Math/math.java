package by.it.zhuravlyov.JD01_05Math;

import java.util.Scanner;
import static java.lang.Math.*;

public class math {
        public void ProblemOne() {
        final double A = 756.13;
        final double X = 0.3;
        double first = pow((cos(pow(X, 2) + (PI/6))), 5);
        double second = sqrt(X*(pow(A, 3)));
        double thrird = log(abs((A-1.12*X)/4));
        double rezult = first - second - thrird;
        System.out.println(rezult);
        double rezult2 = (pow((cos(pow(X, 2) + (PI/6))), 5)) - (sqrt(X*(pow(A, 3)))) - (log(abs((A-1.12*X)/4)));
        System.out.println(rezult2);
    }

    public void ProblemTwo() {
        System.out.println("Введите значение a и b соответственно: ");
        Scanner nScan = new Scanner(System.in);
        double a = nScan.nextDouble();
        System.out.println("a: " + a);
        double b = nScan.nextDouble();
        System.out.println("b: " + b);
        double result = tan(pow((a + b), 2)) - (cbrt(a + 1.5)) + (a * pow(b, 5)) - (b / (log(pow(a, 2))));
        System.out.println("result is: " + result);
    }

    public void ProblemThree() {
        double a = -5;
        double aMax = 12;
        double deltaA = 3.75;
        double x = 12.1;
        double interval = (abs(a) + abs(aMax)) / deltaA;
        System.out.println("Интервал  Значения");
        for (int i = 0; i <= interval; i++) {
            if (a >= a && a <= aMax) {
                double f = pow(E, a * x) - (3.45 * a);
                System.out.println(a + "|     " + f);
                a += 3.75;

            }
        }

    }

    public void ProblemFour() {
        int upperLimSumm = 11;
        int lowerLimSumm = 6;
        int x = 1;
        int xMax = 8;
        double rezult = 0.0;

        for (int i = 1; i <= xMax; i++ ) {
            for (int j = 1; j <= upperLimSumm; j++) {
                double y = pow((x + 2), 1.3 * lowerLimSumm);
                lowerLimSumm++;
                rezult += y;
            }
            lowerLimSumm = 6;
            System.out.println(rezult);
            rezult = 0.0;
            x++;
        }
    }
}
