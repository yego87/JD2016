package by.it.telushko.jd01_13;

import java.util.Scanner;

public class Task_A {
    public static void taskA() throws MinusSqrtException {
        Scanner inLine = new Scanner(System.in);
        String s;
        double sum=0;
        Integer i=0;
        //получаем строку из консоли, до тех пор, пока она не окажется END.
        //затем преобразуем ее в целое число. Если введено не число, сработает исключение.
        while ( !(s = inLine.nextLine()).equals ("END")) {
            try {
                i = Integer.valueOf(s);
                System.out.println(i);
            }
            catch (NumberFormatException e) {System.err.println("Ошибка ввода!");}
        //метод CountSqrt может создать собственное исключение для корня из отрицательного числа
            try{sum+=Operation.countSqrt(i);
                System.out.println(sum);
            }
            catch (MinusSqrtException e) {System.err.println("Под корнем отрицательное число!");}
        }

        inLine.close();
        System.out.println("Окончание работы");

    }
}
