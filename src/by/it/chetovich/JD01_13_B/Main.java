package by.it.chetovich.JD01_13_B;

import java.io.IOException;
import java.util.Random;

/**
 * JD01_13B
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Random rand = new Random();
        int size = rand.nextInt(10);
        int quantity = rand.nextInt(5);
        System.out.println("size "+size+" quantity "+quantity);

        try {
            CreatingArray.createArray(size,quantity);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of bound: "+e);
        }


    }
}
