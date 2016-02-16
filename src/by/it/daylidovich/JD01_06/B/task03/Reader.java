package by.it.daylidovich.JD01_06.B.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
    public static char ReadLiter() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String rLine = reader.readLine();
        rLine.trim();
        return rLine.charAt(0);
    }
}
