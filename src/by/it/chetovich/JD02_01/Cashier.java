package by.it.chetovich.JD02_01;

import java.util.Map;

/**
 * Cashier
 */
public class Cashier implements Runnable {

    private   Buyer buyer;
    private int num;
    private int income;
    private static int totalIncome;

    public Cashier(int num){
        this.num = num;
    }

    @Override
    public void run() {

            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        while (!Buyer.getQueue().isEmpty()) {
            /*try {
                waitingForCostumers();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            takeBuyerFromQueue();
            //synchronized (this){
                accountCashier();
            //}
            clientMayExit();
            //System.out.println(buyer.getBacket());
        }


    }


    //@Override
    public synchronized void takeBuyerFromQueue() {
        synchronized (Cashier.class){
            if (!QueueToPay.queueToPay.isEmpty()) {
                this.buyer = QueueToPay.getBuyer();
                Buyer.getQueue().remove(this.buyer);
                System.out.println(buyer + " went to Cashier.");
            }
        }
    }


    public synchronized void accountCashier(){
        try {
            Thread.sleep(Rnd.fromTo(2000,5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //synchronized (Cashier.class) {
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
       // }
    }


    public synchronized void clientMayExit(){
        this.buyer.clearBacket();
        synchronized (this.buyer) {
            this.buyer.notify();
        }
    }

    public synchronized void waitingForCostumers() throws InterruptedException {

        while (QueueToPay.queueToPay.size()<5)
            this.wait();
    }
}
