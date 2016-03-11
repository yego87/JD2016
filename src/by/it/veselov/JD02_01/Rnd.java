package by.it.veselov.JD02_01;
import java.util.Random;
/**
 * Created by yegorveselov on 11.03.16.
 */
public class Rnd {
    static final long init=System.currentTimeMillis();
    static final Random random = new Random(init);

    static int fromTo(int from, int to) {
        int delta = to - from + 1;
        int msWait = from + random.nextInt(delta);
        return  msWait;
    }
}
