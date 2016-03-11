package by.it.daylidovich.JD02_01.Queue;

import by.it.daylidovich.JD02_01.Buyer.Buyer;

import java.util.ArrayDeque;

public class QueueBuyer {
    private static ArrayDeque<Buyer> queueBuyers;

    public static void goToQueue(Buyer buyer){
        queueBuyers.addLast(buyer);
    }

    public static Buyer exitQueue(){
        return queueBuyers.pollFirst();
    }

    public static boolean isEmptyQueue(){
        return queueBuyers.isEmpty();
    }
}

