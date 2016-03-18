package by.it.daylidovich.FreeMathLab.Calculation;

import by.it.daylidovich.FreeMathLab.variables.Variable;

import java.io.IOException;

import static by.it.daylidovich.FreeMathLab.InputOutput.Reader.*;
import static by.it.daylidovich.FreeMathLab.InputOutput.Reader.getVariable;

public class CalculationExpression {

    public static Variable calculationExpression(String stringInput) throws IOException {
        String operation = readOperation(stringInput);
        String firstTerm = readFirstTerm(stringInput);
        String secondTerm = readSecondTerm(stringInput);
        if (firstTerm != null && secondTerm != null && operation != null){
            switch (operation){
                case "+":
                    try{
                        return getVariable(firstTerm).add(getVariable(secondTerm));
                    }
                    catch (ArrayIndexOutOfBoundsException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "-":
                    try{
                        return getVariable(firstTerm).sub(getVariable(secondTerm));
                    }
                    catch (ArrayIndexOutOfBoundsException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "*":
                    try{
                        return getVariable(firstTerm).mult(getVariable(secondTerm));
                    }
                    catch (ArrayIndexOutOfBoundsException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "/":
                    try{
                       return getVariable(firstTerm).div(getVariable(secondTerm));
                    }
                    catch (ArithmeticException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Некоректный ввод.");
                    return null;
            }
        }
        else{
            System.out.println("Некоректный ввод.");
        }
        return null;
    }
}
