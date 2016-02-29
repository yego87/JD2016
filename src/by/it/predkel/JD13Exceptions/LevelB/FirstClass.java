package by.it.predkel.JD13Exceptions.LevelB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by user_2 on 29.02.2016.
 */
public class FirstClass {
    public static void firstClass() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String rLine = bufferedReader.readLine();
        bufferedReader.close();
        if (rLine.equals(" ")||rLine.isEmpty()||rLine.contains("[0-9]"))
            throw new IllegalArgumentException();
    }
}
