package by.it.podelstchikova.jd06.TaskA;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void print(String str)
    {
        String regex="\\b[^аоеуиёэюяыАОУЕЁЫИЭЯЮ]{1}[а-я]*[^аоеуиёэюяыАОУЕЁЫИЭЯЮ]{1}\\b";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
int count=0;
        while (m.find()) {
           count++;
        }

System.out.println(count);
        }
}
