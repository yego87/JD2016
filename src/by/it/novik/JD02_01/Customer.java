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

    public Customer(String name) {
        this.name = name;
        this.priceList = Prices.getInstance();

        this.setName("Покупатель " + name);

        start();
    }


    public void run() {
        enterMarket();
        takeBasket();
        chooseProduct();
        putGoodsIntoBasket();
        goToCashier();
        goOut();
    }

    public void goToCashier() {
        Cashier cashier = Cashier.getInstance();
        cashier.serve(this);
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
        int productsCount = new Random().nextInt(3) + 1;

        for (int i = 0; i < productsCount; i++) {
            think();

            String product = priceList.getProduct();
            chosenProducts.add(product);

            System.out.println(this.getName() + " взял " + product + ".");
        }
    }

    @Override
    public void goOut() {
        System.out.println(this.getName() + " вышел.");
    }

    @Override
    public void takeBasket() {
        think();

        basket = new Basket();
        System.out.println(this.getName() + " взял корзину." );
    }

    @Override
    public void putGoodsIntoBasket() {
        think();

        for (String product : chosenProducts) {
            basket.putProduct(product);
            System.out.println(this.getName() + " положил " + product + " в корзину");
        }

        System.out.println(this.getName() + " имеет в корзине " + basket.space);
    }

    public void think() {
        try {
            sleep(Rndm.fromTo(500, 2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
