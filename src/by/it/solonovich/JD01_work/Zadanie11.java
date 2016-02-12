package by.it.solonovich.JD01_work;

/**
 * Created by Кирилл on 11.02.2016.
 */
public class Zadanie11 {
    public static void main(String[] args) {
        double x;
        double y;
        for (x = -2; x <= 2; x+=0.2) {
            if (x==0){
                break;
            }
            y = 1/x;
            System.out.println("x = " + x + " y = "+y+ "\n" );


        }
    }
}
