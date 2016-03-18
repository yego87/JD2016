package by.it.knyazev.JD02.less_01.A;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Mac on 09.03.16.
 */
public class Buyer extends Thread implements Runnable, IBuyer,IUseBacket {

    int num; //номер покупателя

    //конструктор покупателя с его номером
    public Buyer(int num) {
        this.num = num;
        this.setName("Покупатель № "+ num+" ");
        start();
    }

    @Override //покупатель приходит в зал и выбирает товары.
    public void run() {
        enterToMarket();
        takeBacket();
        chooseGoods();
        takeRandomGood();
        putGoodsToBacket();
        goToOut();
    }

    //при получение строкового значения для экземпляра покупателя
    @Override
    public String toString() {
        return this.getName();
    }

    //реализация интерфейсов
    @Override
    public void enterToMarket() {
        System.out.println(this + "вошел в магазин");
    }

    @Override
    public void chooseGoods() {
        try {
            //вызываем свой генератор случайных чисел
            int pause = Rnd.fromTo(500, 2000);
            Thread.sleep(pause);
        } catch (InterruptedException e) {
            System.out.println(this+" //некорректное завершение ожидания");
        }
        //ожидание окончено
        System.out.println(this + "выбрал товар");


        Map<String,Integer> buyerBacketMap = new HashMap<>();
        int goodsQuantity = Rnd.fromTo(1,4);
        for (int i = 0; i < goodsQuantity; i++){

            String randomGood = takeRandomGood();
            putGoodsIntoBacket(randomGood);
        }
    }
    @Override
    public void putGoodsIntoBacket(String good) {
        try{
            int pause = Rnd.fromTo(500, 2000);
            Thread.sleep(pause);

        } catch (InterruptedException e) {
            System.out.println(this+" некорректное завершение ожидания.");
        }
        System.out.println(this+" положил "+good+" в корзину");
    }

    @Override
    public void goToOut() {
        System.out.println(this + "вышел из магазина");
    }

    @Override
    public void takeBacket() {
        int pause = Rnd.fromTo(500, 2000);
        System.out.println(this+" взял корзину");
    }

    @Override
    public void putGoodsToBacket() {
        int pause = Rnd.fromTo(500, 2000);
        System.out.println();
    }

    static Map<String, Integer> goodsMap = Utility.FromFileToMap();

    public static String takeRandomGood(){

        List<String> goodsList = new ArrayList<>(goodsMap.keySet());
        return goodsList.get(Rnd.fromTo(0, goodsList.size()-1));

    }
}
