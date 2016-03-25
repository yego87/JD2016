package by.it.zhuravlyov.JD02_01;

/**
 * Created by user_2 on 09.03.2016.
 */
public class Buyer extends Thread implements Runnable, Ibuyer {


    int num ; //коль-во  покупателей
    public Buyer (int num){
        this.num=num;
        this.setName("покупатель №"+num+"");
    start();
    }

    @Override //покупатель приходит в зал и выбирает товары.
    public void run() {
        enterToMarket();
        chooseGoods();
        goToOut();
    }

    @Override // для вывода имени покупателя
public String toString() {return this.getName();}

    @Override
    public void enterToMarket() {
        System.out.println(this + "вошел в магазин");
    }

    @Override
    public void chooseGoods() {
try{
        int pause=Rnd.fromTo(500,2000);
        Thread.sleep(pause);}
        catch(InterruptedException e){  //вопрос в этой строке что она делает
         System.out.println(this+"//некоректное завершение ожидания");
        }
        System.out.println(this+"выбрал товар");
    }
    @Override
    public void goToOut() {System.out.println(this + "вышел из магазина");

    }
}
