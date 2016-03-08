package by.it.chetovich.Matlab;

import java.io.*;
import java.util.*;


/**
 * MatLab
 */
public class Main {

    public static void main (String [] args) throws IOException, ErrorException {

        Map<String,Var> map = UtilsMatlab.putVarsFromFileIntoMap() ;//восстанавливаем ранее сохранённые переменные из файла
        List<String> list = new ArrayList<>(map.keySet());  //в лист запишем имена переменных для сортировки

        System.out.println("Вводите выражения, которые хотите вычислить. Для выхода нажмите enter.");

        while(true) {

            System.out.println("Введите выражение для вычисления: ");
            String line = UtilsMatlab.enterLine();
            if (line.isEmpty()) break;

            String[] array = UtilsMatlab.convertLineToArray(line); //разбиваем строку на массив из 2 операндов

            try {
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
            catch (NumberFormatException e){
                System.out.println("Неверный формат строки.");
            }
        }

        // записываем присвоенные переменные из map в файл
        String src = System.getProperty("user.dir") + "/src/by/it/chetovich/Matlab/vars.txt";
        File file = new File(src);
        UtilsMatlab.saveVarsInFile(map, file);


        System.out.println("Если вы хотите увидеть список созданных во время присваивания переменных, введите printvar. ");
        System.out.println("Если вы хотите отсортированный список переменных со значениями, введите sortvar.");
        System.out.println("Если всё это вам не интересно, нажмите enter, и всё закончится. ");
        String line = UtilsMatlab.enterLine();
        UtilsMatlab.printVarList(line, map); //печатаем список новых переменных в зависимости от того, что ввел пользователь

    }
}
