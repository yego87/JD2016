package by.it.predkel.JD0201Thread;

import by.it.predkel.JD0201Thread.Int.IBuyer;
import by.it.predkel.JD0201Thread.Int.IUseBasket;
import by.it.predkel.SimplyUsefulClasses.Rnd;

class Buyer extends Thread implements Runnable, IBuyer,IUseBasket {

    final Integer num; //номер покупателя
    Basket basket;
    public boolean pensioneer=false;
    MyQueue myq;
    //конструктор покупателя с его номером

    public Buyer(int num, MyQueue cl) {
        this.num = num;
        if (Rnd.fromTo(0,3)==0)
        pensioneer=true;
        myq=cl;
        this.setName("Покупатель № "+ num+" ");
        start();
    }

    @Override //покупатель приходит в зал и выбирает товары.
    public void run() {
        enterToMarket();
        takeBacket();
        chooseGoods();
        goToCashier();
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
                int pause= Rnd.fromTo(100, 200);
                Thread.sleep(pensioneer?pause:pause*2);
            } catch (InterruptedException e) {
                System.out.println(this+" //некорректное завершение ожидания");
            }
        basket.putToBasket(MiniHelper.chooseGoods());
        //ожидание окончено
        System.out.println(this + "выбрал товар");
        putGoodsToBacket();
    }

    @Override
    public synchronized void goToCashier() {
        if (pensioneer) {
            myq.addFirst(this);
        }else {
            myq.addLast(this);
        }
            while (!basket.getBasket().isEmpty()) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


    @Override
    public void goToOut() {
        try {
            //вызываем свой генератор случайных чисел
            int pause= Rnd.fromTo(100, 200);
            Thread.sleep(pensioneer?pause:pause*2);
        } catch (InterruptedException e) {
            System.out.println(this+" //некорректное завершение ожидания");
        }
        System.out.println(this+""+ basket);
        returnBasket();
        this.basket=null;
        System.out.println(this + "вышел из магазина "+(pensioneer?"Шустрик":"Пенсионер"));
    }

    @Override
    public void takeBacket() {
        try {
            //вызываем свой генератор случайных чисел
            int pause= Rnd.fromTo(100, 200);
            Thread.sleep(pensioneer?pause:pause*2);
        } catch (InterruptedException e) {
            System.out.println(this+" //некорректное завершение ожидания");
        }
        this.basket=new Basket();
        System.out.println(this + "Взял корзину");
    }

    @Override
    public void putGoodsToBacket() {
        try {
            //вызываем свой генератор случайных чисел
            int pause= Rnd.fromTo(100, 200);
            Thread.sleep(pensioneer?pause:pause*2);
        } catch (InterruptedException e) {
            System.out.println(this+" //некорректное завершение ожидания");
        }
        System.out.println(this+" положил товары в корзину");
    }

    @Override
    public void returnBasket() {
        try {
            //вызываем свой генератор случайных чисел
            int pause= Rnd.fromTo(100, 200);
            Thread.sleep(pensioneer?pause:pause*2);
        } catch (InterruptedException e) {
            System.out.println(this+" //некорректное завершение ожидания");
        }
        System.out.println(this+" вернул корзину");
    }
}
