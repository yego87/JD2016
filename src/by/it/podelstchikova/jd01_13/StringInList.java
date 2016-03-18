package by.it.podelstchikova.jd01_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class StringInList {
    public static List<String> eStrings () throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number or close.");

        List<String> list = new ArrayList<>();
        while (true) {
            String line = reader.readLine();
            if ("close".equals(line)) break;
            list.add(line);
        }
        return list;
    }
}
