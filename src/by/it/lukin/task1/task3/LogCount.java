package by.it.lukin.task1.task3;

/**
 * Created by алексей on 14.02.2016.
 */
public class LogCount {
    public static void main(String[] args){
        for (double a = -5; a < 13; a = a+2.5){
            double x = 3.567;
            double s = 1 / Math.tan(Math.pow(x,3)) + 2.24*a*x;
            System.out.println("При a = " + a + " , результат = " + s);
        }
    }
}
