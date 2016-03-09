package by.it.knyazev.JD01.Less_2.B2;

import java.util.Scanner;

/**
 * Created by Artsem Kniazeu on 13.02.2016.
 */
public class Main {
    public static void main(String... args){
        String s = "1 2 3 4 5 6 7 8 9";
        String[] arr = new String[s.length()];
        arr = s.split(" ");

        int f = 3; //ширина

        int row = 0;
        for (int i = 0; i < arr.length ; i++) {
            row++;
            System.out.printf(arr[i] + " ");
            if (0 == row%f){
                System.out.println();
            }
        }
    }
}
