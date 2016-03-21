package by.it.zebnitskiy.JD_01.JD_01_04.matematika_3;

/**
 * Created by Зебницкий Максим on 2/16/2016.
 */
//f= e^ax-3,45a
public class matematika_A_3 {
    public static void main(String[] args) {
        double x= 12.1;
        for (double a = -5;a >=-5 && a<= 12; a+=0.25){
            double s = a*x;

               double q = Math.pow(Math.E, s);
                  double f = q  - 3.45*a;
                      if (a ==3.75){
                        break;

            }
                                System.out.printf("f = " + "%.2f",f );
                            System.out.println();
        }
    }
}


