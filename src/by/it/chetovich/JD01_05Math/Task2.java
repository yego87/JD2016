package by.it.chetovich.JD01_05Math;

/**
 * Created by user_2 on 10.02.2016.
 */
public class Task2 {
    public double searchY (double a, double b){

        return Math.pow((a+1.5),1/3) + Math.pow((a-b),8) - b/Math.asin(Math.pow(Math.abs(a),2));

    }
}
