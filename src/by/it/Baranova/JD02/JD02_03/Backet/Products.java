package by.it.Baranova.JD02.JD02_03.Backet;

import java.util.HashMap;

/**
 * Created by Ekaterina on 3/9/16.
 */
public class Products {
        public static HashMap<String, Integer> addProducts() {
            HashMap<String,Integer> hashMap = new HashMap<>();
            hashMap.put("Молоко",17500);
            hashMap.put("Зефир",18500);
            hashMap.put("Спички",5000);
            hashMap.put("Курица",53000);
            hashMap.put("Конфеты",78000);
            hashMap.put("Сметана",15000);
            hashMap.put("Печенье",76000);
            hashMap.put("Яйца",14500);
            return hashMap;
        }
    }

