package by.it.chetovich.JD02_01;

import by.it.Baranova.JD01_12_Collections.Iter;

import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
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


    }

    public static synchronized Buyer getBuyer (){

        return queueToPay.remove();
    }
}
