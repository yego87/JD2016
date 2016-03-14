package by.it.predkel.JD0201Thread;

import java.util.ArrayDeque;

/**
 * Created by user_2 on 11.03.2016.
 */
public class MyQueue<T extends Object> extends ArrayDeque<T> {
    public ArrayDeque<T> ochered=new ArrayDeque<>();
    private final static Integer fakeBalance=0;

    @Override
    public void addFirst(T cl){
        synchronized(fakeBalance) {
            ochered.addFirst(cl);
        }
    }
    @Override
    public void addLast(T cl){
        synchronized(fakeBalance) {
            ochered.addLast(cl);
        }
    }
    @Override
    public T pollFirst(){
        synchronized(fakeBalance) {
            return ochered.pollFirst();
        }
    }

    public boolean checkQueue() {
        return (!this.ochered.isEmpty());
    }

    public ArrayDeque<T> getMyQueue(){
        return ochered;
    }
}
