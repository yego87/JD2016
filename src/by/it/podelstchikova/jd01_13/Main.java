package by.it.podelstchikova.jd01_13;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> listString = StringInList.eStrings();
        List<Integer> listInt = new ArrayList<>();

        double sum = 0;
        for (String s : listString) {
            try {
                int num = StringToInt.parseToInt(s);
                System.out.print(num + " ");
                double root = SqrtToInt.calculationSqrt(num);
                sum += root;
                System.out.println(", sqrt sum: " + sum);

            } catch (NumberFormatException e) {
                System.out.println(s + " is impossible to parse.");
            }
        }
    }
}
