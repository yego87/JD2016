package by.it.predkel.JD0201Thread;

import by.it.predkel.SimplyUsefulClasses.Rnd;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by user_2 on 11.03.2016.
 */
public class Cashier extends Thread {
    int num; //номер кассира

    public Cashier(int num) {
        this.num = num;
        this.setName("Покупатель № "+ num+" ");
        start();
    }

    public boolean checkQueue(Queue myQ) throws InterruptedException {
        return (!myQ.isEmpty());
    }
/*
    public void getBuyerFromQueue(){
        while(!checkQueue()){

        }
    }*/
}
