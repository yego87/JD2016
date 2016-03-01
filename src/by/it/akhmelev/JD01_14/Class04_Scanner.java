package by.it.akhmelev.JD01_14;

import java.util.Locale;
import java.util.Scanner;

public class Class04_Scanner {
    public static void main(String[ ] args) {
        double sum = 0.0;
        Scanner scan = new Scanner("1,3;2,0; 8,5; 4,8;9,0; 1; 10;");
        scan.useLocale(Locale.FRANCE);  //числа через запятую
        // scan.useLocale(Locale.US);
        scan.useDelimiter(";\\s*");     //разделитель точка с запятой
                                        // и возможно пробел(ы)
        while (scan.hasNext()) {        //пока есть следующие пробелы
            if (scan.hasNextDouble()) {
                sum += scan.nextDouble();
            } else {
                System.out.println(scan.next());
            }
        }
        scan.close();
        System.out.printf("Сумма чисел = " + sum);
    }
}
