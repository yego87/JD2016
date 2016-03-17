package by.it.Baranova.JD02.JD02_03;


import by.it.Baranova.JD02.JD02_03.Backet.Backet;
import by.it.Baranova.JD02.JD02_03.Backet.IUseBacket;
import by.it.Baranova.JD02.JD02_03.Backet.Products;

import java.util.HashMap;
import java.util.Map;

public class Buyer extends Thread implements Runnable,IBuyer,IUseBacket {

    public int getNum() {
        return num;
    }

    //Поля
    int num;
    boolean pensioner;
    Backet backet;
    public boolean iWait=false;

    //Конструктор
    public Buyer(int num, boolean pensioner){
        this.num=num;
        this.pensioner=pensioner;
        this.backet=new Backet(new HashMap<String,Integer>());
        this.setName(pensioner?("Pensioner №"+num+" "):("Buyer №"+num+" "));
        start();
    }

    public Backet getBacket() {
        return this.backet;
    }

    public boolean isPensioner() {
        return pensioner;
    }

    @Override
    public void run(){
        enterToMarket();
        takeBacket();
        chooseGoods();
        goToCashier();
        goToOut();
    }

    @Override
    public void enterToMarket(){
        System.out.println(this+" enter to store");
    }

    @Override
    public void takeBacket(){
        int pause=pensioner?Rnd.fromTo(150,300):Rnd.fromTo(100,200);
        Dispatcher.sleep(pause);
        System.out.println(this+" take a backet");
    }


    @Override
    public void chooseGoods() {
        System.out.println(this + " choose the goods&\n\tput them to the backet");
        HashMap<String,Integer> thisbacket;
        int quant = Rnd.fromTo(1, 4);
        thisbacket=putGoodsToBacket(Products.addProducts(),quant);
        this.backet=new Backet(thisbacket);
    }

    @Override
    public void goToCashier () {
        synchronized (this) {
            System.out.println(this + " went to the queue");
            QueueToCashier.add(this);
            iWait = true;
            while (iWait) try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public void goToOut(){
        System.out.println(this+" quit the store");
    }



    @Override
    public HashMap<String, Integer> putGoodsToBacket(HashMap<String, Integer> products,int quant) {
        try {
            int pause =pensioner?Rnd.fromTo(150, 300):Rnd.fromTo(100,200);
            Thread.sleep(pause);
            String[] prodKey = new String[products.size()];
            HashMap<String, Integer> productsMap = new HashMap<>();
            int i = 0;
            for (Map.Entry<String, Integer> pair : products.entrySet()) {
                prodKey[i] = pair.getKey();
                i++;
            }
            for (int j = 0; j < quant; j++) {
                int numberOfProduct = (int) (Math.random() * ((prodKey.length)));
                productsMap.put(prodKey[numberOfProduct], products.get(prodKey[numberOfProduct]));
            }
            return productsMap;
        } catch (InterruptedException e) {
            System.out.println(this + "//некорректное завершение ожидания");
        }
        return null;
    }


    @Override
    public String toString(){
        return this.getName();
    }
}
