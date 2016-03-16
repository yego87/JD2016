package by.it.knyazev.JD02.less_01.A;

import org.junit.Test;

class Main {
    static int countBuyers=0;
    @Test
    public static void main(String[] args) throws InterruptedException {
        while (countBuyers<10) {
            Thread.sleep(1000); //ожидание в 1 секунду
            int count= Rnd.fromTo(0,2); //сколько приходит покупателей: 0 1 2
            for (int i = 0; i <= count; i++) {
                countBuyers++;
                if (countBuyers<11)
                {
                    Buyer buyer=new Buyer(countBuyers);
                }
            }
        }
    }
}
