package by.it.Baranova.JD02.JD02_05;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class PrintToConsole {

    public static void printToConsole (String j){
        String i=j;
        if (i.equals("1")){i="ru";}
        if (i.equals("2")){i="be";}
        DateFormat df=DateFormat.getDateInstance(DateFormat.MEDIUM,Locale.US);
        String country="";
        String language="";
        switch (i) {
            case("ru"):
                country="RU";
                language="RU";
                System.out.println("\n"+i+" - русский");
                df= DateFormat.getDateInstance(DateFormat.LONG,new Locale("ru","RU"));
                break;
            case ("be"):
                country="BY";
                language="be";
                System.out.println("\n"+i+" - беларуский");
                df=DateFormat.getDateInstance(DateFormat.FULL,new Locale("be","BY"));
                break;
            default:
                System.out.println("\n"+i+" - английский");
        }

        Date today=new Date(System.currentTimeMillis());
        Locale current=new Locale(language,country);
        Locale.setDefault(new Locale("en","US"));
        ResourceBundle res=ResourceBundle.getBundle("by.it.Baranova.JD02.JD02_05.test", current);
        String s1=res.getString("str1");
        System.out.println(s1);
        System.out.println(df.format(today));

    }
}
