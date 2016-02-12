package by.it.dorostchenok.jd01_05.math;

import static java.lang.Math.log10;
import static java.lang.Math.abs;

public class Task6 {

    public static double[] getArray(){
        int arrLength = 25;
        double[] array = new double[arrLength];
        for (double x = 0.0, j = 0; x < 8.0; x += 0.3, j += 1){
            array[(int)j] = log10(abs(x - 12));
            if (j == arrLength - 1) break;
        }
        return array;
    }

    private double getLastTenAvg(double[] array){
        double sum = 0;

        for (int j = array.length - 1; j >= array.length - 10; j--){
            sum += array[j];
        }
        return sum / 10.0;
    }

    public void printArray(double[] array){
        double avg = getLastTenAvg(array);
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("Array average of last ten elements: " + avg);
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        for (int index = 0; index < array.length; index++){
            System.out.println(String.format("%-1s%-1s%-1s%2s%20s", "[", index, "]", "=", array[index]));
        }
    }

    public double[] getEveryThirdElement(double[] array){
        double[] a = {0.0};

        return a;
    }
}
