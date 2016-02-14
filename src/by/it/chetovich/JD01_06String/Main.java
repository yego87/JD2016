package by.it.chetovich.JD01_06String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user_2 on 12.02.2016.
 */
public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        StringBuilder textB = new StringBuilder(text);

        //Task1
        Task1String task1 = new Task1String();
        task1.changeLiterals(textB);

    }
}
