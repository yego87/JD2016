package by.it.chetovich.Matlab;

import java.io.File;
import java.util.Date;

/**
 * Director
 */
public class ReportDirector {

    private ReportBuilder reportBuilder;

    public void setReportBuilder(ReportBuilder reportBuilder) {
        this.reportBuilder = reportBuilder;
    }

    public File getReport() {
        return reportBuilder.getFile();
    }

    public void createReport (){

        Thread thread = new Thread(reportBuilder);
        thread.start();

    }


}
