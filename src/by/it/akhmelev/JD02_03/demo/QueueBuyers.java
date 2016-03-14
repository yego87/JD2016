package by.it.akhmelev.JD02_03.demo;

import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueBuyers {
    //этот класс нужен, чтобы очередь была
    // а) отдельной сущностью в программе
    // б) была видна из прочих классов

    //экземпляр очереди. Приватный т.к. очередь одна-единственная
    private final static ConcurrentLinkedQueue queueBuyers=new ConcurrentLinkedQueue();

    //замена статического метода на экземплярный из ConcurrentLinkedQueue;
    public static boolean add(Buyer buyer) {
        return queueBuyers.add(buyer);
    }

    //замена статического метода на экземплярный из ConcurrentLinkedQueue;
    public static Buyer poll() {
        if (queueBuyers.isEmpty()) {
            return null;
        } else {
            return (Buyer) queueBuyers.poll();
        }
    }
}


