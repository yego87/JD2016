package by.it.zebnitskiy.JD_02.JD_02_01;

/**
 * Created by Зебницкий Максим on 3/14/2016.
 */
class Buyer  extends Thread implements Runnable, IBuyer,IUseBacket {
    // номер покупателя
    int num; //номер покупателя
    // конструктор покупателя с его номером
    public Buyer(int num) {
        this.num = num;
        this.setName("Покупатель № " + num + " ");
        start();
    }
    @Override //покупатель приходит в зал и выбирает товары.
    public void run(){
        enterToMarket();
        takeBacker();
        chooseGoods();
        putGoodToBacket();
        goToOut();

    }
    public String toString(){
        return this.getName();
    }
    @Override
    public void enterToMarket(){
        try{
            Thread.sleep(Rnd.fromTo(100,2000 ));
        }
        catch(Exception e){}
        System.out.println(this + " вошел в магазин");
    }
    @Override
    public void takeBacker(){
        try{
            Thread.sleep(Rnd.fromTo(100,1000 ));
        }
        catch(Exception e){}
        System.out.println(this + "взял корзинку");
    }
    @Override
    public void chooseGoods(){
        try{
            Thread.sleep(Rnd.fromTo(500, 1000));
        }
        catch(Exception e){}
        System.out.println(this + " выбрал товар ");
    }
    @Override
    public void putGoodToBacket(){
        System.out.println(this + "положил выбранный товар в карзину");
    }

    @Override
    public void goToOut(){
        System.out.println(this + " вышел из магазина " );
    }
}
