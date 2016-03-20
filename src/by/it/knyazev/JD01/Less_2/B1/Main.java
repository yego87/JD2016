package by.it.knyazev.JD01.Less_2.B1;

import java.util.Scanner;

/**
 * Created by Artsem Kniazeu on 13.02.2016.
 */
public class Main {
     public static void main(String... args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int n = Integer.valueOf(s);
        System.out.println();
        Scanner scan2 = new Scanner(System.in);
        String f = scan2.nextLine();

        String[] interval = new String[f.length()];
        interval = f.split(" ");
        int i0 = Integer.valueOf(interval[0]);
        int i1 = Integer.valueOf(interval[1]);
        if ( (n <= i0 && n>= i1) || (n>=i0&&n<=i1) ){
            System.out.print("T");
        } else{
            System.out.print("F");
        }
    }
}
