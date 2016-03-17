package by.it.chetovich.Matlab;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Parser
 */
public class Parser {

    public static void pars(String s) throws ErrorException {

        while (s.contains("(")&&s.contains(")")){

            //паттерн на круглые скобки, внутри любые цифры, знаки, квадратные и фигурные скобки
            Pattern pat = Pattern.compile("\\([\\w\\.\\+\\-\\*\\/\\[\\]\\{\\},]+\\)");
            Matcher mat = pat.matcher(s);
            //получаем первое вхождение
            //удаляем первый символ(открывающую круглую скобку)

            mat.find();
            System.out.println(mat.group());
            String groupNoBraces = mat.group().replace("(", "");
            //удаляем закрывающую скобку
            groupNoBraces = groupNoBraces.replace(")", "");
            //получаем массив операндов выражения
            System.out.println(groupNoBraces);
            String[] lineInBraces = UtilsMatlab.convertLineToArray(groupNoBraces, Patterns.operationType);
            Var a = DefineVariable.defineVar(lineInBraces[0]);
            Var b = DefineVariable.defineVar(lineInBraces[1]);
            //выполняем вычисления с а и b, line нужна для определения типа вычисления;
            String result = Counting.count(a, b, groupNoBraces);
            System.out.println(result);
            //создаём новую строку, где заменяем выражение со скобками на полученный результат вычисления
            String newLine = s.replace(mat.group(), result);
            System.out.println(newLine);
            //заново вызываем метод уже с новой строкой
            pars(newLine);
            break;


        }
        if (!s.contains("(")) {
            System.out.println(s);
            try {
                if (!s.contains("=")) { //если строка не содержит знака равно
                    //разбиваем её на несколько операндов по знакам операции
                    String[] array = UtilsMatlab.convertLineToArray(s,Patterns.operationType);
                    //выполняем вычисления с элементами массива, s нужна для определения типа вычисления;
                    System.out.println(InitialLine.getLine() + " = " + UtilsMatlab.calculateWith2Operands(s,array));

                } else { //если строка содержит знак равно,
                    // разбиваем её по знаку равно на имя переменной  для присваивания и выражение для вычисления
                    String[] array = UtilsMatlab.convertLineToArray(s,"=");
                    String a = array[0].trim();
                    Var b = DefineVariable.defineVar(array[1]);  //второй операнд
                    MapVariables.addVariable(a, b);
                    System.out.println("Операция присваивания выполнена.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат строки.");
            }
        }



    }
}
