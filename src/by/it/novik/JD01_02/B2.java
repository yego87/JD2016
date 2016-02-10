package by.it.novik.JD01_02;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class B2 {
    public static void main(String[] args) throws IOException {

        System.out.print("Please, type k >");
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String input = bufferedReader.readLine();

        bufferedReader.close();

        int k = Integer.valueOf(input);

        if (isSquareRootable(k)) {
            System.out.println("'K' can be square rooted");
            printMatrix(k);
        } else {
            System.out.println("'K' cannot be square rooted, bye!");
        }
    }

    public static boolean isSquareRootable(int i) {
        return isWhole(Math.sqrt(i));
    }

    public static boolean isWhole(double d) {
        return d % 1 == 0;
    }

    public static void printMatrix(int k) {
        int sqr = (int)Math.sqrt(k);
        int num = 1;

        for(int i = 0; i < sqr; i++) {
            for (int j = 0; j < sqr; j++) {
                // printing columns
                System.out.printf("%4d", num++);
            }

            // printing new line
            System.out.println("");
        }
    }
}
