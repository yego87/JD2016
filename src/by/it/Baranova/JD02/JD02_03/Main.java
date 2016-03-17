package by.it.Baranova.JD02.JD02_03;

import java.util.ArrayDeque;
import java.util.Calendar;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;


public class Main {
    static Integer overallTotal=0;
    static Queue<Buyer> queue=new ArrayDeque<>();
    public static void main(String[ ] args) {
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tCashier №1\t\t\tCashier №2\t\t\tCashier №3\t\t\tCashier №4\t\t\tCashier №5\t\t\tНомер очереди\t\t\tВыручка");
        long startTime=System.currentTimeMillis();
        ExecutorService executor= Executors.newFixedThreadPool(5);
        executor.execute(new Cashier(1));
        executor.execute(new Cashier(2));
        executor.execute(new Cashier(3));
        executor.execute(new Cashier(4));
        executor.execute(new Cashier(5));

        while (!Dispatcher.planComplete()) {
            Dispatcher.sleep(1000);
            boolean pensioner;
            long currentTime=System.currentTimeMillis();
            int second=(int)(currentTime-startTime)/1000;
            System.out.println("Секунда "+second);
            int count=0;
            if (second==1){
                    count = Rnd.fromTo(0, 10);System.out.println(count);}
            if (second<31&&second>1){
                    count=Rnd.fromTo(0,1);System.out.println(count);
             }
            for (int i = 0; i <= count; i++) {
                Dispatcher.countBuyers++;
                pensioner = Dispatcher.countBuyers % 4 == 0;
                Buyer buyer = new Buyer(Dispatcher.countBuyers, pensioner);
                queue.add(buyer);
                if (Dispatcher.planComplete()) {
                    break;
                }
            }
        }
    }
}
