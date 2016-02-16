package by.it.lukin.jd02.jd01_1B;

import java.util.Scanner;

/**
 * Определить принадлежность некоторого значения k интервалу [n,m]
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vvedite n: ");
        int n = in.nextInt();
        System.out.println("Vvedite m: ");
        int m = in.nextInt();
        System.out.println("Vvedite k: ");
        int k = in.nextInt();
        if (k > n && k < m){
            System.out.println("Chislo "+ k +" vxodit v promejytok ot " + n + " do " + m );
        }else{
            System.out.println("Chislo "+ k +" ne vxodit v promejytok ot " + n + " do " + m );
        }


    }
}
