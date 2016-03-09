package by.it.chetovich.JD01_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * string to list
 */
public class EnterStringIntoList {

    public static List<String> enterStrings () throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter numbers, to quit enter end.");

        List<String> list = new ArrayList<>();
        while (true) {
            String line = reader.readLine();
            if ("end".equals(line)) break;
            list.add(line);
        }
        return list;
    }
}
