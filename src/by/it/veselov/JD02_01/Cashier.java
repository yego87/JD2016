package by.it.veselov.JD02_01;

/**
 * Created by yegorveselov on 11.03.16.
 */
public class Cashier extends Thread implements Runnable  {

    int numCashier;
    public Cashier(int numCashier) {
        this.numCashier = numCashier;
        this.setName("Кассир №" + numCashier);
        start();

    }
}