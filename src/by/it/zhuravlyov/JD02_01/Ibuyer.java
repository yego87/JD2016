package by.it.zhuravlyov.JD02_01;

/**
 * Created by user_2 on 09.03.2016.
 */
public interface Ibuyer {

    void enterToMarket();   //вошел в магазин (мгновенно)
    void chooseGoods(); ////выбрал товар (от 0.5 до 2 секунд)
    void goToOut();   //отправился на выход(мгновенно)
}