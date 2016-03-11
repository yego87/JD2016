package by.it.novik.JD02_01;


import java.util.ArrayList;

public class Basket {
    ArrayList<String> space;

    public Basket() {
        this.space = new ArrayList<String>();
}

    public void putProduct(String product) {
        this.space.add(product);
    }
}
