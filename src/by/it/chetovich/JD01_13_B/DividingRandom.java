package by.it.chetovich.JD01_13_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * division by zero
 */
public class DividingRandom {

    public static void divide (int n) throws IOException {


        System.out.println("Start dividing.");
        Random rand = new Random();
        try {
            int randomNumber = rand.nextInt(5);
            System.out.println("Wanna divide "+n+" by "+randomNumber);
            int result = n/randomNumber;
            System.out.println("Division result is "+result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero!");
        }
        finally {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите "+(n+1)+" чисел: ");
            for (int i = 0; i < n+1; i++) {
                String line = reader.readLine();
                try {
                    ParseToInt.parse(line);
                } catch (NumberFormatException e) {
                    System.out.println(line+" is not a number.");
                }
            }

        }
        System.out.println("Finish dividing.");
    }
}
