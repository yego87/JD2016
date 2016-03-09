package by.it.daylidovich.JD02_01;

import by.it.daylidovich.JD02_01.Buyer.Buyer;
import by.it.daylidovich.JD02_01.Goods.Goods;

import java.util.ArrayDeque;
import java.util.Queue;

import static by.it.daylidovich.JD02_01.Utils.RandomFromInterval.*;

public class Main {
    static int countBuyers = 0;
    public static void main(String[] args) throws InterruptedException {
        Queue<Buyer> queue = new ArrayDeque<>();
        Goods.readGoods();
        while (10 > countBuyers){
            Thread.sleep(1000);
            int countBuyersInOneMoment = randomInterval(0, 2);
            for (int i = 0; i < countBuyersInOneMoment; i++) {
                countBuyers++;
                if (10 >= countBuyers){
                    queue.add(new Buyer(countBuyers));
                }
            }
        }

    }
}
