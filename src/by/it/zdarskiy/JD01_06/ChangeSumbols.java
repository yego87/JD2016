package by.it.zdarskiy.JD01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by sleig_000 on 15.02.2016.
 */
public class ChangeSumbols {
    public static void String (StringBuilder sIN){
        Matcher m = Pattern.compile("[А-яеЁ]{5,}").matcher(sIN);
        while (m.find()) {
            if (7 < m.group().length() || 7 == m.group().length()){
            sIN.setCharAt(m.start() + 6, '#');
            sIN.setCharAt(m.start()+4,'#');}
            else
                sIN.setCharAt(m.start()+4,'#');
        }
    }
}
