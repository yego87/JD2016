package by.it.novik.JD02_01;


import java.util.ArrayList;

public class Cashier extends Thread implements ICashier {
    Prices priceList;


    public Cashier(Basket basket) {
        int totalCount = 0;

        for (String product : basket) {
            totalCount += priceList.getPrice(product);
        }

        System.out.println(this.getName() + " потратил " + totalCount + " USD");
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
