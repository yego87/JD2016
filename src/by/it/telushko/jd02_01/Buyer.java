package by.it.telushko.jd02_01;

import java.util.ArrayList;
import java.util.HashMap;

public class Buyer extends Thread implements Runnable,IBuyer,IUseBacket {
    int num;
    HashMap<String,Integer> goodsList = new HashMap<>();
    HashMap<String,Integer> backet=new HashMap();

    public Buyer(int num){
        this.num=num;
        this.setName("Покупатель №"+num+" ");
        goodsList.put("Фильтр",10);goodsList.put("Лампочка",3);
        goodsList.put("Колодки",40);goodsList.put("Антифриз",10);
        goodsList.put("Масло",75);goodsList.put("Дворники",100);
        start();
    }

    @Override
    public void run(){
        enterToMarket();
        putGoodsToBacket();
        chooseGoods();
        goToOut();
    }
    @Override
    public String toString(){return this.getName();}
    @Override
    public void enterToMarket(){System.out.println(this+"вошел в магмазин");}
    @Override
    public void chooseGoods() {
        try {

            int pause = Rnd.fromTo(500, 2000);
            Thread.sleep(pause);
        } catch (InterruptedException e) {
            System.out.println(this + " некорректное заавершение ожидания");
        }
        System.out.println(this + "выбрал товар");
    }
    @Override
    public void goToOut(){System.out.println(this+"вышел из магазина");}
    @Override
    public void takeBacket(){
        System.out.println(this+"взял корзинку");
    }
    public void putGoodsToBacket() throws InterruptedException {
        ArrayList<String> goodsNames = new ArrayList<>(goodsList.keySet());
        for (int i = 0; i <Rnd.fromTo(1,4) ; i++) {
            sleep(Rnd.fromTo(100,200));
            String good=goodsNames.get(Rnd.fromTo(1,goodsList.size()));
            backet.put(good,goodsList.get(good));
            System.out.println(this+"положил в корpинку"+good+"за"+goodsList.get(good));
        }
    }

}
