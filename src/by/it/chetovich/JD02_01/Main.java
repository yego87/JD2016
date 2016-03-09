package by.it.chetovich.JD02_01;

import by.it.chetovich.Matlab.UtilsMatlab;
import by.it.chetovich.Matlab.Var;
import com.sun.jmx.remote.internal.ArrayQueue;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;

/**
 * JD02_01
 */
public class Main {

    public static void main (String [] args) throws InterruptedException {

        int countByers = 0;
        Queue<Buyer> queue = new ArrayDeque<>();

        Map<String,Integer> map = Utils02_01.putGoodsFromFileIntoMap();
        Map<String,Integer> clientsBacket = null;

        while (countByers<10){
            Thread.sleep(1000);
            int goodsQuantity = Rnd.fromTo(1,5);
            
            int count = Rnd.fromTo(0,2);
            for (int i = 0; i < count; i++) {
                countByers++;
                if (countByers<11){
                    Buyer buyer = new Buyer(countByers);
                    queue.add(buyer);
                }
            }

        }


    }
}
