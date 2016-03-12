package by.it.daylidovich.JD02_01;

import by.it.daylidovich.JD02_01.Buyer.Buyer;
import by.it.daylidovich.JD02_01.Cashier.Cashier;
import by.it.daylidovich.JD02_01.Goods.Goods;

import static by.it.daylidovich.JD02_01.Utils.RandomFromInterval.randomInterval;

public class Main {
    static int countBuyers = 0;
    public static void main(String[] args) throws InterruptedException {

        Goods.readGoods();
        for (int i = 0; i < 5; i++) {
            new Cashier(i+1);
        }
        while (30 > countBuyers){
            Thread.sleep(1000);
            int countBuyersInOneMoment = randomInterval(0, 2);
            for (int i = 0; i < countBuyersInOneMoment; i++) {
                countBuyers++;
                new Buyer(countBuyers);
            }
        }
    }
}
