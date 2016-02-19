package by.it.knyazev.Less_2.A2;

/**
 * Created by Artsem Kniazeu on 10.02.2016.
 */

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        //Scanner scan = new Scanner(System.in);
        //String text = scan.nextLine();
        String text = "1 22 333 4444 55555";
        String[] massiv = new String[text.length()];
        massiv = text.split(" ");

        int min = massiv[0].length(),max = massiv[0].length();

        for (int i = 0; i < massiv.length; i++) {

            if (massiv[i].length()<min){
                min=massiv[i].length();
            }

            if (massiv[i].length()>max){
                max=massiv[i].length();
            }
        }

        int k = 0;
        for (int i = 0; i < massiv.length; i++) {
            k = k + Integer.parseInt(massiv[i]);
            System.out.println(k);
        }
        k = k/massiv.length;
        System.out.println(k);
        for (int i = 0; i < massiv.length; i++) {
            if (Integer.parseInt(massiv[i])<=k){
                System.out.print(massiv[i]);
                System.out.println(" length-" + massiv[i].length());
            }

        }
    }
}
