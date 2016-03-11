package by.it.predkel.JD0201Thread.Int;

public interface IBuyer {
    void enterToMarket();   //вошел в магазин
    void chooseGoods();     //выбрал товары
    void goToCashier() throws InterruptedException;     //пойти в очередь
    void goToOut();         //отправился на выход
}

