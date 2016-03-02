package by.it.veselov.JD01_05;

/**
 * Created by yegorveselov on 18.02.16.
 */
public class Math_B_2 {
    public static void main(String[] args) {
        double r = 4.73;
        double x;
        for ( double p = -8; p <= 22; p = p + 3.5){
            if ((p + r) < 0.5) x = Math.pow(Math.sin(p),5);
            else if ((p + r) > 3) x = Math.sqrt(Math.abs(Math.pow((p + 7),5)));
            else x = Math.exp(Math.abs(p + 3));
            System.out.println(2*x +Math.exp(r)/2);

        }

}}
