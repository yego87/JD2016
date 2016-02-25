package by.it.chetovich.JD01_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Pattern;


/**
 * MatLab
 */
public class Main {

    public static void main (String [] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //вводим строку
        Map<String,Var> map = new HashMap<>(); //сюда будем записывать новые переменные с присвоенными им значениями
        List<String> list = new ArrayList<>(map.keySet());  //в лист запишем имена переменных для сортировки

        System.out.println("Вводите выражения, которые хотите вычислить. Для выхода нажмите enter.");

        while(true) {

            System.out.println("Введите выражение для вычисления: ");
            String line = reader.readLine();
            if (line.equals("")) break;

            String[] array = LineToArray.convertLineToArray(line); //разбиваем строку на массив из 2 операндов

            if (!line.contains("=")) { //если строка не содержит знака равно, определяем тип переменных и вычисляем
                Var a = DefineVariable.defineVar(array[0]);  //первый операнд
                Var b = DefineVariable.defineVar(array[1]);  //второй операнд
                Counting.count(a, b, line);  //выполняем вычисления с а и b, line нужна для определения типа вычисления;

            } else { //если строка содержит знак равно, определяем второй операнд и записываем имя переменной и значение в map
                String a = array[0].trim();
                Var b = DefineVariable.defineVar(array[1]);  //второй операнд
                map.put(a, b);
                System.out.println("Операция присваивания выполнена.");
                list.add(a);//также записываем имя переменной в лист, чтобы можно было впоследствии отсортировать
            }
        }


        System.out.println("Если вы хотите увидеть список созданных во время присваивания переменных, введите printvar. ");
        System.out.println("Если вы хотите отсортированный список переменных со значениями, введите sortvar.");

        String out = reader.readLine();

        PrintAssignment.printSortVar(out,map,list); //печатаем список новых переменных в зависимости от того, что ввел пользователь
    }
}
