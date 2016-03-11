package by.it.daylidovich.JD02_01.Cashier;

import by.it.daylidovich.JD02_01.Buyer.Buyer;
import by.it.daylidovich.JD02_01.Queue.QueueBuyer;
import by.it.daylidovich.JD02_01.Utils.RandomFromInterval;

public class Cashier extends Thread implements Runnable{
    int numberCashier;

    public Cashier(int numberCashier){
        this.numberCashier = numberCashier;
        start();
    }

    public static void serveBuyer(){
        int timing = RandomFromInterval.randomInterval(2000, 5000);
        try {
            Thread.sleep(timing);
        } catch (InterruptedException e) {
            System.out.println("Ошибка ожидания.");
        }
    }

    //метод забирает покупателя из очереди
    public static Buyer freeCashier(){
        Buyer buyer;
        if (null != (buyer = QueueBuyer.exitQueue()))
            return buyer;
        else return null;
    }

    public static void releaseBuyer(Buyer buyer){
        buyer.setBacket(null);
        buyer.notify();
    }

    //дописать идентификатор для завершения потока вместе с мейном
    @Override
    public void run() {
        if (QueueBuyer.isEmptyQueue()){
            Buyer buyer = freeCashier();
            serveBuyer();
            releaseBuyer(buyer);
        }
        else
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Ошибка ожидания кассы.");
            }
        run();
    }
}
