package by.it.predkel.Localization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Admin on 20.03.2016.
 */
public class MyDate {
    public static void myDate(Locale current){
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, current);
        System.out.println(df.format(new Date()));
    }
}
