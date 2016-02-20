package by.it.veselov.JD01_05;

import java.io.IOException;

/**
 * Created by yegorveselov on 15.02.16.
 */
public class Math_A_1 {
    public static void main(String[] args) throws IOException {
        double x = 10.093;
        double a = 0.94;
double z = Math.acos(Math.pow(x,2.0)) ;
z=z- a*Math.sqrt(x);
z=z+ (Math.pow(Math.sin(Math.PI/2 + a),3)/Math.log10(2*x));
System.out.println(z);
        }
    }


