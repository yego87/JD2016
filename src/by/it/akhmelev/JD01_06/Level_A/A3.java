package by.it.akhmelev.JD01_06.Level_A;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A3 {

    static boolean Glasnaya(String word){
        //паттерн для гласных букв
        String oae="яыуаиеоюэ";
        //добавим туда еще и большие
        oae=oae+oae.toUpperCase();
        char first=word.charAt(0);
        char last=word.charAt(word.length()-1);
        return (oae.indexOf(first)>=0 && oae.indexOf(last)>=0);
    }

    public static void main(String[ ] args) {
        //Получим строку в которой можно проводить замену символов.
        StringBuilder text=new StringBuilder(Data.lukomor);
        //сначала переберем все слова.
        //Нас интересуют слова с длиной 5 и выше
        //Паттерн для таких слов [а-яА-ЯёЁ]{5,}
        Pattern p=Pattern.compile("[а-яА-ЯёЁ]+");
        //Теперь получим matcher - эта структура умеет находит слова по паттерну
        Matcher m=p.matcher(text);
        int counter=0;
        while (m.find()) //пока находятся слова, мы подсчитываем число подходящих под проверку
            if (Glasnaya(m.group()))
            {
                counter++;
                System.out.println(m.group());
            }

        System.out.print(counter);

    }


}
