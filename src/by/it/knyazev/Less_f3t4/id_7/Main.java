package by.it.knyazev.Less_f3t4.id_7;


/**
 * Created by Artsem Kniazeu on 10.02.2016.
 */
 
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        //String s = " 1 2 3 4 5 6";
        s = s.trim();
        String[] arr = new String[s.length()];
        arr = s.split(" ");
        int f = Integer.valueOf(arr[0]);
        int row = 0;
        for (int i = 1; i < arr.length ; i++) {
            row++;
            System.out.printf(arr[i] + " ");
            if (0 == row%f){
                System.out.println();
            }
        }
    }
}
