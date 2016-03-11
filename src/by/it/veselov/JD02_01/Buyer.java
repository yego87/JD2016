package by.it.veselov.JD02_01;

/**
 * Created by yegorveselov on 11.03.16.
 */
public class Buyer extends Thread implements Runnable, IBuyer {

    int num;
    public Buyer(int num) {
        this.num = num;
        this.setName("Покупатель №" + num + " ");
        start();
    }
    @Override
    public void run() {
        enterToMarket();
        chooseGoods();
        goToOut();
    }
    @Override
    public String toString() { return this.getName();}

    @Override
    public void enterToMarket() { System.out.println(this + "вошел в магазин"); }

    @Override
    public void chooseGoods() {
        try {
            int pause = Rnd.fromTo(500, 2000);
            Thread.sleep(pause);
        } catch (InterruptedException e) {
        System.out.println(this + " //некорректное завершение ожидания");
        }
        System.out.println(this + "выбрал товар");
    }

    @Override
    public  void goToOut() { System.out.println(this + "вышел из магазина");}

}
