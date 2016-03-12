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
                Thread.sleep(15000);
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
                this.buyer = QueueToPay.getBuyer();
                freeCashier--;
                System.out.println(buyer + " went to Cashier.");

                freeCashier++;
                //buyer.notifyAll();
            }
        }
    }


    public synchronized void accountCashier(){
        try {
            Thread.sleep(Rnd.fromTo(2000,5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (Cashier.class) {
            int bill = 0;
            StringBuilder sb = new StringBuilder();
            String s = this.buyer + " is buying: ";
            sb.append(s);
            Map <String, Integer> map = this.buyer.getBacket();
            System.out.println(map);
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                String good = entry.getKey();
                Integer price = entry.getValue();
                String item = good + " : " + price + ", ";
                sb.append(item);
                bill += price;
            }

            String billToPay = "Bill to pay: " + bill+". ";
            String paid = this.buyer + " paid.";
            sb.append(billToPay);
            sb.append(paid);
            System.out.println(sb);
            //buyer.notifyAll();
        }
    }


    public synchronized void feelFree(){
        this.buyer.clearBacket();
        synchronized (this.buyer) {
            this.buyer.notify();
        }
    }
}
