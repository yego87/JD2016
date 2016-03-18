package by.it.knyazev.JD02.less_01.A;

/**
 * Created by Mac on 09.03.16.
 */
public interface IBuyer {
    void enterToMarket();   //вошел в магазин
    void chooseGoods();     //выбрал товары
    void goToOut();         //отправился на выход
    void putGoodsIntoBacket(String good);
}
