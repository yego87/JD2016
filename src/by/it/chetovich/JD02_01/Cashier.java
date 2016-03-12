package by.it.chetovich.JD02_01;

import java.util.Map;

/**
 * Cashier
 */
public class Cashier implements Runnable {

    private   Buyer buyer;
    static int freeCashier = 5;

    @Override
    public void run() {

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //buyer.notify();

        while (!QueueToPay.queueToPay.isEmpty()) {
            takeBuyerFromQueue();
            synchronized (this){
                accountCashier();
            }
            feelFree();
            //System.out.println(buyer.getBacket());
        }


    }


    //@Override
    public synchronized void takeBuyerFromQueue() {
        synchronized (Cashier.class){
            if (!QueueToPay.queueToPay.isEmpty()) {
                buyer = QueueToPay.getBuyer();
                freeCashier--;
                System.out.println(buyer + " went to Cashier.");

                freeCashier++;
                //buyer.notifyAll();
            }
        }
    }


    public synchronized void accountCashier(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (Cashier.class) {
            int bill = 0;
            StringBuilder sb = new StringBuilder();
            String s = buyer + " is buying: ";
            sb.append(s);
            for (Map.Entry<String, Integer> entry : buyer.getBacket().entrySet()) {
                String good = entry.getKey();
                Integer price = entry.getValue();
                String item = good + " : " + price + ", ";
                sb.append(item);
                bill += price;
            }

            String billToPay = "Bill to pay: " + bill+". ";
            String paid = buyer + " paid.";
            sb.append(billToPay);
            sb.append(paid);
            System.out.println(sb);
            //buyer.notifyAll();
        }
    }


    public synchronized void feelFree(){
        buyer.clearBacket();
        synchronized (buyer) {
            buyer.notify();
        }
    }
}
