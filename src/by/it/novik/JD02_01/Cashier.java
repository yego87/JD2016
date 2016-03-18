package by.it.novik.JD02_01;

import java.util.ArrayList;

public class Cashier extends Thread implements ICashier {
    private int num;
    Customer customer;
//    private static Cashier ourInstance = new Cashier();

//    public static Cashier getInstance() {
//        return ourInstance;
//    }

    static volatile int numOfCashiers = 0;
    static int completeCustomers = 0;

    public Cashier() {
        this.num = ++numOfCashiers;//volatile?
        this.setName("Кассир N " + num);
    }
    public String toString() {
        return this.getName();
    }

    static final int planNumOfCustomers = 6;

    public void run() {
        System.out.println(this.getName() + " открылся");//open cash
        while(!(completeCustomers>=planNumOfCustomers)) {//пока не выполнен план, т.е. должно быть покупателей больше либо равно как по плану (5)
            customer = Queue.poll();
            if (customer != null)
                synchronized (customer) {
                    System.out.println(this.getName() + " обслуживает " + customer);
                    Customer.think();
                    System.out.println(this.getName() + " обслужил " + customer);
                    serve(customer);
                    completeCustomers++;
                    System.out.println(this.getName() + " ослужил " + completeCustomers + " покупателей.");
                    customer.shouldWait = false;//пора отпустить его дальше, т.е. отменить условие + notify
                    customer.notify();
                }
            else {
                customer.think();
            }
        }
        System.out.println(this.getName() + " закрылся.");
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
