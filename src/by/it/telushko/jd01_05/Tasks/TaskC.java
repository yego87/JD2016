package by.it.telushko.jd01_05.Tasks;
import by.it.telushko.jd01_02.InOut;

import static java.lang.Math.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by Владимир on 14.02.2016.
 */
public class TaskC {
    public static void taskC(int cosArrayLength) {
        double xMin = 0;
        double xMax = 360;
        double x = 0; //аргумент
        double dX = (xMax - xMin) / cosArrayLength + 1; //вычисляем шаг аргумента
        double[] cosArray = new double[cosArrayLength]; //создаем массив значений функции
        int bLength = 0;
        for (int i = 0; i < cosArrayLength; i++) { //заполняем массив для округления используем BigDemical
            cosArray[i] = 4 * cos(toRadians(x));
            cosArray[i] = new BigDecimal(cosArray[i]).setScale(1, RoundingMode.HALF_UP).doubleValue();
          //  System.out.println(cosArray[i] + " " + x + " " + i);
            x += dX;
            //в этом же цикле подсчитаем число элементов для массива В, удовлетворяющих условию:
            //в массив входят все элементы массива cosArray кроме тех, чей модуль больше индекса
            if (abs(cosArray[i]) > i) bLength++;
        }
        double[] b = new double[bLength];
        //заполняем массив В
        bLength = 0; //будем эту переменную теперь использовать как счетчик дял заполнения масива В
        for (int i = 0; i < cosArrayLength; i++) {
            if (abs(cosArray[i]) > i) {
                b[bLength] = cosArray[i];
                bLength++;
            }
        }
        //сортируем массив В методом пузырька
        for (int i = 0; i < b.length - 1; i++)
            for (int j = 0; j < b.length - i - 1; j++)
                if (b[j] < b[j + 1]) {
                    double temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                }
        //вывод массива косинусов
        InOut.printArrayPseudo(cosArray,"cos",5);
        InOut.printArrayPseudo(b,"b",5);
    }
}
