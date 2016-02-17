package by.it.knyazev.Less_6.B1;

import java.util.regex.Pattern;

/**
 * Created by Artsem Kniazeu on 17.02.2016.
 */
public class Main {
    public static void main(String... args){
        String s = "У лукоморья дуб срубили Кота на мясо зарубили Цепи с ветвей сорвали Русалку в шпроты посадили И наступила красота";
        find(s);
    }
    public static String find(String f){
        Pattern pat = Pattern.compile("\\s[чсмтбждлрпвфйцкнгшщзх]{1}[а-яА-ЯёЁ]{0,}[чсмтбждлрпвфйцкнгшщзх]{1}\\b");
        String [] array = pat.split(f);
        for (String s : array) {
            System.out.print(s);
        }
        return f;
    }
}
