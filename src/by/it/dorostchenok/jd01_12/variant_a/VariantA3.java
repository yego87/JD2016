package by.it.dorostchenok.jd01_12.variant_a;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VariantA3{

    public List<Integer> generateList(int listLength){
        List<Integer> list = new ArrayList<>(listLength);
        Random rand = new Random();
        for (int j = 0; j <= listLength; j++){
            list.add(rand.nextInt());
        }

        return list;
    }
}
