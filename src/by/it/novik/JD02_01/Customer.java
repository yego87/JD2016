package by.it.novik.JD02_01;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;
import java.util.Random;

public class Customer extends Thread implements ICustomer, IUseBasket {

    String name;
    Prices priceList;
    Basket basket;

    ArrayList<String> chosenProducts = new ArrayList<>();

//    public String getProduct() {
//        return product;
//    }
//
//    public void setProduct(String product) {
//        this.product = product;
//    }

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
    public void chooseProduct() {
        try {
            sleep((int)(0.5 + (Math.random()*1.5)));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int productsCount = new Random().nextInt(4);

        for (int i = 0; i < productsCount; i++) {
            String product = priceList.getProduct();
            chosenProducts.add(product);

            System.out.println(this.getName() + " взял " + product + ".");
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
    public void putGoodsIntoBasket() {

        try {
            sleep((int)(0.1 + (Math.random()*0.1)));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int productsCount = new Random().nextInt(4);

        for (String product : chosenProducts) {
            basket.putProduct(product);
            System.out.println(this.getName() + " положил " + product + " в корзину");
        }
    }
}
