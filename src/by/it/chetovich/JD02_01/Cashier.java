package by.it.chetovich.JD02_01;

/**
 * Created by Yultos_ on 11.03.2016.
 */
public class Cashier implements Runnable, ICashier {

    Buyer buyer;

    @Override
    public void run() {
        while (!QueueToPay.queueToPay.isEmpty())
            takeBuyerFromQueue();

    }


    @Override
    public void takeBuyerFromQueue() {
        synchronized (QueueToPay.queueToPay){
            if (!QueueToPay.queueToPay.isEmpty()) {
                buyer = QueueToPay.queueToPay.remove();
                System.out.println(buyer + " went to Cashier.");
               //buyer.notify();
            }
        }



    }
}
