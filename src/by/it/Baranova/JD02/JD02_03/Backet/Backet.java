package by.it.Baranova.JD02.JD02_03.Backet;

import java.util.HashMap;

/**
 * Created by Ekaterina on 3/9/16.
 */
public class Backet {

    //Поля
    int num;
    private HashMap<String, Integer> productsMap;


    //Конструктор
    public Backet(HashMap<String, Integer> productsMap) {
        this.productsMap = productsMap;
    }

    //Getters
    public HashMap<String, Integer> getProductsMap() {
        return productsMap;
    }

    public int getNum() {
        return num;
    }
}