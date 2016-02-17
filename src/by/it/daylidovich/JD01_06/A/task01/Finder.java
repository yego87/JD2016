package by.it.daylidovich.JD01_06.A.task01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Finder {
    public static void changeSymbols(StringBuffer stIn){
        Matcher mat = Pattern.compile("[А-яёЁ]{5,}").matcher(stIn);
        while (mat.find()){
            if (7 < mat.group().length() || 7 == mat.group().length())
                stIn.setCharAt(mat.start()+6, '#');
            else stIn.setCharAt(mat.start() + 4, '#');
        }
    }
}
