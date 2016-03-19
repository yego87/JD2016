package by.it.chetovich.JD02_05;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * print hello in different language
 */
public class PrintHello {

    /**
     *
     * @param locale locale with language and country
     */
    public static void printHello(Locale locale){

        ResourceBundle resource = ResourceBundle.getBundle("by.it.chetovich.JD02_05.hello", locale);
        System.out.println(resource.getString("line1"));
    }
}
