package by.it.telushko.jd02_06;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;

////true в конструктор для НЕ перезаписи файла
public class Log {
    public static volatile Log instance;
    private PrintWriter printer;

    public Log() {
        String src = System.getProperty("user.dir")+"/src/by/it/telushko/";
        String filename = src+"jd02_06/log.txt";
        try{
             printer = new PrintWriter(new FileWriter(filename,true));
        }
        catch (IOException e){System.out.println("Ошибка файла");}
    }

    public static Log getInstance(){
        Log localInstance = instance;
        if(localInstance==null){
            synchronized (Log.class){
                localInstance=instance;
                if(localInstance==null){
                    instance=localInstance=new Log();
                }
                else System.out.println("Лог уже создан.");
            }
        }
        else System.out.println("Лог уже создан.");
        return localInstance;
    }
    public void entry(String error){                                 //печать в файл
        Date date = new Date(System.currentTimeMillis());
        this.printer.print(date);
        this.printer.println(" "+error);
    }
    public void close(){this.printer.close();System.out.println("Работа закончена.");}
}
