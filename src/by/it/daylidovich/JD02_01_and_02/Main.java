package by.it.daylidovich.JD02_01_and_02;

import by.it.daylidovich.JD02_01_and_02.Buyer.Buyer;
import by.it.daylidovich.JD02_01_and_02.Cashier.Cashier;
import by.it.daylidovich.JD02_01_and_02.Goods.Goods;

import static by.it.daylidovich.JD02_01_and_02.Utils.RandomFromInterval.randomInterval;

public class Main {
    static int countBuyers = 0;
    public static void main(String[] args) throws InterruptedException {

        Goods.readGoods();
        for (int i = 0; i < 5; i++) {
            new Cashier();
        }
        while (15 > countBuyers){
            Thread.sleep(1000);
            int countBuyersInOneMoment = randomInterval(0, 2);
            for (int i = 0; i < countBuyersInOneMoment; i++) {
                countBuyers++;
                new Buyer(countBuyers);
            }
        }
    }
}
