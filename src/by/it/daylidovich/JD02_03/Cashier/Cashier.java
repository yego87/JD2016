package by.it.daylidovich.JD02_03.Cashier;

import by.it.daylidovich.JD02_03.Buyer.Buyer;
import by.it.daylidovich.JD02_03.Queue.QueueBuyer;
import by.it.daylidovich.JD02_03.Utils.RandomFromInterval;
import by.it.daylidovich.JD02_03.Utils.SleepTime;

public class Cashier extends Thread{

    public boolean iWork = true;

    private int idCashier;

    public Cashier(int numberCashier){
        this.setName("касса №" + numberCashier);
        idCashier = numberCashier;
    }

    public void serveBuyer(Buyer buyer){
        //System.out.println(buyer.getName() + " обслуживается на " + this.getName());
        int timing = RandomFromInterval.randomInterval(2000, 5000);
        SleepTime.sleepTime(timing);
        System.out.println(Invoice.createInvoice(buyer, idCashier));
    }

    //метод забирает покупателя из очереди
    public Buyer freeCashier(){
            Buyer buyer = QueueBuyer.exitQueue();
            while (null == buyer)
                buyer = QueueBuyer.exitQueue();
            return buyer;
    }

    public void releaseBuyer(Buyer buyer){
        //System.out.println(buyer.getName() + " обслужен на " + this.getName());
        Buyer.iWait = false;
        buyer.notify();
    }


    @Override
    public synchronized void run() {
        while (iWork){
            if (QueueBuyer.isEmptyQueue()){
                Buyer buyer = freeCashier();
                synchronized (buyer){
                    serveBuyer(buyer);
                    releaseBuyer(buyer);
                }
            }
            else
                SleepTime.sleepTime(100);
        }
    }
}
