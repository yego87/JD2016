package by.it.daylidovich.FreeMathLab;

import by.it.daylidovich.FreeMathLab.variables.Variable;

import java.io.IOException;

import static by.it.daylidovich.FreeMathLab.Reader.*;

public class Main {
    public static void main(String[] args) throws IOException {
        SaveReadVariables.readBase();
        System.out.println("Введите выражение для рассчета или сохранения переменной.\n" + "Нажмите Enter для выхода.");
        String string = readInput();
        while (string.trim().length() != 0){
            switch (string){
                case "printvar":{
                    Variable.printVariables();
                    break;
                }
                case "sortvar":{
                    Variable.sortVariable();
                    break;
                }
                default:{
                    String operation = readOperation(string);
                    if (operation != null && !operation.equals("=")){
                        String firstTerm = readFirstTerm(string);
                        String secondTerm = readSecondTerm(string);
                        if (firstTerm != null && secondTerm != null){
                            switch (operation){
                                case "+":
                                    try{
                                        System.out.println(getVariable(firstTerm).add(getVariable(secondTerm)));
                                    }
                                    catch (ArrayIndexOutOfBoundsException e){
                                        System.out.println(e.getMessage());
                                    }
                                    break;
                                case "-":
                                    try{
                                        System.out.println(getVariable(firstTerm).sub(getVariable(secondTerm)));
                                    }
                                    catch (ArrayIndexOutOfBoundsException e){
                                        System.out.println(e.getMessage());
                                    }
                                    break;
                                case "*":
                                    try{
                                        System.out.println(getVariable(firstTerm).mult(getVariable(secondTerm)));
                                    }
                                    catch (ArrayIndexOutOfBoundsException e){
                                        System.out.println(e.getMessage());
                                    }
                                    break;
                                case "/":
                                    try{
                                        System.out.println(getVariable(firstTerm).div(getVariable(secondTerm)));
                                    }
                                    catch (ArithmeticException e){
                                        System.out.println(e.getMessage());
                                    }
                                    break;
                                default:
                                    System.out.println("Некоректный ввод.");
                            }
                        }
                        else System.out.println("Некоректный ввод.");
                    }
                    else
                    {
                        String name = readNameVariable(string);
                        String variable = readSecondTerm(string);
                        if (name != null && variable != null)
                            getVariable(variable).save(name);
                        else
                            System.out.println("Некоректный ввод.");
                    }
                }
            }
            System.out.println("\nВведите выражение для рассчета или сохранения переменной.\n" + "Нажмите Enter для выхода.");
            string = readInput();
        }
        SaveReadVariables.saveBase();
    }
}
