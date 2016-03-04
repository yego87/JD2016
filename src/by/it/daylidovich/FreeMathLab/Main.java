package by.it.daylidovich.FreeMathLab;

import by.it.daylidovich.FreeMathLab.variables.Variable;

import java.io.IOException;

import static by.it.daylidovich.FreeMathLab.Reader.*;

public class Main {
    public static void main(String[] args) throws IOException {

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
                        if (operation != null && firstTerm != null && secondTerm != null){
                            switch (operation){
                                case "+":
                                    System.out.println(getVarable(firstTerm).add(getVarable(secondTerm)));
                                    break;
                                case "-":
                                    System.out.println(getVarable(firstTerm).sub(getVarable(secondTerm)));
                                    break;
                                case "*":
                                    System.out.println(getVarable(firstTerm).mult(getVarable(secondTerm)));
                                    break;
                                case "/":
                                    System.out.println(getVarable(firstTerm).div(getVarable(secondTerm)));
                                    break;
                                default:
                                    System.out.println("Некоректный ввод.");
                            }
                        }
                        else System.out.println("Некоректный ввод.");
                    }
                    else
                    {
                        String name = readNameVarable(string);
                        String variable = readSecondTerm(string);
                        if (name != null && variable != null)
                            getVarable(variable).save(name);
                        else
                            System.out.println("Некоректный ввод.");
                    }
                }
            }
            System.out.println("Введите выражение для рассчета или сохранения переменной.\n" + "Нажмите Enter для выхода.");
            string = readInput();
        }
    }
}
