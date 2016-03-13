package by.it.daylidovich.JD02_01_and_02.Buyer;

import by.it.daylidovich.JD02_01_and_02.Goods.Goods;
import by.it.daylidovich.JD02_01_and_02.Queue.QueueBuyer;

import java.util.ArrayList;

import static by.it.daylidovich.JD02_01_and_02.Utils.RandomFromInterval.randomInterval;

public class Buyer extends Thread implements IBuyer, Runnable, IUseBacket {

    int numberBuyer;

    public void setBacket(ArrayList<String> backet) {
        this.backet = backet;
    }

    public ArrayList<String> getBacket() {
        return backet;
    }

    ArrayList<String> backet = new ArrayList<>();
    boolean pensioneer = false;

    public Buyer(int numberBuyer){
        this.numberBuyer = numberBuyer;
        this.setName("Покупатель №" + numberBuyer);
        if (3 == randomInterval(1,4))
            pensioneer = true;
        start();
    }

    @Override
    public void run() {
        enterToMarket();
        chooseGoods();
        QueueBuyer.goToQueue(this);
        while (null != backet){yield();}
        goToExit();
    }

    @Override
    public void enterToMarket() {
        System.out.println(this + " вошел в магазин.");
    }

    @Override
    public void chooseGoods() {
        int countGoods = randomInterval(1,4);
        for (int i = 0; i < countGoods; i++) {
            String goods = Goods.randomGoods();
            backet.add(goods);
            putGoodsToBacket();
        }
        System.out.println(this + " совершил покупки.");
    }

    @Override
    public void goToExit() {
        System.out.println(this + " вышел из магазина.");
    }

    public String toString(){
        return this.getName();
    }

    @Override
    public void takeBacket() {
        int timing = randomInterval(100,200);
        if (pensioneer)
            timing = (int)(timing *1.5);
        try{
            Thread.sleep(timing);
        }
        catch (InterruptedException e){
            System.out.println("Ошибка ожидания.");
        }
    }

    @Override
    public void putGoodsToBacket() {
        int timing = randomInterval(100,200);
        if (pensioneer)
            timing = (int)(timing *1.5);
        try{
            Thread.sleep(timing);
        }
        catch (InterruptedException e){
            System.out.println("Ошибка ожидания.");
        }
    }

}
