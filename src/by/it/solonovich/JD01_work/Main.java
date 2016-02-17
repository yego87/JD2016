package by.it.solonovich.JD01_work;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args)  {


String regex = "[а-яА-яa-zA-Z]{5,}";
        String f = "У лукоморья дуб зелёный;\n" +
                "Златая цепь на дубе том:\n" +
                "И днём и ночью кот учёный\n" +
                "Всё ходит по цепи кругом;\n" +
                "Идёт направо - песнь заводит,\n" +
                "Налево - сказку говорит.\n" +
                "Там чудеса: там леший бродит,\n" +
                "Русалка на ветвях сидит;";
        StringBuilder sd = new StringBuilder(f);
        Pattern p2 = Pattern.compile(regex);
        Matcher m2 = p2.matcher(f);
        while (m2.find()) {
            sd.setCharAt(m2.start()+4,'#');
            {if (m2.end()-m2.start()>=7){
                System.out.println(m2.start());
                sd.setCharAt(m2.start()+6,'#');}
            }
        }
System.out.println(sd);
    }
}
