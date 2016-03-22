package by.it.daylidovich.FreeMathLab.Report;

import by.it.daylidovich.FreeMathLab.InputOutput.ConsolePrinter;

public abstract class ReportBuilder {

    public void createHeader(String header){
        ConsolePrinter.printToConsole("Создан отчет.");
    }

    public void createStartTime(){
        ConsolePrinter.printToConsole("Внесено в отчет время начала работы приложения.");
    }

    public void createStopTime(){
        ConsolePrinter.printToConsole("Внесено в отчет время окончания работы приложения.");
    }

    public void createAction(String action){
        ConsolePrinter.printToConsole("Действие записано в отчет.");
    }
}
