package by.it.Baranova.JD02.JD02_03;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;


public class QueueToCashier {
    public final static Deque<Buyer> queueToCashier=new ArrayDeque<>();

    public static void add(Buyer buyer) {
        if (buyer.isPensioner()) {
            queueToCashier.addFirst(buyer);
        } else {
            queueToCashier.addLast(buyer);
        }
    }

    public static Buyer pool (){
        if (queueToCashier.isEmpty()){
            return null;
        }
        else {
            return queueToCashier.removeFirst();
        }
    }
}
