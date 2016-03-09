package by.it.daylidovich.JD02_01.Buyer;

import by.it.daylidovich.JD02_01.Goods.Goods;

import java.util.ArrayList;

import static by.it.daylidovich.JD02_01.Utils.RandomFromInterval.randomInterval;

public class Buyer extends Thread implements IBuyer, Runnable, IUseBacket {

    int numberBuyer;
    ArrayList<String> backet = new ArrayList<>();

    public Buyer(int numberBuyer){
        this.numberBuyer = numberBuyer;
        this.setName("Покупатель №" + numberBuyer);
        start();
    }

    @Override
    public void enterToMarket() {
        System.out.println(this + " вошел в магазин.");
    }

    @Override
    public void chooseGoods() {
        int countGoods = randomInterval(1,4);
        for (int i = 0; i < countGoods; i++) {
            backet.add(Goods.randomGoods());
            putGoodsToBacket();
        }
        System.out.println(this + " совершил покупки.");
    }

    @Override
    public void goToExit() {
        System.out.println(this + " вышел из магазина.");
    }

    @Override
    public void run() {
        enterToMarket();
        chooseGoods();
        goToExit();
    }

    public String toString(){
        return this.getName();
    }

    @Override
    public void takeBacket() {
        int timing = randomInterval(100,200);
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
        try{
            Thread.sleep(timing);
        }
        catch (InterruptedException e){
            System.out.println("Ошибка ожидания.");
        }
    }
}
