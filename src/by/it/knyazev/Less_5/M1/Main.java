package by.it.knyazev.Less_5.M1;

/**
 * Created by Artsem Kniazeu on 15.02.2016.
 */
public class Main {
    public static void main(String... args){
        //
        //
        //       sin^2(P\2 + 1) + x./(3+x^2)  - tg^3(x^3-1)
        // y = --------------------------------------------
        //                 arctg(x\2) - ln17,56

        double f = 234.1;
        System.out.print((sin2()+sqrt(f)+tg(f))/(arc(f)-ln()));

    }
    public  static double sin2(){
        double m1 = Math.sin(Math.toDegrees(Math.PI/2+1));
        return Math.pow(m1,2);
    }
    public static double sqrt(double x){
        double m2 = x*Math.sqrt(3+Math.pow(x,2));
        return m2;
    }
    public static double tg(double x){
        double m3 = Math.pow(Math.tan(Math.pow(x,3)-1),3);
        return m3;
    }
    public static double arc(double x){
        double m4 = Math.atan(x/2);
        return m4;
    }
    public static double ln(){
        double m5 = Math.log10(17.56);
        return m5;
    }
}
