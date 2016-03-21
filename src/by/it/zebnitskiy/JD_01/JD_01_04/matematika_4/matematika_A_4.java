package by.it.zebnitskiy.JD_01.JD_01_04.matematika_4;

/**
 * Created by Зебницкий Максим on 2/19/2016.
 */
//Вариант 13;
public class matematika_A_4 {
    public static void main(String[] args){
        double m = 0;
        for (double t =2 ; t <=3; t+=0.1 ) {
            m=0;
            for (double d = 23; d <=39; d++ ){
                m = Math.log10(Math.abs(d - t));
                System.out.printf("m = " + "%.2f", m);
                System.out.println();
            }
        }
    }
}
