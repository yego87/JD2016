package by.it.chetovich.JD02_03.JD02_01;

import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Cashier
 */
public class Cashier implements Runnable, ICashier {

    private  Buyer buyer;
    private int num;
    private int bill = 0;
    private final Lock countLock = new ReentrantLock();


    public Cashier(int num){
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public int getBill() {
        return bill;
    }

    @Override
    public void run() {

        while (ShopDispatcher.countBuyersIn==0||ShopDispatcher.countBuyersIn>ShopDispatcher.countBuyersOut) {

            if (QueueToPay.queueToPay.size()>=ShopDispatcher.countCashier*5) {
                takeBuyerFromQueue();
                accountCashier();
                clientMayExit();
                calculateProfit();
            }
            Utils.sleep(1000);
        }
    }


    @Override
    public  void takeBuyerFromQueue() {


        this.buyer = QueueToPay.getBuyer();
        if (this.buyer!=null) {
            ShopDispatcher.addCountCashier();
            ShopDispatcher.addCountBuyersOut();
            System.out.println(buyer.getNum()+", total out "+ShopDispatcher.countBuyersOut);


            /*try {
                countLock.lock();
                ShopDispatcher.countBuyersOut++;
            } finally {
                countLock.unlock();
            }*/
            System.out.println(buyer + " went to Cashier.");
        }
        else{
            Utils.sleep(1000);
            takeBuyerFromQueue();
        }
    }


    @Override
    public synchronized void accountCashier(){
        Utils.sleep(Rnd.fromTo(2000, 5000));
        String s = this.buyer + " is buying: ";
        StringBuilder buyerBill = new StringBuilder(s);

        for (Map.Entry<String, Integer> entry : this.buyer.getBacket().entrySet()) {
            String good = entry.getKey();
            Integer price = entry.getValue();
            String item = good + " : " + price + "; ";
            buyerBill.append(item);
            this.bill += price;
        }

        String billToPay = "Bill to pay: " + this.bill+". ";
        buyerBill.append(billToPay);
        System.out.println(buyerBill);
    }

    @Override
    public  void clientMayExit(){
        //this.buyer.clearBacket();
        synchronized (this.buyer) {
            this.buyer.setWaitInTheQueue(false);
            this.buyer.notify();
        }
    }


    @Override
    public  void calculateProfit (){

        Profit.addCashierProfit(this.num, this.bill);
        Profit.addTotalProfit(this.bill);
        Utils.printCashierTable(this);
        ShopDispatcher.reduceCountCashier();

        this.bill=0;

    }
}
