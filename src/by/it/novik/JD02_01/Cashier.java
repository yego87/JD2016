package by.it.novik.JD02_01;

import java.util.ArrayList;

public class Cashier extends Thread implements ICashier {
    private int num;
    Customer customer;
    private static Cashier ourInstance = new Cashier();

    public static Cashier getInstance() {
        return ourInstance;
    }

    static int numOfCashiers = 0;
    static int completeCustomers = 0;

    private Cashier() {
        this.num = ++numOfCashiers;//volatile or atomic??
        this.setName("Кассир N " + num);
    }
    public String toString() {
        return this.getName();
    }

    static final int planNumOfCustomers = 5;

    public void run() {
        System.out.println(this.getName() + " открылась");//open cash
        while(!(completeCustomers>=planNumOfCustomers)) {//пока не выполнен план, т.е. должно быть покупателей больше либо равно как по плану (5)
            customer = Queue.poll();
            if (customer != null)
                synchronized (customer) {
                    serve(customer);
                    completeCustomers++;

                    customer.shouldWait = false;//пора отпустить его дальше, т.е. отменить условие + notify
                    customer.notify();
                }
            else {
                customer.think();
            }
        }
        System.out.println(this.getName() + " закрылась.");
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

    }
}
