package by.it.Baranova.JD01_09_MathLab.Builder;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueForBuilder {

    public static Queue<String> operations=new ConcurrentLinkedQueue<>();

    public static void addOperation( String operation){
        QueueForBuilder.operations.add(operation);
    }

    public static Queue<String> getOperations() {
        return QueueForBuilder.operations;
    }

}
