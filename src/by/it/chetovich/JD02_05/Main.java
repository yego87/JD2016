package by.it.chetovich.JD02_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Выберите язык: ru - русский, be - белорусский, en - английский. Для выхода нажмите enter.");
        String line;
        Locale locale = new Locale("","");
        Locale.setDefault(Locale.ENGLISH);
        while (!(line = reader.readLine()).isEmpty()){
            if ("be".equals(line)) locale = new Locale("be","BY");
            if ("ru".equals(line)) locale = new Locale("ru","RU");
            if ("en".equals(line)) locale = new Locale("en","US");
            PrintHello.printHello(locale);
            PrintDate.printDate(locale);
        }
    }
}
