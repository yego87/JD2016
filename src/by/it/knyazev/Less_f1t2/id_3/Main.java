package by.it.knyazev.Less_f1t2.id_3;

/**
 * Created by Artsem Kniazeu on 10.02.2016.
 */

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
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

        for (int i = 0; i < massiv.length; i++) {
            int k;
            k = (min + max)/2;

            if (massiv[i].length()<=k){
                System.out.print(massiv[i]);
                System.out.println(" length-" + massiv[i].length());
            }

        }
    }
}
