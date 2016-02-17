package by.it.chetovich.JD01_02_04;

/**
 * Created by Yultos_ on 03.02.2016.
 */
public class B3equation {
    public void calculateEquation (int a, int b, int c)
    {
        int d = b*b+4*a*c;
        double dSqrt = Math.sqrt(d);
        double answer1 = (-b+dSqrt)/2*a;
        double answer2 = (-b-dSqrt)/2*a;
        System.out.print("The answers for the quadratic equation are: ");
        System.out.printf("x1 = "+"%.4f",answer1);
        System.out.print(", ");
        System.out.printf("x2 = "+"%.4f",answer2);

    }
}
