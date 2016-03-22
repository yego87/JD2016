package by.it.chetovich.Matlab;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Queue of operations for adding to the report
 */
public class ListOperationsForReport {

    private static final ConcurrentLinkedQueue<String> listOperationsForReport = new ConcurrentLinkedQueue<>();

    public static ConcurrentLinkedQueue<String> getListOperationsForReport() {
        return listOperationsForReport;
    }

    public static synchronized void addOperation (String s){
        if (s!=null)
        listOperationsForReport.offer(s);
    }

    public static synchronized String getOperation (){
        if (!listOperationsForReport.isEmpty()) return listOperationsForReport.remove();
        else return null;
    }
}
