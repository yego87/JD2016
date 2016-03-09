package by.it.novik.JD02_01;


import java.util.HashMap;

public class Prices {

    public HashMap<String, Integer> getPriceList() {

        int priceK;
        String[] nameV = {"apple", "juice", "jam", "pie", "water", "cookie","cake", "tea", "coffee", "bread"};

        HashMap<String, Integer> priceList = new HashMap<>();

        for (int i = 0; i < nameV.length; i ++) {
            priceK = (i+1)*10;
            priceList.put(nameV[i],priceK);
        }
        return priceList;
    }

    public String getProduct(HashMap<String, Integer> priceList) {
        int productNum = 0;
        String product = null;

        for (String key : getPriceList().keySet()) {
//            productNum = getPriceList().get(key);
            product = key;
        }
//        System.out.println(product + " за " + productNum + " у.е.");
        return product;

    }
}
