package by.it.chetovich.Matlab;

import java.io.*;
import java.util.*;


/**
 * MatLab
 */
public class Main {

    public static void main (String [] args) throws IOException, ErrorException {

        Map<String,Var> map = UtilsMatlab.putVarsFromFileIntoMap() ;//восстанавливаем ранее сохранённые переменные из файла
        //List<String> list = new ArrayList<>(map.keySet());  //в лист запишем имена переменных для сортировки

        System.out.println("Вводите выражения, которые хотите вычислить. Для выхода нажмите enter.");

        while(true) {

            System.out.println("Введите выражение для вычисления: ");
            String line = InitialLine.enterLine();
            if (line.isEmpty()) break;
            try {
                Parser.pars(line);
            } catch (Exception e) {
                System.out.println("Не получится посчитать выражение");
            }
        }

        // записываем присвоенные переменные из map в файл
        String src = System.getProperty("user.dir") + "/src/by/it/chetovich/Matlab/vars.txt";
        File file = new File(src);
        UtilsMatlab.saveVarsInFile( file);


        System.out.println("Если вы хотите увидеть список созданных во время присваивания переменных, введите printvar. ");
        System.out.println("Если вы хотите отсортированный список переменных со значениями, введите sortvar.");
        System.out.println("Если всё это вам не интересно, нажмите enter, и всё закончится. ");
        String line = UtilsMatlab.enterLine();
        UtilsMatlab.printVarList(line, MapVariables.getMap()); //печатаем список новых переменных в зависимости от того, что ввел пользователь

    }
}
