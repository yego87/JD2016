package by.it.chetovich.JD02_05;

import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * prints actual date
 */
public class PrintDate {

    public static void printDate (Locale locale){

        /*Date d = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
        System.out.println(df.format(d));*/

        Date d = new Date();
        DateFormat df = new SimpleDateFormat("EEEE, d MMMM yyyy HH:mm:ss",locale);
        System.out.println(df.format(d));


    }
}
