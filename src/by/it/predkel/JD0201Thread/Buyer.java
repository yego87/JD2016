package by.it.predkel.JD0201Thread;

import by.it.predkel.SimplyUsefulClasses.Rnd;

class Buyer extends Thread implements Runnable, IBuyer,IUseBasket {

    int num; //номер покупателя
    Basket basket;
    boolean pensioneer=false;

    //конструктор покупателя с его номером
    public Buyer(int num) {
        this.num = num;
        this.setName("Покупатель № "+ num+" ");
        start();
    }

    @Override //покупатель приходит в зал и выбирает товары.
    public void run() {
        enterToMarket();
        takeBacket();
        chooseGoods();
        goToOut();
    }

    //при получение строкового значения для экземпляра покупателя
    @Override
    public String toString() {
        return this.getName();
    }

    //реализация интерфейсов
    @Override
    public void enterToMarket() {
        System.out.println(this + "вошел в магазин");
    }

    @Override
    public void chooseGoods() {
            try {
                //вызываем свой генератор случайных чисел
                int pause= Rnd.fromTo(500, 2000);
                Thread.sleep(pause);
            } catch (InterruptedException e) {
                System.out.println(this+" //некорректное завершение ожидания");
            }
        basket.chooseGoods();
        //ожидание окончено
        System.out.println(this + "выбрал товар");
        putGoodsToBacket();
    }

    @Override
    public void goToOut() {
        returnBasket();
        this.basket=null;
        System.out.println(this + "вышел из магазина");
    }

    @Override
    public void takeBacket() {
        this.basket=new Basket();
        System.out.println(this + "Взял корзину");
    }

    @Override
    public void putGoodsToBacket() {
        System.out.println(this+" положил товары в корзину");
    }

    @Override
    public void returnBasket() {
        System.out.println(this+" вернул корзину");
    }
}
