package by.it.knyazev.JD01.Less_2.B3;

import java.util.Scanner;

/**
 * Created by Artsem Kniazeu on 13.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите a b c | ax^2+bx+c");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] arr = new String[s.length()];
        s = s.trim();
        arr = s.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        System.out.println("Уравнение: "+a+"x^2+"+b+"x+"+c);

        double d = Math.pow(b,2)-4*a*c;
        if (d<0) {
            System.out.println("▲= " + d);
            double sqrt = Math.sqrt(d);
            System.out.println("X1= " + (-b + sqrt) / (2 * a));
            System.out.println("X2= " + (-b - sqrt) / (2 * a));
        }
        else {
            System.out.println("Sorry");
        }
    }
}
