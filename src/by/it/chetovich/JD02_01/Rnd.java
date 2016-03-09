package by.it.chetovich.JD02_01;

import java.util.Random;

/**
 * Created by user_2 on 09.03.2016.
 */
public class Rnd {

    static final long init = System.currentTimeMillis();
    static final Random random = new Random(init);

    static int fromTo(int from, int to){
        int delta = to - from + 1;
        return from + random.nextInt(delta);
    }
}
