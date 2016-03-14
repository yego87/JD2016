package by.it.daylidovich.JD02_03.Queue;

import by.it.daylidovich.JD02_03.Buyer.Buyer;

import java.util.ArrayDeque;

public class QueueBuyer {
    private final static ArrayDeque<Buyer> queueBuyers = new ArrayDeque<>();

    public static void addBuyer(Buyer buyer){
        queueBuyers.addLast(buyer);
    }

    public static Buyer exitQueue(){
        synchronized (queueBuyers){
            return queueBuyers.pollFirst();
        }
    }

    public static boolean isEmptyQueue(){
        return !queueBuyers.isEmpty();
    }

    public static int lengthQueue(){
        return queueBuyers.size();
    }

    /*public static void PrintQueue(){
        Iterator<Buyer> iterator = queueBuyers.iterator();
        System.out.println("Список стоящих в очереди");
        while (iterator.hasNext())
            System.out.println(iterator.next().getName());
    }*/
}

