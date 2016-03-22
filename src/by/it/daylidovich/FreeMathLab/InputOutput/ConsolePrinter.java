package by.it.daylidovich.FreeMathLab.InputOutput;

import by.it.daylidovich.FreeMathLab.Report.Report;

public class ConsolePrinter {
    public static void printToConsole(String text){
        System.out.println(text);
        Report.recordReport(text);
    }
}
