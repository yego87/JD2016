package by.it.zebnitskiy.JD_02.JD_02_01;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by Зебницкий Максим on 3/14/2016.
 */
public class Runner {
    static int countBuyers = 0; //общий счетчик покупателя
    public static void main(String[] args) throws InterruptedException {
        //создаем очередь для покупателей
        Queue<Buyer> queue = new ArrayDeque<>();
        while (countBuyers < 10){
            Thread.sleep(1000);  //ожидание в 1 секунду
            int count = Rnd.fromTo(0,2);  //сколько приходит покупателей: 0 1 2
            for (int i = 0; i <= count; i++){
                countBuyers ++;
                if(countBuyers < 11){
                    Buyer buyer = new Buyer (countBuyers);
                    queue.add(buyer);
                }
            }
        }

    }

}
