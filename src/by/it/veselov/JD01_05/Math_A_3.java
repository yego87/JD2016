package by.it.veselov.JD01_05;


public class Math_A_3 {
    public static void main(String[] args) {

        double l;
        double c;
        double x = 12.1;
        double y ;
        for (c = -10; c <=1; c = c + 0.5){
            l = Math.pow(Math.pow(Math.abs(2*x-c),3.0),1.0/5.0)+0.567;
            System.out.printf("t=%3.2f \t  l=%1.4f\n",c,l);
        }



}}
