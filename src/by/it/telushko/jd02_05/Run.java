package by.it.telushko.jd02_05;

import by.it.akhmelev.JD01_06.Level_A.Data;
import by.it.telushko.jd01_02.InOut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class Run {
    public static void main(String[] args) throws IOException {
        System.out.println("en be ru");
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line =  bufferedReader.readLine();
        String lang="";
        String country="";

        switch (line){
            case "ru":{lang="ru";country="RU";break;}
            case "en":{lang="en";country="US";break;}
            case "be":{lang="be";country="BY";break;}
        }

        String path = "by/it/telushko/jd02_05/str";
        Locale locale = new Locale(lang,country);
        Date date = new Date(System.currentTimeMillis());
        DateFormat df= DateFormat.getDateInstance(DateFormat.FULL,locale);
        ResourceBundle bundle = ResourceBundle.getBundle(path,locale);
        System.out.println(bundle.getString("str1"));
        System.out.println(bundle.getString("str2"));
        System.out.println(df.format(date));
    }
}
