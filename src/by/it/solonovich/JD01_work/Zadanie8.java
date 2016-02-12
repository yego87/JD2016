package by.it.solonovich.JD01_work;

/**
 * Created by Кирилл on 09.02.2016.
 */
public class Zadanie8 {
    public static void main(String[] args) {
        double i = 0;
        double pr = 1;
        int n = 0;
        int x = (int) (Math.random() * 20);
        while (x != 0) {
            pr *= x;
            n++;
            x = (int) (Math.random() * 20);
        }
        if (n != 0) {
            i = pr / n;
        }
        else {
            i = 0;
        }

            System.out.println(i);
        }}


