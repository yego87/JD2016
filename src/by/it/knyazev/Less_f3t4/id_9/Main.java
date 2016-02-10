package by.it.knyazev.Less_f3t4.id_9;


/**
 * Created by Artsem Kniazeu on 10.02.2016.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String s = scan.nextLine();
        int i = Integer.parseInt(s);
        if (i>0 && i<=12) {
                         if (1 == i) {
                System.out.println("Jan");
            }            if (2 == i) {
                System.out.println("Feb");
            }            if (3 == i) {
                System.out.println("Mar");
            }            if (4 == i) {
                System.out.println("Apr");
            }            if (5 == i) {
                System.out.println("May");
            }            if (6 == i) {
                System.out.println("Jun");
            }            if (7 == i) {
                System.out.println("Jul");
            }            if (8 == i) {
                System.out.println("Aug");
            }            if (9 == i) {
                System.out.println("Sept");
            }            if (10 == i) {
                System.out.println("Oct");
            }            if (11 == i) {
                System.out.println("Nov");
            }            if (12 == i) {
                System.out.println("Dec");
            }
        }        else {
            System.out.println("Sorry");
        }
    }
}
