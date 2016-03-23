package by.it.Baranova.JD01_09_MathLab.Builder;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class Director {

    public ReportBuilder reportBuilder;

    public void setReportBuilder(ReportBuilder rp){reportBuilder=rp;}
    public Report getReport(){return reportBuilder.getReport();}
    public void constructReport(String s, Date dStart, Queue<String> operations, Date dEnd){
        reportBuilder.createNewReport();
        reportBuilder.buildName(s);
        reportBuilder.buildStartTime(dStart);
        reportBuilder.buildOperationsQueue(operations);
        reportBuilder.buildEndTime(dEnd);
    }
}
