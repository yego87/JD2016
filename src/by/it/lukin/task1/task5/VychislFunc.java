package by.it.lukin.task1.task5;

/**
 * Created by алексей on 14.02.2016.
 */
public class VychislFunc {
    public static void main(String[] args){
        double b =0;
        for (double x = -0.3; x < 0.2;x = x+0.1){
            double a = 4*x;
            if (a > -2 && a <= -1){
                b = Math.pow(Math.sin(x+1),3);
                System.out.println("1. Betta = "+b);
            }
            if (a > -1 && a < 0.2){
                b = Math.cos(x*x + Math.pow(3.12,0.3));
                System.out.println("2. Betta = "+b);
            }
            if (a > 0.2){
                b = Math.pow(Math.tan(x),4);
                System.out.println("3. Betta = "+b);
            }

            double m = Math.pow(Math.sqrt(Math.abs(5 * Math.pow(b ,6))),1/3) + Math.pow(Math.E,Math.abs(b-2.04));
            System.out.println("Result = "+m);
        }
    }
}
