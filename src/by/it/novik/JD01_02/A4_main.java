package by.it.novik.JD01_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Иван on 09.02.2016.
 */
public class A4_main {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//        String rLine = bufferedReader.readLine();
        String rLine ="6666 888 5646 56 111111";
        bufferedReader.close();
        String [] val = rLine.split(" ");

        A4.checkNum(val[0]);

        for (int i = 0; i < val.length; i++) {
            if (A4.checkNum(val[i])) {
                System.out.println(val[i] + " is palindrom");
            } else {
                System.out.println(val[i] + " is not a palindrom");
            }

        }
    }
}