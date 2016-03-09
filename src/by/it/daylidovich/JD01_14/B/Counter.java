package by.it.daylidovich.JD01_14.B;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Counter {
    public static String readText(){
        String text = "";
        int s;
        try{
            FileReader reader = new FileReader(new File("src\\by\\it\\daylidovich\\JD01_14\\B\\Input.txt"));
            while (-1 != (s = reader.read())){
                text += (char)s;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла.");
        }
        return text;
    }

    public static void countWord(String text){
        Matcher matcher = Pattern.compile("[\\w]+").matcher(text);
        int count = 0;
        while (matcher.find())
            count++;
        System.out.println("Количество слов в тексте " + count);
    }

    public static void countMarks(String text){
        Matcher matcher = Pattern.compile("[!,.?-]+").matcher(text);
        int count = 0;
        while (matcher.find())
            count++;
        System.out.println("Количество знаков препинания в тексте " + count);
    }
}
