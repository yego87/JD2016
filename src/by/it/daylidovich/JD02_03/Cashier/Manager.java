package by.it.daylidovich.JD02_03.Cashier;

import by.it.daylidovich.JD02_03.Queue.QueueBuyer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class Manager extends Thread{
    private ExecutorService executorService = Executors.newFixedThreadPool(5);
    private LinkedBlockingDeque<Cashier> cashierLinkedList = new LinkedBlockingDeque<>();
    public boolean isManagerWork = true;

    //метод запускает нить "касса"
    public void openCashier(){
        Cashier cashier = new Cashier(cashierLinkedList.size()+1);
        executorService.execute(cashier);
        cashier.start();
        cashierLinkedList.addLast(cashier);
        System.out.println(cashier.getName() + " открыта.");
    }

    //метод закрывает нить "касса"
    public void closeCashier(){
        Cashier cashier = cashierLinkedList.pollLast();
        System.out.println(cashier.getName() + " закрыта.");
        cashier.iWork = false;
    }

    //метод закрывает все нити "касса"
    public void closeAllCashier(){
        executorService.shutdown();
    }

    //метод проверяет нужно ли открывать кассу
    //условием для открытия кассы является наличие в очереди более чем пять человек на кассу
    public boolean isOpenCashier(){
        int countBuyersInQueue = QueueBuyer.lengthQueue();
        int countActiveCashier = cashierLinkedList.size();
        return 4 < (countBuyersInQueue - 5 * countActiveCashier);
    }

    //метод проверяет нужно ли закрывать кассу
    public boolean isCloseCashier(){
        int countBuyersInQueue = QueueBuyer.lengthQueue();
        int countActiveCashier = cashierLinkedList.size();
        return -4 > (countBuyersInQueue - 5 * countActiveCashier);
    }

    @Override
    public void run() {
        while (isManagerWork){
            if (isOpenCashier())
                openCashier();
            if (isCloseCashier())
                closeCashier();
        }
        closeAllCashier();
    }
}
