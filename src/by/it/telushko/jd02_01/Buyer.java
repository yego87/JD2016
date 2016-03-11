package by.it.telushko.jd02_01;

import java.util.HashMap;

public class Buyer extends Thread implements Runnable,IBuyer,IUseBacket {
    int num;
    public Buyer(int num){
        this.num=num;
        this.setName("Покупатель №"+num+" ");
        start();
    }
    @Override
    public void run(){
        enterToMarket();
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
    public void putGoodsToBacket(){
        HashMap backet=new HashMap();
        for (int i = 0; i <Rnd.fromTo(1,4) ; i++) {
        }
    }

}
