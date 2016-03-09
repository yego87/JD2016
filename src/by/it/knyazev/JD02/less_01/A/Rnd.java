package by.it.knyazev.JD02.less_01.A;

import java.util.Random;

/**
 * Created by Mac on 09.03.16.
 */
public class Rnd {
    static final long init=System.currentTimeMillis();
    static final Random random = new Random(init);

    static int fromTo(int from, int to) {
        //вычислим время ожидания
        int delta=to-from+1;
        int msWait=from+random.nextInt(delta);
        return msWait;
    }
}
