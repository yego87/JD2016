package by.it.novik.JD01_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4 {
    public static void main(String[] args) throws IOException {
        String[] months = {
            "Нулябрь",
            "Январь",
            "Февраль",
            "Март",
            "Апрель",
            "Май",
            "Июнь",
            "Июль",
            "Август",
            "Сентябрь",
            "Октябрь",
            "Ноябрь",
            "Декабрь",
            "Многябрь",
            "Отрицябрь",
            "Дробябрь"
        };
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.print("Please, print month number >");
        double input = Double.valueOf(bufferedReader.readLine());

        bufferedReader.close();

        if(isWhole(input)) {
            if (input >= 0 && input <= 12) {
                System.out.println("your month is " + months[(int)input]);
            } else if (input < 0) {
                System.out.println("your month is " + months[14]);
            } else {
                System.out.println("your month is " + months[13]);
            }
        } else {
            System.out.println("your month is " + months[15]);
        }
    }

    public static boolean isWhole(double d) {
        return d % 1 == 0;
    }
}
