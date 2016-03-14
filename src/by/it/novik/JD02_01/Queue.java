package by.it.novik.JD02_01;


import java.util.concurrent.ConcurrentLinkedQueue;

public class Queue {

    private final static ConcurrentLinkedQueue customersQueue = new ConcurrentLinkedQueue();

    public static boolean add(Customer customer) {
        return customersQueue.add(customer);
    }

    public static Customer poll() {
        if (customersQueue.isEmpty()) {
            return null;
        }
        else {
            return (Customer) customersQueue.poll();
        }
    }

}
