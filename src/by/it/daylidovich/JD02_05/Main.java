package by.it.daylidovich.JD02_05;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            String country = "";
            String language = "";
            switch (i){
                case (1):{
                    country = "RU";
                    language = "ru";
                    System.out.println("Русский язык.");
                    break;
                }
                case (2):{
                    country = "BY";
                    language = "be";
                    System.out.println("Беларуская мова.");
                    break;
                }
                default:{
                    System.out.println("English language.");
                }
            }
            Locale current = new Locale(language, country);
            ResourceBundle resourceBundle = ResourceBundle.getBundle("by\\it\\daylidovich\\JD02_05\\filePropertis.str", current);
            System.out.println(resourceBundle.getString("st1") + "\n");
        }
    }
}
