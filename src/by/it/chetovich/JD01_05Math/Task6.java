package by.it.chetovich.JD01_05Math;

/**
 * Created by Yultos_ on 11.02.2016.
 */
public class Task6 {
    public void createArray (double begin, double end, int n){
        double [] array = new double[n];
        double step = (end-begin)/n;
        double j = begin;
        for (int i = 0; i<20; i++) {
            array[i] = Math.asin(j/2);
            System.out.print("array[" + i + "] = ");
            System.out.printf("%.2f",array[i]);
            System.out.println();
            j+=step;
        }
        System.out.println("Quantity of odd elements in the array is " + searchOddNumberQuantity(array));
        System.out.println("Average geometric of the array's elements is "+searchAverageGeometric(array));


    }
    private int searchOddNumberQuantity (double [] array){
        int count = 0;
        for (double v : array) {
            if (v%2==0) count++;
        }
        return count;
    }

    private double searchAverageGeometric (double [] array){
        double multiply = 1;
        for (double v : array) {
            multiply*=v;
        }
        double averageGeometric = Math.pow(multiply,1/array.length);
        return averageGeometric;
    }
}
