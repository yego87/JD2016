package by.it.predkel.JD0201Thread;

import by.it.predkel.SimplyUsefulClasses.Rnd;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Runner {

    public static void main(String[ ] args) throws InterruptedException {

        MyQueue<Buyer> ochered=new MyQueue<>();
        ExecutorService executor= Executors.newFixedThreadPool(5);
        executor.execute(new Cashier(ochered));
        executor.execute(new Cashier(ochered));
        executor.execute(new Cashier(ochered));
        executor.execute(new Cashier(ochered));
        executor.execute(new Cashier(ochered));


            for (int i = 0; i < Dispatcher.planCount; i++) {
                Thread.sleep(1000);
                Buyer buyer=new Buyer(ochered);
            }
        executor.shutdown();
    }
}
