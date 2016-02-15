package by.it.lukin.task1;

/**
 * Записать на языке арифметическое выражение. Запись осуществить двумя способами.
 */
public class Main {
    public static void main(String[] args){
        double z = 0;
        double a = 0.94;
        double x = 10.093; //x <= 1 должен быть
        double arc = Math.acos(x*x);
        double aSqrtX = a*Math.sqrt(x);
        double sin = Math.pow(Math.sin((Math.PI/2)+a), 3);
        double lg = Math.log10(2*x);
        z = arc - aSqrtX + sin/lg;
        System.out.println(arc + " - " + aSqrtX + " + " + sin + " / " +lg);
        System.out.println(z);

        z = Math.acos(x*x) - a*Math.sqrt(x) + Math.pow(Math.sin(Math.PI/2+a),3)/Math.log10(2*x);
        System.out.println(z);
    }
}
