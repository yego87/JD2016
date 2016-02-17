package by.it.podelstchikova.jd06.TaskA;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void printStr(String str)
    {

        String regex="([а-яА-я]{5,})";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        StringBuffer stringBuffer = new StringBuffer(str);

        while (m.find()) {
            stringBuffer.setCharAt(m.start() + 4, '#');
            if (m.group().length()>6) {
                stringBuffer.setCharAt(m.start() + 6, '#');
            }

        }
        str=stringBuffer.toString();
        System.out.println(str);


    }
}
