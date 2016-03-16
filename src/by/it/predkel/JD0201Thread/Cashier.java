package by.it.predkel.JD0201Thread;

import by.it.predkel.SimplyUsefulClasses.Rnd;
import java.util.*;

/**
 * Created by user_2 on 11.03.2016.
 */
public class Cashier extends Thread implements Runnable {
    int num; //номер кассира
    Buyer buy;
    private final static Integer fakeBalance=0;
    public static Double fullSum=0.0;
    MyQueue myq;
    StringBuilder otstup=new StringBuilder("\t");

    public Cashier(MyQueue cl) {
        synchronized (fakeBalance) {
            this.num = ++Dispatcher.countCashiers;
        }
        myq=cl;
        for (int i=0;i<num;i++){
            for (int j=0;j<15;j++) {
                otstup.append("\t");
            }
        }
        this.setName("Кассир № "+ num+" ");
        start();
    }

    @Override
    public void run() {
        while (!Dispatcher.finish()) {
            getBuyerFromQueue();
            if (buy!=null){
                printCheck();
            }else {
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void getBuyerFromQueue() {
            synchronized (fakeBalance) {
                buy = (Buyer) myq.pollFirst();
            }
        try {
            sleep(Rnd.fromTo(1000,5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void printCheck() {
        Double sum=0.0;
        for (Double temp:buy.basket.getBasket().values()){
            sum+=temp;
        }
        synchronized(fakeBalance) {
            fullSum=fullSum+ sum;
        }
        Set set = buy.basket.getBasket().entrySet();
        Iterator it = set.iterator();
        System.out.println(otstup+"Список купленных товаров:");
        while (it.hasNext()) {
            Map.Entry me = (Map.Entry) it.next();
            System.out.println(otstup+me.getKey().toString());
        }
        buy.basket.deleteGoods();
        synchronized (buy) {
            Dispatcher.countCompleteBuyers++;
            buy.iWait=false;
            buy.notify();
        }
        System.out.println(otstup+"Итог за чек:"+sum.toString());
        System.out.println("Общий итог:"+fullSum.toString());
    }
    public String toString() {
        return this.getName();
    }
}
