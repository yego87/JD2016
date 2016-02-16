package by.it.lukin.task1.task2;

/**
 * Created by алексей on 14.02.2016.
 */
public class Main {
    public static void main(String[] args){
                double z = 0;
                double a = 0.94;
                double x = 0.9; //x <= 1 должен быть
                double arc = Math.acos(x*x);
                double aSqrtX = a*Math.sqrt(x/Math.pow(a,3));
                double sin = Math.pow(Math.sin(Math.PI/2), 3);
                double lg = Math.log10(2*x);
                z = arc - aSqrtX + sin/lg;
                System.out.println(z+"\n");

                z = Math.acos(x*x) - a*Math.sqrt(x/Math.pow(a,3)) + Math.pow(Math.sin(Math.PI/2), 3) / Math.log10(2*x);
                System.out.println("Результат функции " + arc + " - " + aSqrtX + " + " + sin + " / " + lg + " = " + z);
    }
}

