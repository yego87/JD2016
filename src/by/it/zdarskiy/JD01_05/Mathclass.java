package by.it.zdarskiy.JD01_05;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.*;
/**
 * Created by sleig_000 on 12.02.2016.
 */
public class Mathclass {
    public static void main (String[] args){

    double x = 234.1;
    double a = PI/2+1;
    double b = pow((sin(a)),2);
    // первая часть

    double c = pow(x,2)+3;
    double d = sqrt(sqrt(c));
    double l = x*d;// вторая часть

    double i = pow(x,3)-1;
    double f = pow(tan(i),3);
    // третья часть

    double j = b+l-f;// делимое итоговый

    double aa = x/2;
    double bb = atan(aa);
    // fist

    double cc = log(17.56);//second
    double dd = bb-cc;//делитель

    double z = j/dd;

    System.out.println(z);
        Mathclass.ex();
        Mathclass.ex2();
        Mathclass.ex3();
        Mathclass.ex4();
}
    public static void ex (){
     double x = 234.1;
        double a = (pow(sin(PI/2+1),2)+(x*sqrt(sqrt(pow(x,2)+3)))- pow(tan(pow(x,3)-1),3))/(atan(x/2)-log(17.56));
        System.out.println(a);
    }
    public static void ex2() {
        double a = 0.94*pow(10,-3);
        double x = 10.093;
        double z = acos(pow(x,2)) - a*sqrt(x/(pow(a,3))) + ((sin(pow(PI/2,3)))/log(2*x));

        System.out.println(z);
        double aa = pow(x,2);
        double bb = acos(aa);

        double cc = sqrt(x/pow(a,3));
        double ccc = cc*a;
        double f = bb - ccc;

        double bbb = PI/2;
        double dd = sin(bbb);
        double ddd = pow(dd,3);
        double ff = log(2*x);
        double fff = ddd/ff;

        double hh = f+fff;


        System.out.println(hh);
    }
    public static void ex3(){

    }
    public static void ex4(){
        double result=0;
        for (int i=6; i<12;i++){
            for (int x=1;x<=8;x++){
                result+=Math.pow(x,(5+1.3*i));
            }
        }
        System.out.printf("%6f\t",result);
        System.out.println();
    }
}
