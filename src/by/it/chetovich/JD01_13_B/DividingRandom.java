package by.it.chetovich.JD01_13_B;

import java.util.Random;

/**
 * Created by Yultos_ on 29.02.2016.
 */
public class DividingRandom {

    public static void divide (int n){


        System.out.println("Start dividing.");
        Random rand = new Random();
        int result = n/rand.nextInt(5);
        System.out.println("Division result is "+result);
        System.out.println("Finish dividing.");
    }
}
