package by.it.daylidovich.FreeMathLab.Report;

import by.it.daylidovich.FreeMathLab.Logger.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class Report {
    private static File report;

    public Report(String name){
        String nameOld = name;
        name = "src\\by\\it\\daylidovich\\FreeMathLab\\Report\\Reports\\" + name + ".txt";
        report = new File(name);
        recordReport(nameOld);
    }
//метод делает запись в отчет
    public static void recordReport(String text){
        try {
            PrintWriter printer = new PrintWriter(new FileWriter(report, true));
            printer.println(text);
            printer.println();
            printer.close();
        } catch (IOException e) {
            Logger.writeLog(e.toString(), new Date(System.currentTimeMillis()));
        }
    }
}
