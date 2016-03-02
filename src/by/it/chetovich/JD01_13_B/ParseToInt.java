package by.it.chetovich.JD01_13_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * String to Integer
 */
public class ParseToInt {

    public static void parse (String line) throws NumberFormatException {

        System.out.println("Number you've entered: "+Integer.parseInt(line));
    }
}
