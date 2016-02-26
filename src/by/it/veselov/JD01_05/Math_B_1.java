package by.it.veselov.JD01_05;

/**
 * Created by yegorveselov on 18.02.16.
 */
public class Math_B_1 {
    public static void main(String[] args) {

        double d=1;
        double a;
        for (a = -5; a <=12; a = a + 3.75){
            for (int t = 1; t <=3; t++){
                d = d*Math.sin(a - t);
            System.out.println(d);
            }

        }
}}
