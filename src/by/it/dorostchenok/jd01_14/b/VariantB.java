package by.it.dorostchenok.jd01_14.b;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VariantB {

    private Pattern wordPattern = Pattern.compile("\\w+");
    private Pattern punctuationPattern = Pattern.compile("[.,!?\\-]");
    private Matcher wordMatcher;
    private Matcher punctuationMatcher;
    private int allWordsCounter = 0;
    private int allPunctuationCounter = 0;


    public void run(){

        File file = new File(System.getProperty("user.dir") + "/src/by/it/dorostchenok/jd01_14/b/text.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null){
                int wordCount = 0;
                int punctCount = 0;
                wordMatcher = wordPattern.matcher(currentLine);
                punctuationMatcher = punctuationPattern.matcher(currentLine);
                while (wordMatcher.find()){
                    wordCount++;
                }

                while (punctuationMatcher.find()){
                    punctCount++;
                }

                allWordsCounter += wordCount;
                allPunctuationCounter += punctCount;
            }
            System.out.println("Файл: " + file.getCanonicalPath());
            System.out.println("Слов в тексте: " + allWordsCounter);
            System.out.println("Знаков пунктуации в тексте: " + allPunctuationCounter);
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
