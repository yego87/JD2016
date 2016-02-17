package by.it.podelstchikova.jd06.TaskA;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void valueCount(String str)
    {   String[] st= str.split(" ");
        int k=0;
        for (int i = 0; i < st.length; i++) {
            String regex = st[i];
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(str);
            while (m.find()) k+=1;
            System.out.println(st[i]+" "+ k);
        k=0;
        }
    }
}
