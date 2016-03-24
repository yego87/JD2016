package by.it.novik.JD02_06;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LoggerA {

    private static volatile LoggerA instance;

    private LoggerA() {
    }

    public static LoggerA getInst() {

        LoggerA lInst = instance;
        if (lInst == null) {
            synchronized (LoggerA.class) {
                lInst = instance;
                if (lInst == null) {
                    instance = lInst = new LoggerA();
                }
            }
        }
         return lInst;
    }



    public static void writeFile(String errorMessage) {

        String way = System.getProperty("user.dir") + "/src/by/it/novik/";
        String filename = way + "/JD02_06/log.txt/";

        try (BufferedWriter bf = new BufferedWriter(new FileWriter(filename)))
        {

            Locale lCur = new Locale("ru", "RU");

            Date today = new Date();

            DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.FULL, lCur);

            String dayAndTime = dateFormat.format(today);

            bf.write(errorMessage);
            bf.newLine();
            bf.write(dayAndTime);

        }
        catch (IOException e) {
            System.out.println("Not found" + filename.toString());
        }
    }
}
