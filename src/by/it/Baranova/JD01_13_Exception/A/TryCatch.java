package by.it.Baranova.JD01_13_Exception.A;

import java.util.List;

/**
 * Created by Ekaterina on 2/29/16.
 */
public class TryCatch {
    //метод со встроенным обработчиком исключения

    public static List<Double> parseFromConsole(String str, List<Double> numbers) throws NegativeNumberException {

        double S = 0;
        try {
            Double number = Double.parseDouble(str);
            System.out.println(number);
            numbers.add(number);
            if (number<0) {
                throw new NegativeNumberException("Введено отрицательное число");
            }
            for (Double s : numbers) {
                S = S + Math.sqrt(s);
            }
            System.out.println("Сумма корней всeх чисел = " + S);
        } catch (NumberFormatException e) {
            System.out.println("--Возникла ошибка парсера чисел для строки: " + str);
        } catch (NegativeNumberException e){
            System.out.println("Введено отрицательное числ");
        }
        return numbers;
    }
}

