package by.it.daylidovich.JD02_01_and_02.Cashier;

import by.it.daylidovich.JD02_01_and_02.Buyer.Buyer;
import by.it.daylidovich.JD02_01_and_02.Queue.QueueBuyer;
import by.it.daylidovich.JD02_01_and_02.Utils.RandomFromInterval;
import by.it.daylidovich.JD02_01_and_02.Utils.SleepTime;

public class Cashier extends Thread{
    private static int numberCashier = 1;

    public Cashier(){
        this.setName("касса №" + numberCashier);
        numberCashier++;
        setDaemon(true);
        start();
    }

    public void serveBuyer(Buyer buyer){
        System.out.println(buyer.getName() + " обслуживается на " + this.getName());
        int timing = RandomFromInterval.randomInterval(2000, 5000);
        SleepTime.sleepTime(timing);
        System.out.println(Invoice.createInvoice(buyer));
    }

    //метод забирает покупателя из очереди
    public Buyer freeCashier(){
            Buyer buyer = QueueBuyer.exitQueue();
            while (null == buyer)
                buyer = QueueBuyer.exitQueue();
            return buyer;
    }

    public void releaseBuyer(Buyer buyer){
        System.out.println(buyer.getName() + " обслужен на " + this.getName());
        Buyer.iWait = false;
        buyer.notify();
    }


    @Override
    public void run() {
        if (QueueBuyer.isEmptyQueue()){
            Buyer buyer = freeCashier();
            synchronized (buyer){
                serveBuyer(buyer);
                releaseBuyer(buyer);
            }
        }
        else
            SleepTime.sleepTime(100);
        run();
    }
}
