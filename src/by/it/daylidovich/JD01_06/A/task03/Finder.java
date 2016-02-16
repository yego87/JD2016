package by.it.daylidovich.JD01_06.A.task03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Finder {
    public static void findWord(String stIn){
        String regex = "\\b[уеыаоэяиюУЕЫАОЭЯИЮ][а-яА-ЯёЁ]*[уеыаоэяиюУЕЫАОЭЯИЮ]\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(stIn);
        int count = 0;
        while (matcher.find()){
            count++;
        }
        pattern = Pattern.compile("\\b[уеыаоэяиюУЕЫАОЭЯИЮ]{1}\\b");
        matcher = pattern.matcher(stIn);
        while (matcher.find()){
            count++;
        }
        System.out.println("Количество слов начинающихся и заканчивающихся на гласную равно " + count);
    }
}
