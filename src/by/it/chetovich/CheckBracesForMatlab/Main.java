package by.it.chetovich.CheckBracesForMatlab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 */
public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an expression with braces: ");
        StringBuilder s = new StringBuilder(reader.readLine());
        reader.close();
        CheckBraces.searcPattern();
    }
}
