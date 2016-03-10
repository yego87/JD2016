package by.it.novik.JD02_01;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Prices {

    public HashMap<String, Integer> priceList = new HashMap<>();

    private static String[] nameV = {"apple", "juice", "jam", "pie", "water", "cookie", "cake", "tea", "coffee", "zumba", "bread"};

    public Prices() {
        for (int i = 0; i < nameV.length; i++) {
            int priceK = (i + 1) * 10;

            priceList.put(nameV[i], priceK);
        }
    }

    public String getProduct() {
        return nameV[new Random().nextInt(nameV.length - 1)];
    }

    public Integer getPrice(String product) {
        return priceList.get(product);
    }
}
