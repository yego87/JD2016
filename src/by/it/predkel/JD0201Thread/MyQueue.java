package by.it.predkel.JD0201Thread;

import java.util.PriorityQueue;

/**
 * Created by user_2 on 11.03.2016.
 */
public class MyQueue extends PriorityQueue {
    public static PriorityQueue<Buyer> ochered=new PriorityQueue<>();
    private final static Integer fakeBalance=0;

   /* @Override
    public synchronized Buyer element(){
        return (Buyer)super.element();
    }*/
    @Override
    public  Buyer remove(){
        synchronized(fakeBalance) {
            return ochered.remove();
        }
    }

    public void addBuyer(Buyer cl){
        synchronized(fakeBalance) {
            ochered.add(cl);
        }
    }
    public boolean checkQueue() {
        return (!this.isEmpty());
    }

    public MyQueue getMyQueue(){
        return this;
    }
}
