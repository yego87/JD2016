package by.it.daylidovich.FreeMathLab.Logger;


import by.it.daylidovich.FreeMathLab.InputOutput.ConsolePrinter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class Logger {
    private static Logger instanse;

    private Logger(){
        new File("src\\by\\it\\daylidovich\\JD02_06\\A\\Log.txt");
    }

    public static Logger getInstanse(){
        Logger localInstance = instanse;
        if (null == localInstance){
            synchronized (Logger.class){
                localInstance = instanse;
                if (null == localInstance)
                    instanse = localInstance = new Logger();
            }
        }
        return localInstance;
    }

    public static void writeLog(String logText, Date date){
        try {
            PrintWriter printer = new PrintWriter(new FileWriter("src\\by\\it\\daylidovich\\FreeMathLab\\Logger\\Log.txt", true));
            printer.println(date);
            printer.println(logText);
            printer.close();
        } catch (IOException e) {
            ConsolePrinter.printToConsole("Ошибка записи LogFile.");
        }
    }
}