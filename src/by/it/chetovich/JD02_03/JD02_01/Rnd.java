package by.it.chetovich.JD02_03.JD02_01;

import java.util.Random;

/**
 * creates random numbers
 */
public class Rnd {

    static final long init = System.currentTimeMillis();
    static final Random random = new Random(init);

    static int fromTo(int from, int to){
        int delta = to - from + 1;
        return from + random.nextInt(delta);
    }
}
