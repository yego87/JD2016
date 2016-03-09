package by.it.daylidovich.JD01_15.C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reader {
    public static String readInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public static String readCommand(String command){
        Matcher matcher = Pattern.compile("[\\w]+").matcher(command);
        String outString = "";
        if (matcher.find())
            outString = matcher.group();
        return outString;
    }

    public static String readNewAddress(String command){
        Matcher matcher = Pattern.compile("[\\w]+").matcher(command);
        StringBuilder stringBuilder = new StringBuilder(command);
        if (matcher.find())
            stringBuilder.delete(0, matcher.end());
        return stringBuilder.toString().trim();
    }
}
