package by.it.novik.JD02_01;

import java.util.ArrayList;

public class Cashier implements ICashier {
    private static Cashier ourInstance = new Cashier();

    public static Cashier getInstance() {
        return ourInstance;
    }

    private Cashier() {
    }

    @Override
    public ArrayList<String> getProducts(Basket basket) {
        return basket.space;
    }

    @Override
    public long receivePayment(ArrayList<String> products) {
        long bill = 0;
        Prices priceList = Prices.getInstance();

        for (String product : products) {
            bill += priceList.getPrice(product);
        }

        return bill;
    }

    @Override
    public void serve(Customer customer) {
        long payment = receivePayment(customer.basket.space);

        customer.think();

        System.out.printf("%s заплатил %d USD.\n", customer, payment);
        //System.out.println("");
    }
}
