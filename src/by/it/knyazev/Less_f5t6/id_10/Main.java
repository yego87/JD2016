package by.it.knyazev.Less_f5t6.id_10;
/**
 * Created by Artsem Kniazeu on 10.02.2016.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String... args) {
        String regex = "\\w{1,}@\\w{1,}";
        String s = "asdad@asd, 1asdad@asd, asdasdad@asd";
        Pattern p2 = Pattern.compile(regex);
        Matcher m2 = p2.matcher(s);
        while (m2.find()){
            System.out.println("e-mail:"+m2.group());
        }

    }

}
