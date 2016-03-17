package by.it.chetovich.JD02_01;

import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Total income and each cashier income
 */
public class Profit {

    private static Map<Integer, Integer> eachCashierProfit = new ConcurrentSkipListMap<>();
    private static int totalProfit;
    private final static Lock lockProfit = new ReentrantLock();


    public static int getTotalProfit() {
        return totalProfit;
    }


    public static Map<Integer, Integer> getEachCashierProfit() {
        return eachCashierProfit;
    }

    public static void addCashierProfit(int cashierNum, int profit){

        //если в карте уже есть этот номер кассы, то добавляем к его значению новый профит из аргумента
        //если такой кассы ещё нет, добаляем её и профит из аргумента
        int newProfit = eachCashierProfit.containsKey(cashierNum)?profit + eachCashierProfit.get(cashierNum):profit;
        eachCashierProfit.put(cashierNum,newProfit);
    }

    public static void addTotalProfit (int profit){

        try {
            lockProfit.lock();
            totalProfit+=profit;
        } finally {
            lockProfit.unlock();
        }
    }
}
