package by.it.chetovich.Matlab;

import java.io.File;

/**
 * Abstract Builder
 */
public abstract class ReportBuilder implements Runnable {

    File file;

     public File getFile() {
        return file;
    }

    public abstract void startReport();
    public abstract void setStartTime();
    public abstract void addOperation();
    public abstract void setEndTime();


}
