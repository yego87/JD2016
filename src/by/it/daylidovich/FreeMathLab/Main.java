package by.it.daylidovich.FreeMathLab;

import by.it.daylidovich.FreeMathLab.Calculation.Parser;
import by.it.daylidovich.FreeMathLab.InputOutput.SaveReadVariables;
import by.it.daylidovich.FreeMathLab.Logger.Logger;
import by.it.daylidovich.FreeMathLab.variables.Variable;

import java.io.IOException;
import java.util.Date;

import static by.it.daylidovich.FreeMathLab.InputOutput.Reader.readInput;

public class Main {
    public static void main(String[] args)  {
        SaveReadVariables.readBase();
        Logger.getInstanse();
        System.out.println("Введите выражение для рассчета или сохранения переменной.\n" + "Нажмите Enter для выхода.");
        String stringInput = readInput();
        while (stringInput.length() != 0){
            switch (stringInput){
                case "printvar":{
                    Variable.printVariables();
                    break;
                }
                case "sortvar":{
                    Variable.sortVariable();
                    break;
                }
                case "clear base":{
                    //System.out.println(SaveReadVariables.clearBase());
                    System.out.println("База очищена.");
                    break;
                }
                default:{
                    try{
                        Parser.processExpression(stringInput);
                    }
                    catch (IOException e){
                        Logger.writeLog(e.getMessage(), new Date(System.currentTimeMillis()));
                        System.out.println(e.getMessage());
                    }
                }
            }
            System.out.println("\nВведите выражение для рассчета или сохранения переменной.\n" + "Нажмите Enter для выхода.");
            stringInput = readInput();
        }
        SaveReadVariables.saveBase();
    }
}
