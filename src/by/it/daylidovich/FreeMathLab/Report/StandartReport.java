package by.it.daylidovich.FreeMathLab.Report;

import java.util.Date;

import static by.it.daylidovich.FreeMathLab.Report.Report.*;

public class StandartReport extends ReportBuilder {

    @Override
    public void createHeader(String header) {
        new Report(header);
    }

    @Override
    public void createStartTime() {
        recordReport("Время начала работы приложения: " + new Date(System.currentTimeMillis()).toString());
    }

    @Override
    public void createStopTime() {
        recordReport("Время окончания работы приложения: " + new Date(System.currentTimeMillis()).toString());
    }

    @Override
    public void createAction(String action) {
        recordReport(action);
    }
}
