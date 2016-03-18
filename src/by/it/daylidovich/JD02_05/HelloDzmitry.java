package by.it.daylidovich.JD02_05;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class HelloDzmitry {
    public static void hello(String languageIN){
        String country = "";
        String language = "";
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        switch (languageIN){
            case ("ru"):{
                country = "RU";
                language = "ru";
                dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM ,new Locale("ru","RU"));
                System.out.println("Русский язык.");
                break;
            }
            case ("be"):{
                country = "BY";
                language = "be";
                dateFormat = DateFormat.getDateInstance(DateFormat.LONG, new Locale("de", "BY"));
                System.out.println("Беларуская мова.");
                break;
            }
            default:{
                System.out.println("English language.");
            }
        }
        Locale current = new Locale(language, country);
        Date data = new Date(System.currentTimeMillis());
        ResourceBundle resourceBundle = ResourceBundle.getBundle("by\\it\\daylidovich\\JD02_05\\filePropertis.str", current);
        System.out.println(resourceBundle.getString("st1"));
        System.out.println(dateFormat.format(data) + "\n");
    }
}
