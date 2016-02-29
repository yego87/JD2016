package by.it.chetovich.JD01_13_B;

/**
 * Created by Yultos_ on 29.02.2016.
 */
public class CreatingArray {

    public static void createArray (int size, int quantity) throws IndexOutOfBoundsException{

        System.out.println("Start creating an array");
        int [] array = new int[size];
        for (int i = 0; i < quantity; i++) {
            array[i] = i;
        }

        try {
            DividingRandom.divide(array[array.length-1]);
        } catch (ArithmeticException e) {
            System.err.print("Divizion by zero: "+e);
        }


        System.out.println("Finish creating an array");

    }
}
