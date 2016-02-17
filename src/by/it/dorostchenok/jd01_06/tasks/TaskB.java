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

    /**
     * 2. Вывести все предложения заданного текста в порядке возрастания количества слов в каждом из
       них. В предложениях убрать переносы строк.
     * @param text
     */
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

    /**
     * 3. Отсортировать слова в тексте по убыванию количества вхождений з адан ного си мвола, в
       случае равенства — по алфавиту.
     * @param text text to sort
     * @param symbolToMatch symbol to sort by
     * @return sorted String[] array
     */
    public String[] sortWordsBySymbolMatch(String text, String symbolToMatch){
        // List to store all the words from text
        List<Word> words = new ArrayList();
        // Pattern to match single word
        Pattern pattern = Pattern.compile(Constant.WORD_REGEX, Pattern.UNICODE_CASE | Pattern.UNICODE_CHARACTER_CLASS);
        // Matcher
        Matcher matcher = pattern.matcher(text);
        // Find word
        while (matcher.find()) {
            // and get it from text string
            String word = text.substring(matcher.start(), matcher.end());
            // create new Word object representing word itself
            Word newWord = new Word(word.toLowerCase());
            // check if word not in list to avoid duplicates
            if (!words.contains(newWord)) {
                // if true set matchig pattern for Word
                newWord.setMatchesPattern(symbolToMatch);
                // finally add Word to list
                words.add(newWord);
            }
        }
        // List to store final result
        List<String> finalList = new ArrayList<>();

        for (int j = getMaxMatchCount(words); j >= 0; j--){
            List<String> ls = getWordsByMatchCount(j, words);
            Collections.sort(ls);
            finalList.addAll(ls);
        }

        return finalList.toArray(new String[finalList.size()]);
    }


    private int getMaxMatchCount(List<Word> wordsList){
        int maxCount = 0;

        for (Word w : wordsList){
            if (w.getMatchesCount() > maxCount){
                maxCount = w.getMatchesCount();
            }
        }

        return maxCount;
    }

    private List<String> getWordsByMatchCount(int matchCount, List<Word> list){
        List<String> wordsList = new ArrayList<>();

        for (Word w : list){
            if (w.getMatchesCount() == matchCount){
                wordsList.add(w.toString());
            }
        }

        return wordsList;
    }
}
