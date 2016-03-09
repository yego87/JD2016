package by.it.telushko.jd02_01;

public class Buyer extends Thread implements Runnable,IBuyer {
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
    public String toString(){
        return this.getName();
    }
    @Override
    public void enterToMarket(){
        System.out.println("");
    }
}
