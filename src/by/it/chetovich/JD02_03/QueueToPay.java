package by.it.chetovich.JD02_03;

import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Queue in front of the cashiers
 */
public class QueueToPay {


    public static final Deque<Buyer> queueToPay = new ConcurrentLinkedDeque<>();


    public static synchronized void putBuyer (Buyer buyer){
        if (buyer.isRetired()) {
            queueToPay.offerFirst(buyer);
        }
        else{
            queueToPay.offer(buyer);
        }
        //queueToPay.notifyAll();
    }

    public static synchronized Buyer getBuyer () {
        
        if(queueToPay.isEmpty()) return null;
        else return queueToPay.remove();
    }
}
