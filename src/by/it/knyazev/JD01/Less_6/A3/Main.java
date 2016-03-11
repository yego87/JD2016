package by.it.knyazev.JD01.Less_6.A3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Artsem Kniazeu on 17.02.2016.
 */
public class Main {
    public static void main(String... args){
        //Scanner scan = new Scanner(System.in);
        //String s = scan.nextLine();
        String s = "У лукоморья дуб срубили Кота на мясо зарубили Цепи с ветвей сорвали Русалку в шпроты посадили И наступила красота";
        find(s);
    }
    public static String find(String f){
        StringBuilder text = new StringBuilder(f);
        Pattern lett = Pattern.compile("[^a-z_A-Z_А-Я-а-я]");
        Pattern sagl = Pattern.compile("[чсмтбждлрпвфйцкнгшщзх]([а-яА-ЯЁё]+)?[чсмтбждлрпвфйцкнгшщзх]");
        String[] array = lett.split(text);
        int i = 0;
        for (String s : array) {
            Matcher mat = sagl.matcher(s);
            if (mat.matches()) {
                i++;
                System.out.println(s);
            }
        }

        return f;
    }
}
