package by.it.Baranova.JD01_09_MathLab.Builder;

import by.it.Baranova.JD01_09_MathLab.Builder.Report;

import java.util.Date;
import java.util.Map;
import java.util.Queue;

public abstract class ReportBuilder {

    protected Report report=new Report();

    public Report getReport(){return report;}
    public void createNewReport(){report=new Report();}

    public abstract void buildName(String s);
    public abstract void buildStartTime(Date date);
    public abstract void buildEndTime(Date date);
    public abstract void buildOperationsQueue(Queue<String> operations);
}
