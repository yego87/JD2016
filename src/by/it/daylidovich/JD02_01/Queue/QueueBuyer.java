package by.it.daylidovich.JD02_01.Queue;

import by.it.daylidovich.JD02_01.Buyer.Buyer;

import java.util.ArrayDeque;

public class QueueBuyer {
    private static volatile ArrayDeque<Buyer> queueBuyers = new ArrayDeque<>();

    public static void goToQueue(Buyer buyer){
        queueBuyers.addLast(buyer);
    }

    public static Buyer exitQueue(){
        return queueBuyers.pollFirst();
    }

    public static boolean isEmptyQueue(){
        return !queueBuyers.isEmpty();
    }

    /*public static void PrintQueue(){
        Iterator<Buyer> iterator = queueBuyers.iterator();
        System.out.println("Список стоящих в очереди");
        while (iterator.hasNext())
            System.out.println(iterator.next().getName());
    }*/
}

