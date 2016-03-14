package by.it.daylidovich.JD02_01_and_02.Cashier;

import by.it.daylidovich.JD02_01_and_02.Buyer.Buyer;
import by.it.daylidovich.JD02_01_and_02.Goods.Goods;
import by.it.daylidovich.JD02_01_and_02.Queue.QueueBuyer;
import by.it.daylidovich.JD02_01_and_02.Utils.RandomFromInterval;

import java.util.ArrayList;
import java.util.Formatter;

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
        try {
            Thread.sleep(timing);
        } catch (InterruptedException e) {
            System.out.println("Ошибка ожидания.");
        }
        int sum = 0;
        ArrayList<String> backet = buyer.getBacket();
        StringBuilder invoice = new StringBuilder("\nЧек " + buyer.getName() + "\n");
        for (String goods: backet){
            Formatter f = new Formatter();
            invoice.append(f.format("%-20s %7d\n", goods, Goods.getGoods().get(goods)));
            sum += Goods.getGoods().get(goods);
        }
        Formatter f = new Formatter();
        invoice.append(f.format("Сумма к оплате:      %7d\n", sum));
        System.out.println(invoice);
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
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Ошибка ожидания кассы.");
            }
        run();
    }
}
