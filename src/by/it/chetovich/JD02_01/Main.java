package by.it.chetovich.JD02_01;

import by.it.chetovich.Matlab.UtilsMatlab;
import by.it.chetovich.Matlab.Var;
import com.sun.jmx.remote.internal.ArrayQueue;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;

/**
 * Created by user_2 on 09.03.2016.
 */
public class Main {

    public static void main (String [] args) throws InterruptedException {

        int countByers = 0;
        Queue<Buyer> queue = new ArrayDeque<Buyer>();

        Map<String,Integer> map = Utils02_01.putGoodsFromFileIntoMap();
        Map<String,Integer> clientsBacket = null;

        while (countByers<10){
            Thread.sleep(1000);
            int goodsQuantity = Rnd.fromTo(1,5);
            for (int i = 0; i < goodsQuantity; i++){
                //clientsBacket.put()
            }
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
