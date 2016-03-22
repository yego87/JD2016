package by.it.predkel.Localization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 * Created by user_2 on 18.03.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        Locale mine = new Locale("", "");
        Locale.setDefault(Locale.ENGLISH);
        while (!(line = reader.readLine()).equals("end")) {
            switch (line){
                case "be":
                    mine = new Locale("be", "BY");
                    break;
                case "ru":
                    mine = new Locale("ru", "RU");
                    break;
                case "en":
                    mine = new Locale("en", "US");
                    break;
            }
            Hello.hello(mine);
            MyDate.myDate(mine);
        }
    }
}