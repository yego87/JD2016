package by.it.daylidovich.JD01_06.C.task02;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreatingArrays {
    public static String[] createArrayOfWord(String st){
        Matcher matcher = Pattern.compile("[А-яёЁ]+").matcher(st);
        ArrayList<String> arrayList = new ArrayList<>();
        while (matcher.find()){
            arrayList.add(matcher.group());
        }

        String[] array = new String[arrayList.size()];
        for (int i = 0; i < array.length; i++)
            array[i] = arrayList.get(i).trim();
        return array;
    }

    public static StringBuilder[] createArrayOfWord(StringBuilder st){
        Matcher matcher = Pattern.compile("[А-яёЁ]+").matcher(st);
        ArrayList<StringBuilder> arrayList = new ArrayList<>();
        while (matcher.find()){
            arrayList.add(new StringBuilder(matcher.group().trim()));
        }

        StringBuilder[] array = new StringBuilder[arrayList.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = arrayList.get(i);
        }
        return array;
    }
}
