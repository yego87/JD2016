package by.it.chetovich.JD01_12C3Braces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * JD01_12C3
 */
public class Main {

    public static void main(String[] args) throws IOException {

        String s="15*(4-2/[1*5])-14+[[5-4]+6]-{24}]";
        ArrayList<String> braces= CheckBraces.bracesToArray(s);
        CheckBraces.checkBraces(braces);

    }

}
