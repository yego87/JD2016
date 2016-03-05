package by.it.Baranova.JD01_15.B;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ekaterina on 3/4/16.
 */
public class DeleteComments {

    public static String deleteComments(StringBuilder str){
        String newstr=str.toString();
        Pattern p1=Pattern.compile(Patterns.comments1);
        Pattern p2=Pattern.compile(Patterns.comments2);
        Matcher m1=p1.matcher(newstr);
        Matcher m2=p2.matcher(newstr);
        while (m1.find()) {
            System.out.println(m1.group());
            newstr=newstr.replaceAll(m1.group(),"");
        }
        while (m2.find()) {
            System.out.println(m2.group());
            newstr=newstr.replaceAll(m2.group(),"");
        }

        System.out.println(newstr);
        return newstr;
    }
}
