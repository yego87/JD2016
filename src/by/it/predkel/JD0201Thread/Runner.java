package by.it.predkel.JD0201Thread;

import by.it.predkel.SimplyUsefulClasses.Rnd;
import java.util.ArrayDeque;
import java.util.Queue;

class Runner {
    static int countBuyers=0; //общий счетчик покупателей

    public static void main(String[ ] args) throws InterruptedException {
       /* MyQueue<Buyer> ochered=new MyQueue<Buyer>();
        Buyer buyer1=new Buyer(1,ochered);
        Buyer buyer2=new Buyer(2,ochered);
        Buyer buyer3=new Buyer(3,ochered);
        System.out.println(ochered);
*/
        MyQueue<Buyer> ochered=new MyQueue<Buyer>();
        Queue<Buyer> qBuy=new ArrayDeque<>();
        Queue<Cashier> qCash=new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            Cashier cashier=new Cashier(i+1,ochered);
            qCash.add(cashier);
        }

        while (countBuyers<10) {
            Thread.sleep(1000); //ожидание в 1 секунду
            int count= Rnd.fromTo(0, 2); //сколько приходит покупателей: 0 1 2
            for (int i = 0; i <= count; i++) {
                countBuyers++;
                if (countBuyers<11)
                {
                    Buyer buyer=new Buyer(countBuyers,ochered);
                    qBuy.add(buyer);
                }
            }
        }
    }
}
