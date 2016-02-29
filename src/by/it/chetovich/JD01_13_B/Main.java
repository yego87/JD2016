package by.it.chetovich.JD01_13_B;

import java.util.Random;

/**
 * Created by Yultos_ on 29.02.2016.
 */
public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        int size = rand.nextInt(10);
        int quantity = rand.nextInt(10);

        try {
            CreatingArray.createArray(size,quantity);
        } catch (IndexOutOfBoundsException e) {
            System.err.print("Out of bound: "+e);
        }


    }
}
