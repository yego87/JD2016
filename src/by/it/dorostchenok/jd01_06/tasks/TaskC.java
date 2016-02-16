package by.it.dorostchenok.jd01_06.tasks;

import by.it.dorostchenok.jd01_06.string.Constant;
import by.it.dorostchenok.jd01_06.string.Word;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskC {
    /**
     * 1. Выполнить форматирование с выравниванием по обоим краям. Для этого добавить
        дополнительные пробелы между словами.
     * @param text текст для форматирования по краям
     * @return отформатированный текст
     */
    public String formatText(String text){
        StringBuilder stringBuilder = new StringBuilder();
        int finalLength = getMaxStringLength(text);

        for (String str : text.split("\n")){
            String[] wordArray = str.split(" ");
            int numberOfSpaces = wordArray.length - 1;
            int spacesToAdd = finalLength - str.length();
            int x = spacesToAdd / numberOfSpaces;
            int y = spacesToAdd % numberOfSpaces;
            int[] spacesArr = new int[numberOfSpaces];
            Arrays.fill(spacesArr, x);
            for (int j = 0; j < y; j++){
                spacesArr[j] += 1;
            }

            for (int j = 0; j < wordArray.length; j++){
                stringBuilder.append(wordArray[j]);
                if (j < spacesArr.length){
                    for (int i = 0; i <= spacesArr[j]; i++){
                        stringBuilder.append(" ");
                    }
                }
                if (j == spacesArr.length){
                    stringBuilder.append("\n");
                }
            }
        }

        return stringBuilder.toString();
    }

    private int getMaxStringLength(String text){
        int length = 0;
        for(String s : text.split("\n")){
            if (s.length() > length){
                length = s.length();
            }
        }

        return length;
    }

    /**
     * 2. Сложить из случайных из слов стихотворения строку ровно (!) в миллион си мволов путем
       конкатенации. Слова через пробел. Последнее слово нужно подобрать по длине.
     * @param text текст для случайных слов
     * @param stringLength длина строки, которую нужно получить
     * @return полученная сторка случайных слов
     */
    public String concatOneMillionString(String text,  int stringLength){

        String[] allWordsArray = getAllWords(text);
        Random random = new Random();
        String result = "";
        int targetLength = stringLength;
        while (result.length() < targetLength){
            int currentLength = result.length();
            String lastWord = getWordWithLength(targetLength - currentLength, allWordsArray);
            if (lastWord != null){
                result += lastWord;
                break;
            }
            result += allWordsArray[random.nextInt(allWordsArray.length)];
            result += " ";
        }

        return result;
    }

    /**
     * 2. Сложить из случайных из слов стихотворения строку ровно (!) в миллион си мволов путем
        конкатенации. Слова через пробел. Последнее слово нужно подобрать по длине. Реализация
        с использованием StringBuilder
     * @param text текст для случайных слов
     * @param stringLength длина строки, которую нужно получить
     * @return полученная сторка случайных слов
     */
    public String concatOneMillionStringBuffered(String text, int stringLength){

        String[] allWordsArray = getAllWords(text);
        Random random = new Random();
        StringBuilder result = new StringBuilder();
        int targetLength = stringLength;
        while (result.length() < targetLength){
            int currentLength = result.length();
            String lastWord = getWordWithLength(targetLength - currentLength, allWordsArray);
            if (lastWord != null){
                result.append(lastWord);
                break;
            }
            result.append(allWordsArray[random.nextInt(allWordsArray.length)]);
            result.append(" ");
        }

        return result.toString();
    }

    private String[] getAllWords(String text){

        List<String> words = new ArrayList();
        Pattern pattern = Pattern.compile(Constant.WORD_REGEX, Pattern.UNICODE_CASE | Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String word = text.substring(matcher.start(), matcher.end());
            Word newWord = new Word(word.toLowerCase());
            if (!words.contains(newWord.toString())) {
                words.add(newWord.toString());
            }
        }

        return words.toArray(new String[words.size()]);
    }

    private String getWordWithLength(int wordLength, String[] wordsArray){
        for (String w : wordsArray){
            if (w.length() == wordLength){
                return w;
            }
        }

        return null;
    }
}
