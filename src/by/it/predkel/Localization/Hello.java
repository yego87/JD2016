package by.it.predkel.Localization;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by user_2 on 18.03.2016.
 */
public class Hello {
    public static void hello(Locale current){
        ResourceBundle rb=ResourceBundle.getBundle("by.it.predkel.Localization.LocalFiles.string", current);
        String str=rb.getString("str");
        System.out.println(str);
    }
}
