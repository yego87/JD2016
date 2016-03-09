package by.it.daylidovich.JD02_01;

import static by.it.daylidovich.JD02_01.RandomFromInterval.*;

public class Buyer extends Thread implements IBuyer, Runnable {

    int numberBuyer;

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
        int waiting = randomInterval(500, 2000);
        try {
            Thread.sleep(waiting);
        } catch (InterruptedException e) {
            System.out.println("Ошибка ожидания.");
        }
        System.out.println(this + " выбрал товар.");
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
}
