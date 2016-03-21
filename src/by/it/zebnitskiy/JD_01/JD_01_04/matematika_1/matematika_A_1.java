package by.it.zebnitskiy.JD_01.JD_01_04.matematika_1;

/**
 * Created by Зебницкий Максим on 2/16/2016.
 */

//  y = tg (a + b)^2 - (a + 1.5)^1/3 + ab^5 - b/lna^2;
public class matematika_A_1 {
    public static void main(String[] args){
        double y ;
        double a = 1.21;
        double b = 0.371;

        double d = (a + b);

        double c =  Math.tan(Math.pow(d, 2));
        System.out.printf("%.2f",c);
        System.out.println();
        double f = Math.pow(a + 1.5, 1/3);
        System.out.printf("%.2f",f);
        System.out.println();
        double q = a * Math.pow(b, 5);
        System.out.printf("%.2f",q);
        System.out.println();
        double g = b/Math.log10(Math.pow(a, 2));
        System.out.printf("%.2f",g);
        System.out.println();
        y = c-f+q-g;
        System.out.printf("y = "+"%.2f",y);

    }

}

