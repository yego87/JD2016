package by.it.solonovich.JD01_work;

/**
 * Created by Кирилл on 08.02.2016.
 */
public class Zadanie3 {
    public static void main(String[] args) {
        int s = 12000000;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;

        int hour=h%24;
        int d=(h-hour) / 24;
        int day=d%7;
        int w=(d-day)/7;
        int week = w/7;





        System.out.print(week + " недель " + day +" суток " + hour + " часов " + min + " минут " + sec + " секунд");
    }
}