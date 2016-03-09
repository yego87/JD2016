package by.it.Baranova.JD01_13_Exception.B;

/**
 * Created by Ekaterina on 3/3/16.
 */
public class Divide {
    public static void divide (int s, int sqrt){
        System.out.println("Начало: находим частное от деления суммы корня квадратного суммы на сумму элементов массива");
        int summ=s;
        int summSqrt=sqrt;
        double div;


        try {
         div=summSqrt/summ;
            System.out.println("Результат деления="+div);

        } catch (ArithmeticException e){
            System.err.print("Недопустимая операция - деление на 0");
        }
    }
}
