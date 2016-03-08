package by.it.Baranova.JD01_13_Exception.B;


import java.io.IOException;

/**
 * Created by Ekaterina on 3/2/16.
 */
public class Main {
    public static void main(String[] args) throws IOException, NegativeNumberException, NegativeArraySizeException {
        int n = 4;

        try {
            FillingArray.fillingArray(n);
        } catch (NegativeArraySizeException e) {
            System.err.println("Ошибка: введен отрицательный размер массива");

        } catch (NegativeNumberException e) {
            System.err.println("Ошибка: сумма чисел-отрицательное число");
        }
    }
}