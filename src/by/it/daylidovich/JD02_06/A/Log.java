package by.it.daylidovich.JD02_06.A;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Log {
    private static Log instanse;

    private Log(){
        new File("src\\by\\it\\daylidovich\\JD02_06\\A\\Log.txt");
    }

    public static Log getInstanse(){
        Log localInstance = instanse;
        if (null == localInstance){
            synchronized (Log.class){
                localInstance = instanse;
                if (null == localInstance)
                    instanse = localInstance = new Log();
            }
        }
        return localInstance;
    }

    public static void writeLog(String logText){
        try {
            PrintWriter printer = new PrintWriter(new FileWriter("src\\by\\it\\daylidovich\\JD02_06\\A\\Log.txt", true));
            printer.println(logText);
            printer.close();
        } catch (IOException e) {
            System.out.println("Ошибка записи.");
        }
    }
}
