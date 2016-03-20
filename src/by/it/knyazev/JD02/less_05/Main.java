package by.it.knyazev.JD02.less_05;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

/**
 * <a href="ad">asd</a>
 *
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("ru | pl | en");
        String line = new Scanner(System.in).nextLine();
        String country = "";
        String language = "";

        switch (line) {
            case "ru": {
                country = "RU";
                language = "RU";
                break;
            }
            case "pl": {
                country = "PL";
                language = "pol";
                break;
            }
            default: {
                break;
            }
        }

        Locale current = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("by.it.knyazev.JD02.less_05.lang",current);
        String s1 = rb.getString("MFN_DATE");
        String s2 = rb.getString("MFN_TIME");
        SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd");
        SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss:S");
        System.out.println(s1+": "+date.format(new Date())+" "+s2+": "+time.format(new Date()));
        System.out.println();
    }
}
