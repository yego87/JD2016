package by.it.Baranova.JD01_09_MathLab.Builder;

import by.it.Baranova.JD01_09_MathLab.Builder.ReportBuilder;

import java.util.Date;
import java.util.Map;
import java.util.Queue;

public class ActionsReportBuilder extends ReportBuilder {

    @Override
    public Report getReport() {
        return report;
    }

    protected Report report=new Report();

    public ActionsReportBuilder() {
        this.report=new Report();
    }


    public void buildName(String s){this.report.setName(s);}
    public void buildStartTime(Date date){report.setStartime(date);}
    public void buildEndTime(Date date){report.setEndtime(date);}
    public void buildOperationsQueue(Queue<String> operations){report.setOperations(operations);}

}
