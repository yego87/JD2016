package by.it.predkel.jd01.LevelB;

import java.io.IOException;

/**
 * Проверка на вхождение числа в заданный диапазон
 */
public class Interval {
    public static void interval() throws IOException {
        int n = System.in.read();
        int m = System.in.read();
        int k = System.in.read();
        if ((k>n)&&(k<m))
            System.out.println("Принадлежит");
        else
            System.out.println("не Принадлежит");
    }
}
