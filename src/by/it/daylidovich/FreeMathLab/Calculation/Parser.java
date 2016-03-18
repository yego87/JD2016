package by.it.daylidovich.FreeMathLab.Calculation;

import by.it.daylidovich.FreeMathLab.variables.Variable;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static by.it.daylidovich.FreeMathLab.InputOutput.Reader.*;
import static by.it.daylidovich.FreeMathLab.InputOutput.Reader.getVariable;

public class Parser {
    public static void processExpression(String stringInput) throws IOException {
        String operation = readOperation(stringInput);
        if (!operation.equals("=")){
            System.out.println(CalculationExpression.calculationExpression(stringInput));
        }
        else
        {
            String name = readNameVariable(stringInput);
            String variable = readExpression(stringInput);
            variable = replacementVariadles(variable);
            if (name != null && variable != null ){
                if (readOperation(variable) == null)
                    getVariable(variable).save(name);
                else
                {
                    getVariable(CalculationExpression.calculationExpression(variable).toString()).save(name);
                }
            }
            else
                System.out.println("Некоректный ввод.");
        }
    }

    private static String replacementVariadles(String expression){
        StringBuilder expressionOut = new StringBuilder(expression);
        Matcher matcher = Pattern.compile("[A-z0-9]+").matcher(expression);
        while (matcher.find()){
            String var  = matcher.group();
            if (null != Variable.getBase().get(var))
                expressionOut.replace(matcher.start(),matcher.end(),Variable.getBase().get(var).toString());
        }
        return expressionOut.toString();
    }
}
