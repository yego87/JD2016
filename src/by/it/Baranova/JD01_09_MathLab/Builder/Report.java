package by.it.Baranova.JD01_09_MathLab.Builder;

import java.io.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Report {

    public String name=null;
    public Date endtime=null;
    public Date startime=null;
    public Queue<String> operations=new ConcurrentLinkedQueue<>();

    public void setName(String name) {
        this.name = name;
    }
    public void setOperations(Queue<String> operations) {
        this.operations = operations;
    }
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }
    public void setStartime(Date startime) {
        this.startime = startime;
    }

    public void writeReportToFile(){
        String src=System.getProperty("user.dir")+"/src/by/it/Baranova/";
        String filename=src+"JD01_09_MathLab/Builder/Report.txt";
        File f=new File(filename);
        PrintWriter printWriter=null;
        try {
            printWriter = new PrintWriter(new FileWriter(f));
            printWriter.println(this.name);
            printWriter.println("Время запуска пакета "+this.startime);
            while (!this.operations.isEmpty()){
                String operation=operations.remove();
                printWriter.println(operation);
            }
            printWriter.println("Время окончания работы пакета "+this.endtime);
        } catch (IOException e){
            System.out.println("Файл не найден");
        }finally {
            if (printWriter != null) {
                printWriter.close();
            }

        }
    }
}
