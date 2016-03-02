package by.it.chetovich.JD01_13_B;

import java.io.IOException;

/**
 * creates an array
 */
public class CreatingArray {

    public static void createArray (int size, int quantity) throws IndexOutOfBoundsException, IOException {

        System.out.println("Start creating an array");
        int [] array = new int[size];
        for (int i = 0; i < quantity; i++) {
            array[i] = i;
        }

        DividingRandom.divide(array[array.length - 1]);

        System.out.println("Finish creating an array");

    }
}
