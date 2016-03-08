package by.it.Baranova.JD01_13_Exception.B;

/**
 * Created by Ekaterina on 3/3/16.
 */
public class FindingSqrt {

    public static void findingSqrt (Integer [] numbers) throws NegativeNumberException {
        int s=0;
        System.out.println("Начало: находим сумму элементов массива, а также корень квадратный этой суммы");
        for (int i=0;i<numbers.length;i++){
            s=s+numbers[i];
        }
        try {
            if (s<0){throw new NegativeNumberException();}
            int sqrt=(int) Math.sqrt(s);
            Divide.divide(s,sqrt);
            System.out.println("Сумма="+s);
            System.out.println("Корень квадратный суммы="+sqrt);
        }
        catch (NegativeNumberException e) {
            throw e;
        }
        System.out.println("Конец: передача переменных для вычисления деления");
    }
}
