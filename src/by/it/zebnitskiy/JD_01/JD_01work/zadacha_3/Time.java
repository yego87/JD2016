package by.it.zebnitskiy.JD_01.JD_01work.zadacha_3;

/**
 * Created by Зебницкий Максим on 2/10/2016.
 */
public class Time {
    public static void main(String [] args){
        int s =3700;
        int sec = s %60;
        int m = (s - sec)/60;
        int min = m % 60;
        int h = (m - min)/60;
        int hour = h %60 ;
        int d = (h - hour)/24;
        int day = d%7;
        int w = (d - day)/7;
        System.out.println(w + " недель " + d + " суток " + h + " часов " + min + " минут " + sec + " секунд");
    }
}
