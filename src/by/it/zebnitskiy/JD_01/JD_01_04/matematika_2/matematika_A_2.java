package by.it.zebnitskiy.JD_01.JD_01_04.matematika_2;

/**
 * Created by Зебницкий Максим on 2/16/2016.
 */
//z= arccosx^2-a√(x/a^3 )  +(〖sin〗^3 π/2)/lg2x;
public class matematika_A_2 {
    public static void main(String[] args){
        double a = 0.00094;
        double x = 10.093;
        double x1 = 2*x;
        double z;
        double p = Math.PI;
        double q =Math.pow(Math.acos(Math.toRadians(x)), 2) ;
        System.out.printf("%.2f",q);
        System.out.println();
        double e = x/Math.pow(a, 3);
        double w = a * Math.pow(e, 1/3);
        System.out.printf("%.5f",w);
        System.out.println();
        double s = Math.pow(Math.sin(p), 1/3)/2;
        double t = Math.log10(x1);
        double r = s/t;
        System.out.printf("%.3f",r);
        System.out.println();
        z = q - w + r;
        System.out.printf("z = " + "%.4f",z);
        System.out.println();

    }

}
