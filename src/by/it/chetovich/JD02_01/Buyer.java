package by.it.chetovich.JD02_01;


/**
 * class for buyers
 */
public class Buyer extends Thread implements Runnable,IBuyer, IUseBacket {

    int num;

    public Buyer(int num) {
        this.num = num;
        this.setName("Buyer " + num + " ");
        start();
    }

    @Override
    public void run (){
        enterMarket();
        takeBacket();
        chooseGoods();
        exitMarket();

    }

    @Override
    public String toString (){

        return this.getName();
    }

    @Override
    public void enterMarket(){
        System.out.println(this+" entered the market.");
    }

    @Override
    public void chooseGoods(){/*
        try{
            int goodsQuantity = Rnd.fromTo(1,5);
            for (int i = 0; i < goodsQuantity; i++) {
                putGoodsIntoBacket("");
            }
        } catch (InterruptedException e) {
            System.out.println(this+" некорректное завершение ожидания.");
        }*/
        System.out.println(this+" chose goods.");
    }

    @Override
    public void exitMarket(){
        System.out.println(this+" exited the market.");

    }

    @Override
    public void takeBacket() {
        try{
            int pause = Rnd.fromTo(200, 500);
            Thread.sleep(pause);
        } catch (InterruptedException e) {
            System.out.println(this+" некорректное завершение ожидания.");
        }
        System.out.println(this+" took a backet.");
    }

    @Override
    public void putGoodsIntoBacket(String good) {
        try{
            int pause = Rnd.fromTo(2000, 5000);
            Thread.sleep(pause);

        } catch (InterruptedException e) {
            System.out.println(this+" некорректное завершение ожидания.");
        }
        System.out.println(this+" put "+good+" into backet.");

    }
}

