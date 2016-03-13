package by.it.daylidovich.JD02_01_and_02.Cashier;

import by.it.daylidovich.JD02_01_and_02.Buyer.Buyer;
import by.it.daylidovich.JD02_01_and_02.Goods.Goods;
import by.it.daylidovich.JD02_01_and_02.Queue.QueueBuyer;
import by.it.daylidovich.JD02_01_and_02.Utils.RandomFromInterval;

import java.util.ArrayList;

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
            Buyer buyer = QueueBuyer.exitQueue();
            while (null == buyer)
                buyer = QueueBuyer.exitQueue();
            return buyer;
    }

    public void releaseBuyer(Buyer buyer){
        System.out.println(buyer.getName() + " обслужен на " + this.getName());
        int sum = 0;
        ArrayList<String> backet = buyer.getBacket();
        for (String goods: backet){
            System.out.printf("%-20s %7d\n", goods, Goods.getGoods().get(goods));
            sum += Goods.getGoods().get(goods);
        }
        System.out.printf("Сумма к оплате:      %7d\n", sum);
        buyer.setBacket(null);
    }


    @Override
    public void run() {
        if (QueueBuyer.isEmptyQueue()){
            Buyer buyer;
            synchronized (face){
                buyer = freeCashier();
            }
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
