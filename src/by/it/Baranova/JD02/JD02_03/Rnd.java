package by.it.Baranova.JD02.JD02_03;

import java.util.Random;

/**
 * Created by Ekaterina on 3/9/16.
 */
public class Rnd {
    static final long init=System.currentTimeMillis();
    static final Random random=new Random(init);

    public static int fromTo(int from, int to){
        int delta=to-from+1;
        int msWait=from+random.nextInt(delta);
        return msWait;
    }
}
