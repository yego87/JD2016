package by.it.daylidovich.JD01_05.A.task04;

public class Calculation {
    public static void Calc(double a, double b1, double b2, double db){
        for (double i=b1; i<b2+db; i+=db){
            double x =0;
            for (double j = 0; j < 13; j++) {
                x+=Math.pow((j+i),2);
            }
            System.out.printf("При b=%-5.2f  z=%-5.2f\n",i,(1.38-a+x));
        }
    }
}
