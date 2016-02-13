package by.it.novik.JD01_06;//package by.it.novik.JD01_06;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A1 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("У лукоморья дуб зелёный, златая цепь на дубе том:" +
        		"и днём и ночью кот учёный всё ходит по цепи кругом");

        Pattern howToSplit = Pattern.compile("[а-яё]{5,}");
        
        Matcher m1=howToSplit.matcher(s);
        
        while (m1.find()) {
            m1.start();
            s.setCharAt(m1.start()+4,'#');
            if ((m1.end()-m1.start())>=7) {
                s.setCharAt(m1.start() + 6, '#');
            }
        }
       System.out.println(s);
    }
}
