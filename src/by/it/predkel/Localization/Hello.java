package by.it.predkel.Localization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by user_2 on 18.03.2016.
 */
public class Hello {
    public static void hello(String lang,String country){
        Locale current=new Locale(lang,country);
        ResourceBundle rb=ResourceBundle.getBundle("by.it.predkel.Localization.LocalFiles.string", current);
        String str=rb.getString("str");
        System.out.println(str);
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, current);
        System.out.println(df.format(new Date()));
    }
}
