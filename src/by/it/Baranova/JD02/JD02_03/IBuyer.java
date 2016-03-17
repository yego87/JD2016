package by.it.Baranova.JD02.JD02_03;

/**
 * Created by Ekaterina on 3/9/16.
 */
public interface IBuyer {
    void enterToMarket();
    void chooseGoods();
    void goToCashier() throws InterruptedException;
    void goToOut();
}
