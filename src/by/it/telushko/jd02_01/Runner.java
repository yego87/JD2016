package by.it.telushko.jd02_01;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;

public class Runner {
    static int countBuyers=0;

    public static void main(String[] args) throws InterruptedException{
        HashMap<String,Integer> goodsList = new HashMap<>();
        goodsList.put("Фильтр",10);goodsList.put("Лампочка",3);
        goodsList.put("Колодки",40);goodsList.put("Антифриз",10);
        goodsList.put("Масло",75);goodsList.put("Дворники",100);

        Queue<Buyer> queue=new ArrayDeque<>();
        while (countBuyers<10){
            Thread.sleep(1000);
            int count=Rnd.fromTo(0,2);
            for (int i = 0; i <count ; i++) {
                countBuyers++;
                if (countBuyers<11){
                    Buyer buyer=new Buyer(countBuyers);
                    queue.add(buyer);
                }
            }
        }
    }
}
