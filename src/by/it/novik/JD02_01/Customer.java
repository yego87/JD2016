package by.it.novik.JD02_01;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;
import java.util.Random;

public class Customer extends Thread implements ICustomer, IUseBasket {

    String name;
    Prices priceList;
    Basket basket;
    static int customersNum = 0;
    ArrayList<String> chosenProducts = new ArrayList<>();


    public Customer(String name) {
        this.name = name;
        this.priceList = Prices.getInstance();
        this.customersNum++;
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

    public boolean shouldWait;


    public void goToCashier() {
        synchronized (this) {
            System.out.println(this.getName() + " в очереди в кассу.");
            Queue.add(this);//добавляемся add
            shouldWait = true;
            while (shouldWait) {
                try {
                    wait();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //ожидаем, пока кассир отпустит
        }
//        Cashier cashier = Cashier.getInstance();
//        cashier.serve(this); //? move where???
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

    public static void think() {
        try {
            sleep(Rndm.fromTo(500, 2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
