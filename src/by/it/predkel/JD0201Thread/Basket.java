package by.it.predkel.JD0201Thread;

import java.util.*;

/**
 * Created by user_2 on 09.03.2016.
 */
public class Basket {
    private HashMap<String, Double> listOfChosenGoods;

    public void putToBasket(HashMap<String, Double> listOfChosenGoods){
        this.listOfChosenGoods=listOfChosenGoods;
    }

    public HashMap<String, Double> getBasket(){
        return listOfChosenGoods;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("в коризине имеет: ");
        for (String s1 : listOfChosenGoods.keySet()) {
            s.append(s1);
            s.append(" ");
        }
        return s.toString();
    }
    public void deleteGoods() {
        listOfChosenGoods.clear();
    }
}
