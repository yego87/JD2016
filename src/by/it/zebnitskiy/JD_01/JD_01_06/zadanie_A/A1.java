package by.it.zebnitskiy.JD_01.JD_01_06.zadanie_A;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * В каждом  слове заменить букву 5-ю и 7-ю на. Для слов короче 5 корректировку
 * не выполнять.
 * @param
 * @author Зебницкий Максим
 *
 */
public class A1 {

    public static void main(String[] args){
        //задаем строку для заменны символов
        //т.к. в String делать нельзя
        //записываем в StringBuilder
        StringBuilder stroka = new StringBuilder(Main.Stroka());

        //перебираем все слова
        // необходимые слова длинной от 5 и более
        //Паттерн для таких слов (" [а-яА-яёЁ]{5,}")
        Pattern p = Pattern.compile("[а-яА-ЯёЁ]{5,}");

        //Теперь по заданому условию паттерна запускаем поисковик матчер
        Matcher m  = p.matcher(stroka);
        while (m.find()){  //производим замену в найденых словах
            int start = m.start();// тут храниться позиция букв с которого начинается слово вStringBuilder Stroka
            int length = m.group().length(); // здесь определим длину слова
            stroka.setCharAt(start + 4, '#'); //заменяем 5-й символ (он есть всегда , так указано в Pattern)
            if (length > 6)
                stroka.setCharAt(start + 6, '#');//меняем 7-й символ, если позволяет длина слова
        }
        System.out.println(stroka);
        //выводим
    }

}
