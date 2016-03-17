package by.it.Baranova.JD02.JD02_03.Backet;

import java.util.HashMap;

/**
 * Created by Ekaterina on 3/9/16.
 */
public interface IUseBacket {
    void takeBacket();
    HashMap <String,Integer> putGoodsToBacket(HashMap<String, Integer> productsMap, int quant);

}
