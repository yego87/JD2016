package by.it.zhuravlyov.JD02_01;

import java.util.Random;

/**
 * Created by user_2 on 09.03.2016.
 */
public class Rnd {
    static final long init =System.currentTimeMillis();
    static  final random = new Random(init);
    static int fromTo(int from, int to){
        //вычисляем время
        int delta=to-from+1;
        int msWait =from+random.nextInt(delta);
        return msWait;
    }
}
