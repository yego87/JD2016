package by.it.Baranova.JD01_15.C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ekaterina on 3/6/16.
 */
public class Utils {

    public static String ReadLine()throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String rLine = bufferedReader.readLine();
        //bufferedReader.close();
        return rLine;

    }
}
