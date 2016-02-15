package by.it.telushko.jd01_06;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA {
    public static void taskA1(String text){
        StringBuilder sbText=new StringBuilder(text);
        Pattern word= Pattern.compile("[а-яА-ЯёЁ]{5,}");
        Matcher okWord=word.matcher(text);
        while(okWord.find()){
            int wordLength=okWord.end()-okWord.start();
            sbText.setCharAt(okWord.start()+4,'#');
            sbText.setCharAt(okWord.start()+6,'#');
        }
         System.out.print(sbText);
    }
}
