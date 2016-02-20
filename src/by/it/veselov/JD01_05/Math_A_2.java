package by.it.veselov.JD01_05;

/**
 * Created by yegorveselov on 18.02.16.
 */
public class Math_A_2 {
    public static void main(String[] args) {
        double x = 3.24;
        double a = 5.8;
        double z = Math.atan(Math.pow(x, 2)) + Math.pow(Math.cos(Math.PI / 2 - a), 3) / (Math.abs(x - Math.pow(a, 1.0 / 5.0)));
        System.out.printf("z=%2.4f",z);
    }
}
