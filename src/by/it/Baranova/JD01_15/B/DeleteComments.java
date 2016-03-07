package by.it.Baranova.JD01_15.B;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ekaterina on 3/4/16.
 */
public class DeleteComments {

    public static String deleteComments(StringBuilder str){
        String newstr=str.toString();
        newstr=newstr.replaceAll("(//.*\\n)|(/*[*]{1,2}.*[*]*/*)\\n","");
        return newstr;
    }
}
