package by.it.chetovich.JD01_05Math;

/**
 * Created by Yultos_ on 10.02.2016.
 */
public class Task4 {
    public double searchD (){
        double d = 1;
        for (double a = 5; a <=12 ; a+=3.75) {
            for (int t = 1; t < 4; t++) {
                d*=Math.sin(a-t);
            }

        }
        return d;
    }
}
