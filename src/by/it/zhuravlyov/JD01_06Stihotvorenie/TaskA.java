package by.it.zhuravlyov.JD01_06Stihotvorenie;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user_2 on 04.03.2016.
 */
public class TaskA {
        public void TaskA(StringBuilder sb) {
//            ввод данных с main

//            вводим поиск слова с буквами от (а-я) и не меньше чем с 5 буквами
            Pattern pat = Pattern.compile("[а-яА-ЯёЁ]{5,}");
//            с помощью matcher находим слова с патерна с кол-вом от 5 и больше
            Matcher mat = pat.matcher(sb);
//            в этом цикле меняем 5 и 7 букву на #
            while (mat.find()){
                sb.setCharAt(mat.start()+4,'#'); //заменяем 5 букву
                if (mat.end()-mat.start()>7) sb.setCharAt(mat.start()+6,'#');
            }
            System.out.println(sb);
        }

}

