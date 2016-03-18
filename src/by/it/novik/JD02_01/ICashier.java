package by.it.novik.JD02_01;

import java.util.ArrayList;

public interface ICashier {
    void serve(Customer customer);

    ArrayList<String> getProducts(Basket basket);
    long receivePayment(ArrayList<String> products);
}
