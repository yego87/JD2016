package by.it.daylidovich.FreeMathLab.Calculation;

import by.it.daylidovich.FreeMathLab.variables.Variable;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static by.it.daylidovich.FreeMathLab.InputOutput.Reader.*;

public class Parser {
    public static void processExpression(String stringInput) throws IOException {
        String name = readNameVariable(stringInput);
        String expression;
        if (null != name)
            expression = readExpression(stringInput);
        else
            expression = stringInput;
        expression = "(" + replacementVariadles(expression) + ")";
        String brackets;
        while (null != (brackets = readBrackets(expression))){
            expression = expression.replace(brackets, CalculationExpression.calculationExpression(brackets).toString());
        }
        if (!expression.contains("(") && !expression.contains(")")){
            System.out.println(expression);
            if (null != name)
                getVariable(expression).save(name);
        }
        else
            System.out.println("Некорректный ввод.");
    }

    //метод заменяет переменные в выражении на их значения
    private static String replacementVariadles(String expression){
        Matcher matcher = Pattern.compile("[A-z0-9]+").matcher(expression);
        while (matcher.find()){
            String var  = matcher.group();
            if (null != Variable.getBase().get(var))
                expression = expression.replace(var, Variable.getBase().get(var).toString());
        }
        return expression;
    }
}
