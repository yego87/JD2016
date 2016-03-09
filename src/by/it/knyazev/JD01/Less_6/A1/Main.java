package by.it.knyazev.JD01.Less_6.A1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Artsem Kniazeu on 16.02.2016.
 */
public class Main {
    public static void main(String... args){
        //Scanner scan = new Scanner(System.in);
        //String s = scan.nextLine();
        String s = "lorem ipsum dolor sit amet consectetur adipisicing elit sit in nemo consectetur fugiat quis iusto natus facere repudiandae tenetur dignissimos vitae";
        StringBuilder text = new StringBuilder(s);
        Pattern nope = Pattern.compile("[A-Za-z_А-Яа-я]{5,}");
        Matcher match = nope.matcher(text);
        while (match.find()){
            if (match.end()-match.start()>7) {
                text.setCharAt(match.start()+6,'#');
            }
        }
        System.out.println(text);
    }
}