package by.it.dorostchenok.jd01_06.tasks;

import by.it.dorostchenok.jd01_06.string.Constant;
import by.it.dorostchenok.jd01_06.string.Sentence;
import by.it.dorostchenok.jd01_06.string.Word;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB {

    /**
     * 1. Из текста удалить все слова длины 5, начинающиеся на согласную букву.
     * @param text to process
     * @return
     */
    public String deleteWordsOfFiveLength(String text){
        //StringBuilder stringBuilder = new StringBuilder(text);
        Pattern pattern = Pattern.compile(Constant.FIVE_LEN_WORD_REGEX,
                Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CHARACTER_CLASS | Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()){
            return matcher.replaceAll("");
        }else{
            return text;
        }

    }

    public void sortSentences(String text){

        List<Sentence> sentencesList = new ArrayList();
        Pattern pattern = Pattern.compile(Constant.SENTENCE_REGEX);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            String sentence = text.substring(matcher.start(), matcher.end()).replace("\n", " ").trim();
            sentencesList.add(new Sentence(sentence));
        }

        Collections.sort(sentencesList);
        for (Sentence s : sentencesList){
            System.out.println(s);
        }
    }

    public String[] sortWordsBySymbolMatch(String text, char symbolToMatch){
        // List to store all the words from text
        List<Word> words = new ArrayList();
        // Pattern to match single word
        Pattern pattern = Pattern.compile("\\w+", Pattern.UNICODE_CASE | Pattern.UNICODE_CHARACTER_CLASS);
        // Matcher
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String word = text.substring(matcher.start(), matcher.end());
            Word newWord = new Word(word);
            if (!words.contains(newWord)) {
                words.add(newWord);
            }
        }



        String[] str = new String[1];
        return str;
    }
}
