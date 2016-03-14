package by.it.predkel.JD0201Thread;

import java.util.*;

/**
 * Created by user_2 on 11.03.2016.
 */
public class Cashier extends Thread implements Runnable {
    int num; //номер кассира
    boolean haveTheBuyer=false;
    Buyer buy;
    private final static Integer fakeBalance=0;
    public static Double fullSum;
    MyQueue myq;

    public Cashier(int num,MyQueue cl) {
        this.num = num;
        myq=cl;
        this.setName("Кассир № "+ num+" ");
        start();
    }

    @Override
    public void run() {
        while (true) {
            while (!myq.checkQueue()) {
                try {
                    sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            getBuyerFromQueue();
            printCheck();
        }
    }

    public void getBuyerFromQueue() {

        if (!haveTheBuyer) {
            try {
                while (myq.checkQueue()) {
                    wait(50);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (fakeBalance) {
                buy = (Buyer) myq.pollFirst();
            }
            haveTheBuyer=true;
        }else{
            System.out.print("Ошибка у "+this);
        }
    }

    public void printCheck() {
        Double sum=0.0;
        for (Double temp:buy.basket.getBasket().values()){
            sum+=temp;
        }
        synchronized(fakeBalance) {
            fullSum+=sum;
        }
        Set set = buy.basket.getBasket().entrySet();
        Iterator it = set.iterator();
        System.out.println("Список купленных товаров:");
        while (it.hasNext()) {
            Map.Entry me = (Map.Entry) it.next();
            System.out.println(me.getKey().toString());
        }
        buy.basket.deleteGoods();
        notify();
        System.out.println("Итог за чек:"+sum.toString());
        System.out.println("Общий итог:"+fullSum.toString());
    }
    public String toString() {
        return this.getName();
    }
}
