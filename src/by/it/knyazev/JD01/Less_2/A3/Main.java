package by.it.knyazev.JD01.Less_2.A3;

/**
 * Created by Artsem Kniazeu on 13.02.2016.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        String f = "1 12 1223 22 1234";
        String[] mass = new String[f.length()];
        mass = f.split(" ");
        for (String s:mass){
            if (diff(s)) {
                System.out.println(s);
            }
        }
    }

    private static boolean diff(String s) {
        char[] massch = s.toCharArray();
        boolean find = true;
        for (int i = 0; i < s.length(); i++) {
            for (int k = i + 1; k < s.length(); k++) {
                if (massch[i] == massch[k]){
                    find = false;
                }
            }
        }
        return find;
    }
}
