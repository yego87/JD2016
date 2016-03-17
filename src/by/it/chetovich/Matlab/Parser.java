package by.it.chetovich.Matlab;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Parser
 */
public class Parser {

    public static void pars(String s) throws ErrorException, NullPointerException, ArrayIndexOutOfBoundsException {

        while (s.contains("(")&&s.contains(")")){

            //паттерн на круглые скобки, внутри любые цифры, знаки, квадратные и фигурные скобки
            Pattern pat = Pattern.compile("\\([ \\w\\.\\+\\-\\*\\/\\[\\]\\{\\},]+\\)");
            Matcher mat = pat.matcher(s);
            //получаем первое вхождение
            //удаляем первый символ(открывающую круглую скобку)

            mat.find();
            //System.out.println(mat.group());
            String groupNoBraces = mat.group().replace("(", "");
            //удаляем закрывающую скобку
            groupNoBraces = groupNoBraces.replace(")", "");
            //получаем массив операндов выражения
            //System.out.println(groupNoBraces);
            String[] arrayFromGroup = UtilsMatlab.convertLineToArray(groupNoBraces, Patterns.operationType);
            //выполняем вычисления с а и b, line нужна для определения типа вычисления;
            String result = UtilsMatlab.calculateWith2Operands(groupNoBraces,arrayFromGroup).toString();
            //System.out.println(result);
            //создаём новую строку, где заменяем выражение со скобками на полученный результат вычисления
            String newLine = s.replace(mat.group(), result);
            //System.out.println(newLine);
            //заново вызываем метод уже с новой строкой
            pars(newLine);
            break;


        }
        if (!s.contains("(")) {

            if (!s.contains("=")) { //если строка не содержит знака равно
                //разбиваем её на несколько операндов по знакам операции
                String[] array = UtilsMatlab.convertLineToArray(s,Patterns.operationType);
                //выполняем вычисления с элементами массива, s нужна для определения типа вычисления;

                System.out.println(InitialLine.getLine() + " = " + UtilsMatlab.calculateWith2Operands(s,array));

            } else { //если строка содержит знак равно, разбиваем её по знаку равно
                //  на имя переменной для присваивания varName и выражение для вычисления exToCalculate
                String varName = null;
                String exToCalculate = null;

                String[] arrayWithVarName = UtilsMatlab.convertLineToArray(s,"=");
                varName = arrayWithVarName[0].trim();
                exToCalculate = arrayWithVarName[1].trim();

                //получаем массив из операндов для вычисления
                String [] array = UtilsMatlab.convertLineToArray(exToCalculate,Patterns.operationType);
                //записываем в карту переменных имя и вычисленное значение выражения
                Var var = UtilsMatlab.calculateWith2Operands(exToCalculate,array);
                if (var!=null) {
                    MapVariables.addVariable(varName, var);
                    System.out.println("Операция присваивания выполнена.");
                }
                System.out.println(InitialLine.getLine() +" = "+var);
            }

        }

    }
}
