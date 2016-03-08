package by.it.knyazev.Less_12.A1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Mac on 08.03.16.
 */
public class RandomList {
    public static ArrayList<Integer> ArrayList (int elemQuantity){
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < elemQuantity; i++) {
            list.add(rand.nextInt(5) + 1);
        }
        return list;
    }

    public static ArrayList<Integer> GoodList (List<Integer> list){
        ArrayList<Integer> good = new ArrayList<>();
        for (Integer vote : list) {
            if (vote>2) good.add(vote);
        }
        return good;
    }
}
