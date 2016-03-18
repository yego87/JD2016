package by.it.chetovich.JD02_05;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * print hello in different language
 */
public class PrintHello {

    public static void printHello(Locale locale){

        //locale.setDefault(Locale.ENGLISH);
        ResourceBundle resource = ResourceBundle.getBundle("by.it.chetovich.JD02_05.hello", locale);
        System.out.println(resource.getString("line1"));
    }
}
