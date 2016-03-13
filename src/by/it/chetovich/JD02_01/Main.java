package by.it.chetovich.JD02_01;


import java.util.ArrayDeque;
import java.util.Calendar;
import java.util.Queue;

/**
 * JD02_01
 */
public class Main {

    public static void main (String [] args) throws InterruptedException {

        int countByers = 0;
        Queue<Buyer> queue = new ArrayDeque<>();

        for (int i = 1; i < 6; i++) {
            new Thread(new Cashier(i)).start();
        }

        while (countByers<10){
            Calendar c = Calendar.getInstance();
            int currentSecond = c.get(Calendar.SECOND);

            if (currentSecond>30) Thread.sleep(1000);
            else Thread.sleep(3000);
            //(currentSecond>30)?Thread.sleep(1000):Thread.sleep(3000);

            int count = Rnd.fromTo(0,2);
            for (int i = 0; i < count; i++) {
                countByers++;
                if (countByers<11){
                    if (countByers%4==0) {
                        Buyer buyer = new Buyer(countByers, true);
                        queue.add(buyer);
                    }
                    else {
                        Buyer buyer = new Buyer(countByers, false);
                        queue.add(buyer);
                    }

                }
            }

        }








    }
}
