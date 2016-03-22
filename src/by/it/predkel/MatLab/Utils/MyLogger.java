package by.it.predkel.MatLab.Utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.GregorianCalendar;


public class MyLogger {
    private BufferedWriter f;
    private GregorianCalendar time = new GregorianCalendar();
    private MyLogger() {
        try {
            f = new BufferedWriter(new FileWriter("../JD2016/src/by/it/predkel/MatLab/log.txt",true));
        } catch (IOException e) {
            System.out.println("Error of log file");
            return;
        }
    }
    private static MyLogger log;
    public static MyLogger GetLogger() {
        if (log==null)
            log = new MyLogger();
        return log;
    }
    public void write(Exception str) throws IOException {
        time.setTimeInMillis(System.currentTimeMillis());
        f.write(time.get(time.HOUR_OF_DAY)+":"+time.get(time.MINUTE)+" "+time.get(time.DATE)+"-"+(time.get(time.MONTH)+1)+"-"+time.get(time.YEAR)+"   "+str+"\n");
        f.flush();
    }
}
