package by.it.daylidovich.JD02_03;

import by.it.daylidovich.JD02_03.Buyer.Buyer;
import by.it.daylidovich.JD02_03.Cashier.Manager;
import by.it.daylidovich.JD02_03.Goods.Goods;
import by.it.daylidovich.JD02_03.Queue.QueueBuyer;

import static by.it.daylidovich.JD02_03.Utils.RandomFromInterval.randomInterval;

public class Main {
    static int countBuyers = 0;
    private static int planBuyers = 100;
    public static void main(String[] args) throws InterruptedException {

        Goods.readGoods();
        Manager manager = new Manager();
        manager.start();
        while (15 > countBuyers){
            Thread.sleep(1000);
            int countBuyersInOneMoment = randomInterval(0, 2);
            for (int i = 0; i < countBuyersInOneMoment; i++) {
                countBuyers++;
                new Buyer(countBuyers);
            }
        }
        while (0 < QueueBuyer.lengthQueue() && planBuyers > countBuyers){
            Thread.yield();
        }
        manager.isManagerWork = false;
    }
}