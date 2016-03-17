package by.it.chetovich.JD02_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Utils
 */
public class Utils {

    public static String enterLine () {

        System.out.println("Введите строку для поиска шестнадцатиричных чисел: ");
        String line = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            line = reader.readLine();
        } catch (IOException e) {
            System.out.println("Что-то вы не то ввели.");
        }
        return line;
    }

    public static List<String> findHexadecimal (String s){

        List<String> list = new ArrayList<>();
        Pattern pat = Pattern.compile("\\b0x[\\da-fA-F]+\\b");
        Matcher mat = pat.matcher(s);
        while (mat.find()){
            list.add(mat.group());
        }
        return list;
    }

    public static void printHexadecimal (List <String> list){

        for (String s : list) {
            System.out.println(s);
        }
    }
}
