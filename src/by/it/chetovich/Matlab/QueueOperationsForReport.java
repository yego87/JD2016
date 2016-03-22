package by.it.chetovich.Matlab;


import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Queue of operations for adding to the report
 */
public class QueueOperationsForReport {

    private static final ConcurrentLinkedQueue<String> QueueOperationsForReport = new ConcurrentLinkedQueue<>();

    public static ConcurrentLinkedQueue<String> getQueueOperationsForReport() {
        return QueueOperationsForReport;
    }

    public static synchronized void addOperation (String s){
        if (s!=null)
            QueueOperationsForReport.offer(s);
    }

    public static synchronized String getOperation (){
        if (!QueueOperationsForReport.isEmpty()) return QueueOperationsForReport.remove();
        else return null;
    }
}
