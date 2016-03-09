package by.it.predkel.JD0201Thread;

import by.it.predkel.SimplyUsefulClasses.Rnd;

import java.util.*;

/**
 * Created by user_2 on 09.03.2016.
 */
public class Basket {
    private HashMap<String, Double> listOfAllGoods = InpGoods.lGoods();
    private HashMap<String, Double> listOfChosenGoods = InpGoods.lGoods();
    private ArrayList<String> listNames=new ArrayList<>();
    public void chooseGoods() {
        int iter = Rnd.fromTo(1, 5);//kolicestvo tovarov
        for (int i = 0; i < iter; i++) {
            Set set = listOfAllGoods.entrySet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                Map.Entry me = (Map.Entry) it.next();
                listNames.add(me.getKey().toString());
            }
            int k=Rnd.fromTo(0, listNames.size());
            listOfChosenGoods.put(listNames.get(k), listOfAllGoods.get(listNames.get(k)));

            System.out.println(k+'-'+listNames.get(k));
        }
    }
}
