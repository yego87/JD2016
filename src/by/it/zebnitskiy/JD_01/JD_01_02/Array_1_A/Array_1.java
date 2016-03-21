package by.it.zebnitskiy.JD_01.JD_01_02.Array_1_A;

/**
 * Created by Зебницкий Максим on 2/10/2016.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Array_1 {

    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String rLine = bufferedReader.readLine();
        String[] numbers = rLine.split(" ");

        int max = numbers[0].length();
        int maxIndex = 0;

        int min = numbers[0].length();
        int minIndex = 0;

        double average = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].length() > max) {
                max = numbers[i].length();
                maxIndex = i;
            }
            if (numbers[i].length() < min) {
                min = numbers[i].length();
                minIndex = i;
            }
            average += numbers[i].length();
        }
        average = average / numbers.length;
        System.out.println("------------------1");
        System.out.println(numbers[maxIndex] + ", " + max + ", " + maxIndex);
        System.out.println(numbers[minIndex] + ", " + min + ", " + minIndex);

        System.out.println("------------------2");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].length() < average) {
                System.out.println("< " + numbers[i] + ", " + numbers[i].length());
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].length() > average) {
                System.out.println("> " + numbers[i] + ", " + numbers[i].length());
            }

        }
    }
}