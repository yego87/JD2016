package by.it.knyazev.JD01.Less_5.M2;

/**
 * Created by Artsem Kniazeu on 15.02.2016.
 */
public class Main {
    public static void main(String... args){
        double a = 0.3, b = -21.17;
        System.out.println(ctg()+sqrt(a)-b/ars(a));
    }
    public static double ctg(){
        double m1 = Math.pow(1/(Math.tan(Math.PI/4 - 1)),2);
        return m1;
    }
    public static double sqrt(double a){
        double m2 = Math.pow(Math.sqrt(a+1.5),1/3);
        return m2;
    }
    public static double ars(double a){
        double m3 = Math.asin(Math.pow(Math.abs(a),2));
        return m3;
    }
}
