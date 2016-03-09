package by.it.predkel.SimplyUsefulClasses;

import java.util.Random;

public class Rnd {
    static final long init=System.currentTimeMillis();
    static final Random random = new Random(init);

    public static int fromTo(int from, int to) {
        //вычислим время ожидания
        int delta=to-from+1;
        int msWait=from+random.nextInt(delta);
        return msWait;
    }
}
