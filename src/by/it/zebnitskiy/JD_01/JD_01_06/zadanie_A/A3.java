package by.it.zebnitskiy.JD_01.JD_01_06.zadanie_A;

//В стоке найти слова начинающиеся  и заканчивающиеся гасной буквой

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Зебницкий Максим on 3/3/2016.
 */
public class A3 {

    static boolean Glasnaya(String word){
        //Pattern для гласных букв
        String oae = "яыуаеиоюэ";
        //добавим туда еще и больше
        oae = oae + oae.toUpperCase();
        char first = word.charAt(0);
        char last = word.charAt(word.length()-1);
        //вернем true если гласные в начале и конце
        return (oae.indexOf(first) >= 0 && oae.indexOf(last) >= 0);
    }

    public static void main(String[] args){
        //Задаем строку в которой будем делать поиск слов
        StringBuilder stroka = new StringBuilder(Main.Stroka());
        //сперва переберем слова
        //нам интересны слова из 1 и более букв русских
        //Pattern  для таких слов [а-яА-ЯёЁ]+
        Pattern p = Pattern.compile("[а-яА-ЯёЁ]+ ");
        //теперь получим Matcher - эта структура умеет находить слова по Pattern
        Matcher m = p.matcher(stroka);
        int counter = 0;
        while (m.find())		//пока находятся слова, мы подсчитываем чмсло подходящих под проверку
            if (Glasnaya(m.group())){	//елси проверка показала гласные в начале и конце
                counter++;			//то увеличивается общий счетчик
                System.out.println(m.group());			//и напечатаем слово
            }

        System.out.println(counter);
    }

}
