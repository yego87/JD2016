package by.it.solonovich.JD01_work;

/**
 * Created by Кирилл on 12.02.2016.
 */
public class Zadanie13 {
    public static void main(String[] args) {
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) Math.round(Math.random() * 100);
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10 / 2; i++) {
            int tmp = mas[i];
            mas[i] = mas[10 - i - 1];
            mas[10 - i - 1] = tmp;

            System.out.print(mas[i] + " ");

        }
    }
}