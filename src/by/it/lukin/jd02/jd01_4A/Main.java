package by.it.lukin.jd02.jd01_4A;

/**
 * Среди чисел найти число-палиндром. Если таких чисел больше одного,найти второе.
 */
public class Main {
    public static void main(String[] args) {
        int numbers[] = new int[]{12, 56, 787, 98, 123321,55};
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            int temp = 0;
            int reverse = 0;
            while (number != 0) {
                temp = number % 10;
                reverse = reverse * 10 + temp;
                number = number / 10;
            }
            if (numbers[i] == reverse) {
                System.out.println(numbers[i] + " is palindrome");
            } else {
                System.out.println(numbers[i] + " is not a palindrome");
            }
        }
    }
}
