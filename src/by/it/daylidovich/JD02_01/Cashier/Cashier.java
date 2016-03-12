package by.it.daylidovich.JD02_01.Cashier;

import by.it.daylidovich.JD02_01.Buyer.Buyer;
import by.it.daylidovich.JD02_01.Queue.QueueBuyer;
import by.it.daylidovich.JD02_01.Utils.RandomFromInterval;

public class Cashier extends Thread{
    int numberCashier;
    private static final Integer face = 0;

    public Cashier(int numberCashier){
        this.numberCashier = numberCashier;
        this.setName("касса №" + numberCashier);
        setDaemon(true);
        start();
    }

    public void serveBuyer(){
        int timing = RandomFromInterval.randomInterval(2000, 5000);
        try {
            Thread.sleep(timing);
        } catch (InterruptedException e) {
            System.out.println("Ошибка ожидания.");
        }
    }

    //метод забирает покупателя из очереди
    public Buyer freeCashier(){
        synchronized (face){
            Buyer buyer = QueueBuyer.exitQueue();
            while (null == buyer)
                buyer = QueueBuyer.exitQueue();
            return buyer;
        }
    }

    public void releaseBuyer(Buyer buyer){
        System.out.println(buyer.getName() + " обслужен на " + this.getName());
        buyer.setBacket(null);
    }


    @Override
    public void run() {
        if (QueueBuyer.isEmptyQueue()){
            Buyer buyer = freeCashier();
            serveBuyer();
            releaseBuyer(buyer);
        }
        else
            try {
                sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Ошибка ожидания кассы.");
            }
        run();
    }
}
