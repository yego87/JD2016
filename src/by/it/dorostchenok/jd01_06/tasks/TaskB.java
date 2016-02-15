package by.it.dorostchenok.jd01_06.tasks;

import by.it.dorostchenok.jd01_06.string.Constant;
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
}
