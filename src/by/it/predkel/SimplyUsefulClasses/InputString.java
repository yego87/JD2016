package by.it.predkel.SimplyUsefulClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ввод строки и преобразование в массив слов
 */
public class InputString {
    public static String[] inputString () throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        String rLine = bufferedReader.readLine();
        bufferedReader.close();

        String[] str = rLine.split(" ");

        return str;
    }
}
