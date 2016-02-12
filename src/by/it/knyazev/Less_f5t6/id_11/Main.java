package by.it.knyazev.Less_f5t6.id_11;

/**
 * Created by Artsem Kniazeu on 10.02.2016.
 */
 
import com.sun.deploy.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        //Заменить 5 и 7 заменить символом #

        //Scanner scan = new Scanner(System.in);
        //String s = scan.nextLine();
        String regex = "[а-я_А-Я]{5,}";
        String f = "У лукоморья дуб срубили Кота на мясо зарубили Цепи с ветвей сорвали Русалку в шпроты посадили И наступила красота";
        StringBuilder sb = new StringBuilder(f);
        Pattern p2 = Pattern.compile(regex);
        Matcher m2 = p2.matcher(f);

        while (m2.find()){
            sb.setCharAt(m2.start()+5,'#');
            if(m2.end()-m2.start()>7) {
                System.out.println(m2.start());
                sb.setCharAt(m2.start() + 7, '#');
            }
        }
        System.out.println(sb);
    }
}
