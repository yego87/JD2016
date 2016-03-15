package by.it.daylidovich.JD02_03;

import by.it.daylidovich.JD02_03.Buyer.Buyer;
import by.it.daylidovich.JD02_03.Cashier.Manager;
import by.it.daylidovich.JD02_03.Goods.Goods;

import static by.it.daylidovich.JD02_03.Utils.RandomFromInterval.randomInterval;

public class Main {
    static int countBuyers = 0;
    public static void main(String[] args) throws InterruptedException {

        int planBuyers = 15;
        Goods.readGoods();
        Manager manager = new Manager();
        manager.start();
        while (planBuyers > countBuyers){
            Thread.sleep(1000);
            int countBuyersInOneMoment = randomInterval(0, 2);
            for (int i = 0; i < countBuyersInOneMoment; i++) {
                countBuyers++;
                new Buyer(countBuyers);
            }
        }
        while (0 != Buyer.getCountBuyers()){
            Thread.yield();
        }
        manager.isManagerWork = false;
    }
}