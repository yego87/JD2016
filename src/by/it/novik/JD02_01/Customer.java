package by.it.novik.JD02_01;


import java.util.ArrayList;
import java.util.HashMap;

import java.util.Random;

public class Customer extends Thread implements ICustomer, IUseBasket {

    String name;
    Prices priceList;
    Basket basket;
    Cashier cashier;

    ArrayList<String> chosenProducts = new ArrayList<>();


    public Customer(String name, Prices priceList) {
        this.name = name;
        this.priceList = priceList;

        this.setName("Покупатель " + name);
    }

    public void run() {
        enterMarket();
        takeBasket();
        chooseProduct();
        putGoodsIntoBasket();
        goOut();
    }

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public void enterMarket() {
        System.out.println(this.getName() + " вошел в магазин.");
    }

    @Override
    public void takeBasket() {
        try {
            sleep((int)(0.1 + (Math.random()*0.1)));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        basket = new Basket();
        System.out.println(this.getName() + " взял корзину." );
    }

    @Override
    public void chooseProduct() {
        try {
            sleep((int)(0.5 + (Math.random()*1.5)));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int productsCount = new Random().nextInt(4)+1;

        for (int i = 0; i < productsCount; i++) {
            String product = priceList.getProduct();
            basket.putProduct(product);


            System.out.println(this.getName() + " взял " + product + ".");
        }
    }

    @Override
    public void putGoodsIntoBasket() {

        try {
            sleep((int)(0.1 + (Math.random()*0.1)));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (String product : chosenProducts) {
            basket.putProduct(product);
            System.out.println(this.getName() + " положил " + product + " в корзину");
        }
    }


    @Override
    public void goOut() {
        int totalCount = 0;

        for (String product : chosenProducts) {
            totalCount += priceList.getPrice(product);
        }

        System.out.println(this.getName() + " потратил " + totalCount + " USD");
        System.out.println(this.getName() + " вышел.");
    }

}
