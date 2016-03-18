package by.it.knyazev.JD02.less_05;

import java.util.*;

/**
 * <a href="ad">asd</a>
 *
 */
public class Main {
    public static void main(String[] args) {
        for (Integer j = 0; j < 3; j++) {
            char i = j.toString().charAt(0);
            String country = "";
            String language = "";
            switch (i) {
                case '1':
                    country = "RU";
                    language = "RU";
                    System.out.println("\n"+i+" — РУC");

                    break;
                case '2':
                    country = "KUR";
                    language = "kuro4ka";
                    System.out.println("\n"+i+" — Бел");
                    break;
                default:
                    System.out.println("\n"+i+" — Англ ");

            }
            Locale current = new Locale(language, country);
            ResourceBundle rb = ResourceBundle.getBundle("by.it.knyazev.JD02.less_05.lang",current);
            String s1 = rb.getString("MFN_MENU_TITLE");
            System.out.println(s1);
            String s2 = rb.getString("MFN_MENU_BACK");
            System.out.println(s2);
        }
    }
}
