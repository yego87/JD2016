package by.it.predkel.jd05Math;

/**
 * Составить программу вычисления функции с использованием ветвления
 */
public class Exercise5 {
    public static void exercise5(double r){
        if (r!=4.73) {
            System.out.print("Условие не выполняется");
            return;
        }
        double zrezult=0;
        for (double p=-8;p<22;p+=3.5){
            double xresult=0;
            if ((p+r)<0.5)
                xresult=Math.pow(Math.sin(p), 5);
            if ((0.5<=(p+r))&&((p+r)<3))
                xresult=Math.pow(Math.E,Math.abs(p+3));
            if ((p+r)>3)
                xresult=Math.sqrt(Math.abs(Math.pow((p+7),5)));
            zrezult+=2*xresult+(Math.pow(Math.E,r)/2);
            System.out.printf("%7.7f\t",zrezult);
        }
        System.out.println();
    }
}
