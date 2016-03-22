package by.it.daylidovich.FreeMathLab;

import by.it.daylidovich.FreeMathLab.InputOutput.ConsolePrinter;
import by.it.daylidovich.FreeMathLab.InputOutput.SaveReadVariables;
import by.it.daylidovich.FreeMathLab.Logger.Logger;
import by.it.daylidovich.FreeMathLab.Parser.Parser;
import by.it.daylidovich.FreeMathLab.Report.ReportBuilder;
import by.it.daylidovich.FreeMathLab.Report.StandartReport;
import by.it.daylidovich.FreeMathLab.variables.Variable;

import java.io.IOException;
import java.util.Date;

import static by.it.daylidovich.FreeMathLab.InputOutput.Reader.readInput;

public class Main {
    public static void main(String[] args)  {
        SaveReadVariables.readBase();

        System.out.println("Введите название отчета.");
        String name ="report"; //readInput();
        ReportBuilder report = new StandartReport();
        report.createHeader(name);
        report.createStartTime();

        Logger.getInstanse();

        System.out.println("Введите выражение для рассчета или сохранения переменной.\n" + "Нажмите Enter для выхода.");
        String stringInput = readInput();
        while (stringInput.length() != 0){
            report.createAction(stringInput);
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
                    ConsolePrinter.printToConsole(SaveReadVariables.clearBase());
                    break;
                }
                default:{
                    try{
                        Parser.processExpression(stringInput);
                    }
                    catch (IOException e){
                        Logger.writeLog(e.toString(), new Date(System.currentTimeMillis()));
                    }
                }
            }
            System.out.println("\nВведите выражение для рассчета или сохранения переменной.\n" + "Нажмите Enter для выхода.");
            stringInput = readInput();
        }
        report.createStopTime();
        SaveReadVariables.saveBase();
    }
}
