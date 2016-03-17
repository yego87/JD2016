package by.it.daylidovich.JD02_03;

import by.it.daylidovich.JD02_03.Buyer.Buyer;
import by.it.daylidovich.JD02_03.Cashier.Manager;
import by.it.daylidovich.JD02_03.Goods.Goods;
import by.it.daylidovich.JD02_03.Buyer.CountBuyersInMoment;

public class Main {
    static int countBuyers = 0;
    public static void main(String[] args) throws InterruptedException {
        int counterSeconds = 1;
        int planBuyers = 100;
        Goods.readGoods();
        System.out.printf("%-30s%-30s%-30s%-30s%-30s%-15s%-15s\n","Касса №1", "Касса №2", "Касса №3", "Касса №4", "Касса №5", "Длинна очереди", "Выручка магазина");
        Manager manager = new Manager();
        manager.start();
        while (planBuyers > countBuyers){
            Thread.sleep(1000);
            int countBuyersInOneMoment = CountBuyersInMoment.countBuyersInOneMoment(counterSeconds);
            for (int i = 0; i < countBuyersInOneMoment; i++) {
                countBuyers++;
                new Buyer(countBuyers);
            }
            counterSeconds++;
        }
        while (0 != Buyer.getCountBuyers()){
            Thread.yield();
        }
        manager.isManagerWork = false;
    }
}