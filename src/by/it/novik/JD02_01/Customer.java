package by.it.novik.JD02_01;


import java.util.HashMap;

public class Customer extends Thread implements ICustomer, IUseBasket {

    String name;
    String product;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Customer(String name) {
        this.name = name;
        this.setName("Покупатель " + name);
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
        System.out.println(this.getName() + " взял " + pr1.getProduct(priceList) + ".");
    }

    @Override
    public void goOut() {
        System.out.println(this.getName() + " вышел.");
    }
    public void run() {
        enterMarket();
        takeBasket();
        chooseProduct();
        putGoodsIntoBasket();
        goOut();
    }
    Prices pr = new Prices();

    HashMap<String, Integer> priceList = pr.getPriceList();

    Prices pr1 = new Prices();



        @Override
    public void takeBasket() {
        System.out.println(this.getName() + " взял корзину.");
    }

    @Override
    public void putGoodsIntoBasket() {
        System.out.println(this.getName() + " положил " + pr1.getProduct(priceList) + " в корзину");
    }
}
