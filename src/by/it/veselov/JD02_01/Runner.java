package by.it.veselov.JD02_01;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by yegorveselov on 11.03.16.
 */
public class Runner {
    static int countBuyers = 0;

    public static void main(String[] args) throws InterruptedException {
        Queue<Buyer> queue = new ArrayDeque<>();
        while (countBuyers < 10) {
            Thread.sleep(1000);
            int count = Rnd.fromTo(0, 2);
            for (int i = 0; i <= count; i++) {
                countBuyers++;
                if (countBuyers < 11) {
                    Buyer buyer = new Buyer(countBuyers);
                    queue.add(buyer);
                }
            }

        }
        for (int i = 0; i <= 4; i++) {
            Cashier cashier = new Cashier(i+1);
        }

    }
}
