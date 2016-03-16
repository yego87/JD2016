package by.it.chetovich.JD02_03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * JD02_01
 */
public class Main {

    public static void main (String [] args) throws InterruptedException {

        //создаём пулл на пять потоков для касс
        ExecutorService executor= Executors.newFixedThreadPool(5);
        for (int i = 1; i < 5; i++) {
            executor.execute(new Cashier(i));
        }
        executor.shutdown();

        int countBuyers = 0;
        while (ShopDispatcher.countBuyersIn<ShopDispatcher.planBuyers){
            //как часто заходят покупатели в начале и в конце минуты
            Utils.sleep(Utils.howlongToSleep());
            //создаём нового покупателя
            countBuyers = Utils.createNewBuyer(countBuyers);
        }


        Thread.sleep(25000);
        System.out.println("Total profit: "+ Profit.getTotalProfit());
        System.out.println("Each cashier profit: "+ Profit.getEachCashierProfit());
    }
}
