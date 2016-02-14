package by.it.dorostchenok.jd01_06.tasks;

import by.it.dorostchenok.jd01_06.string.Constatnt;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA {

    /**
     * 1. В каждом слове текста буквы No 5-ю и 7-ю заменить символом #. Для слов короче 5
     корректировку не выполнять.
     * @param text
     * @return
     */
    public String replaceCharacters(String text){
        // create empty buffer for final result
        StringBuilder stringBuilder = new StringBuilder();
        // create pattern to match punctuation marks;
        Pattern pattern = Pattern.compile(Constatnt.PUNCTUATION_REGEX);
        // split text to sentences
        for (String sentence : text.split("\n")){
            // separate builder for sentence.
            // needed to avoid trailing space at the end of the string
            StringBuilder sentenceBuilder = new StringBuilder();
            // split sentence to words
            for (String word : sentence.split(" ")){
                // trim word in case two or more whitespaces divide words
                // split any word using regex to cut off punctuation marks
                String trimedWord = word.trim();
                String punctuationMark = "";
                Matcher matcher = pattern.matcher(trimedWord);
                // if punctuation mark at the end of the word
                if (matcher.find()){
                    // split word to get rid of punctuation
                    String cleanWord = trimedWord.split(Constatnt.PUNCTUATION_REGEX)[0];
                    // find punctuation mark to restore it in future
                    punctuationMark = trimedWord.split(cleanWord)[1];
                    trimedWord = cleanWord;
                }
                // replace 5-th and 7-th symbol with #
                if(trimedWord.length() >= 5){
                    StringBuilder sb = new StringBuilder(trimedWord);
                    sb.replace(4, 5, "#");
                    if(sb.length() >= 7 ){
                        sb.replace(6, 7, "#");
                    }
                    // append to sentence
                    sentenceBuilder.append(sb);
                    sentenceBuilder.append(punctuationMark);
                    sentenceBuilder.append(" ");
                }else{
                    // Yes, code repeating here, but we don't make unnecessary
                    // StringBuilder object and add string directly to sentence
                    sentenceBuilder.append(trimedWord);
                    sentenceBuilder.append(punctuationMark);
                    sentenceBuilder.append(" ");
                }
            }
            // trim sentence to avoid whitespace at the and of it
            stringBuilder.append(sentenceBuilder.toString().trim());
            // add new string to restore original text structure
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }

    /**
     * 2. Определить, сколько раз повторяется в тексте каждое слово, которое встречается в нем.
     * @param text
     * @param caseSensitive
     */
    public void countWords(String text, boolean caseSensitive){
        StringBuilder stringBuilder = new StringBuilder(text);
        for (String s : text.split("\n")){
            for (String word : s.split(" ")){
                String[] array = word.trim().split(Constatnt.NOT_A_WORD_REGEX);
                if (array.length >= 1){
                    int count = 0;
                    String wordToFind = array[0];
                    Pattern pattern;
                    if(caseSensitive){
                        pattern = Pattern.compile("\\b" + wordToFind + "\\b");
                    }else{
                        pattern = Pattern.compile("\\b" + wordToFind + "\\b",
                                Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
                    }
                    Matcher matcher = pattern.matcher(stringBuilder);
                    while (matcher.find()){
                        count++;
                    }
                    stringBuilder = new StringBuilder(matcher.replaceAll("").trim());
                    if (count != 0){
                        System.out.println(String.format("%10s%3s", wordToFind, count));
                    }
                }
            }
        }
    }

    /**
     * @see public void countWords(String text, boolean caseSensitive)
     * @param text
     */
    public void countWords(String text){
        countWords(text, false);
    }

    /**
     * 3. В стихотворении найти количество слов начинающихся и заканчивающихся гласной буквой.
     * @param text
     * @return
     */
    public int countStartEndVowelWords(String text){
        int count = 0;
        Pattern pattern = Pattern.compile(Constatnt.START_END_VOWEL_REGEX,
                Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CHARACTER_CLASS | Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
                count++;
        }

        return count;
    }
}
