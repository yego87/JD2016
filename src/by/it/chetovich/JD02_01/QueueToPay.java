package by.it.chetovich.JD02_01;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Created by Yultos_ on 11.03.2016.
 */
public class QueueToPay {


    public static final Queue<Buyer> queueToPay = new ConcurrentLinkedDeque<>();


    public static void putBuyer (Buyer buyer){
        queueToPay.offer(buyer);
    }

    public static Buyer getBuyer (){
        return queueToPay.remove();
    }
}
