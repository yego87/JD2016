package by.it.telushko.jd02_05;

import java.util.Locale;
import java.util.ResourceBundle;

public class task_A {
    public static void taskAB (String[]args){
        String path = "by/it/telushko/jd02_05/str";

        ResourceBundle bundle = ResourceBundle.getBundle(path);
        System.out.println(bundle.getString("str1"));

        Locale locale = new Locale(args[0],args[1]);
        bundle = ResourceBundle.getBundle(path,locale);
        System.out.println(bundle.getString("str1"));

    }
}
