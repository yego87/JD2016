package by.it.chetovich.JD01_12;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Creates random set
 */
public class CreatingRandomSet {

    public static Set<Integer> createRandomSet (){

        Set<Integer> set = new HashSet<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            set.add(rand.nextInt(10));
        }
        return set;
    }
}
