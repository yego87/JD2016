package by.it.zhuravlyov.JD02_01;
import by.it.zhuravlyov.JD02_01.Buyer;
import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by user_2 on 09.03.2016.
 */
public class Main {static int countBuyers=0; //общий счетчик покупателей
    public static void main(String[ ] args) throws InterruptedException {
        //создаем очередь для покупателей. Пока обычную.
        Queue<by.it.zhuravlyov.JD02_01.Buyer> queue=new ArrayDeque<>();
        while (countBuyers<5) {
            Thread.sleep(10); //ожидание в 1 секунду
            int count=by.it.zhuravlyov.JD02_01.Rnd.fromTo(0, 10); //сколько приходит покупателей: 0 1 2
            for (int i = 0; i <= count; i++) {
                countBuyers++;
                if (countBuyers<11)
                {
                    by.it.zhuravlyov.JD02_01.Buyer buyer=new by.it.zhuravlyov.JD02_01.Buyer(countBuyers);
                    queue.add(buyer);
                }

            }
        }
    }
}
