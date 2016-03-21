package by.it.zebnitskiy.JD_01.JD_01_04.matematika_5;

/**
 * Created by Зебницкий Максим on 2/19/2016.
 */
//Вариант 13;
public class matematika_B_1 {
    public static void main(String[] args){
        double z = 0 ;
        double x ;
        double r = 4.73;
        for (int p = 0; p <25 && p > -6  ; p +=4){
            if (p + r  < 0.5){
                x = Math.pow(Math.sin(r), 5);
            }else if (0.5 <=( p + r ) && ( p + r )  < 3){
                x = 0;
            }else if (( p + r) > 3){
                x = Math.pow((r + 87.34), 1/2);
                z = x + Math.pow(Math.E, r)/2;
            }
        }
        System.out.printf("z = " + "%.3f", z);
    }
}
