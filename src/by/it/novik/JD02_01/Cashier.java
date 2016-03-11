package by.it.novik.JD02_01;


import java.util.ArrayList;

public class Cashier extends Thread implements ICashier {
    Prices priceList;


    public Cashier() {

    }


public void run() {
    getCustomer();
    getProducts();
    receivePayment();

}
    @Override
    public void getCustomer() {
        new Customer("Sam", priceList);
    }

    @Override
    public void getProducts() {
        new Basket();
    }

    @Override
    public void receivePayment() {

    }
}
