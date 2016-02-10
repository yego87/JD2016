package by.it.novik.JD01_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user_2 on 08.02.2016.
 */
public class A3_main {
    public static void main(String[] args) throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        //String rLine = bufferedReader.readLine();
        String rLine ="6666 888 5646 56 111111";
        bufferedReader.close();
        String [] val = rLine.split(" ");
        A3.printNumWithDifDigits(val);
        System.out.println("");


    }
}
