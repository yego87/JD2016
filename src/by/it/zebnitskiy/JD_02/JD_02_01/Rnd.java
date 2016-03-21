package by.it.zebnitskiy.JD_02.JD_02_01;

import java.util.Random;

/**
 * Created by Зебницкий Максим on 3/14/2016.
 */
public class Rnd {

    static final long init = System.currentTimeMillis();
    static final Random random = new Random(init);

    static int fromTo (int from, int to) {
        //вычисляем время ожидания
        int delta = to - from +1;
        int msWait = from + random.nextInt(delta);
        return msWait;
    }



}
