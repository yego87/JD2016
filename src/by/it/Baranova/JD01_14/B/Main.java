package by.it.Baranova.JD01_14.B;

import by.it.Baranova.JD01_15.B.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ekaterina on 3/5/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String src = System.getProperty("user.dir") + "/src/by/it/Baranova/";
        String filename = src + "JD01_14/B/text.txt";
        File f = new File(filename);

        int wordsQ = 0;
        int punctuationQ = 0;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(f));
            String line;

            while ((line = reader.readLine()) != null) {
                Pattern p1 = Pattern.compile(Patterns.words);
                Matcher m1 = p1.matcher(line);
                while (m1.find()) {
                    wordsQ++;
                }
                Pattern p2 = Pattern.compile(Patterns.punctuation);
                Matcher m2 = p2.matcher(line);
                while (m2.find()) {
                    punctuationQ++;
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка файла:" + e);
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
        System.out.println("Количество слов " + wordsQ);
        System.out.println("Количество знаков препинания "+punctuationQ);
    }
}
