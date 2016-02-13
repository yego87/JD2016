package by.it.knyazev.Less_2.ls_numb;


/**
 * Created by Artsem Kniazeu on 10.02.2016.
 */
 
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String regex = "[а-я_А-Я]{0,}";
        String f = "У лукоморья дуб срубили Кота на мясо зарубили Цепи с ветвей сорвали Русалку в шпроты посадили И наступила красота";
        StringBuilder sb = new StringBuilder(f);
        Pattern p2 = Pattern.compile(regex);
        Matcher m2 = p2.matcher(f);

        String[] mass = new String[f.length()];
        mass = f.split(" ");

        while (m2.find()){
            Pattern check = Pattern.compile(m2.group());
            //
            for (int i = 0; i < f.length(); i++) {

            }
        }
        System.out.println(sb);
    }
}
