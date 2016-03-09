package by.it.knyazev.JD01.Less_6.A2;

import by.it.daylidovich.JD01_06.C.task01.Format;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Artsem Kniazeu on 16.02.2016.
 */
public class Main {
    public static void main(String... args){
        //Scanner scan = new Scanner(System.in);
        //String s = scan.nextLine();
        String s = "lorem vitae lorem";
        find(s);

    }
    public static String find(String s){
        StringBuilder text = new StringBuilder(s);
        Pattern lett = Pattern.compile("[A-Za-z_А-Яа-я]+");
        Matcher match = lett.matcher(text);
        while (match.find()){
            Pattern word = Pattern.compile(match.group());
            Matcher word2 = word.matcher(text);
            int count = 0;
            while (word2.find()){
                count++;
            }
            System.out.println(match.group()+" "+count);
        }
        return s;
    }
}
