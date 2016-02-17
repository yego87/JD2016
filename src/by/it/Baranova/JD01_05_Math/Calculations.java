package by.it.Baranova.JD01_05_Math;

import static java.lang.Math.*;

/**
 * Created by Ekaterina on 2/11/16.
 */
public class Calculations {


    public void Task1() {
        double x=3.24;
        double a=5.8;
        double b=pow(cos(PI/(2*a)),3);
        double z=atan(pow(x,2))-sqrt(x+pow(1.43,3))+(b/(abs(x-pow(a,0.2))));
        System.out.print("Задача №1 z");
        System.out.printf ("=%-9.4f ",z);
        System.out.println();
    }

    public void Task2(){
        double x=0.21*pow(10,2);
        double a=pow(sin(x+1),2)+x*pow((3+x*x),0.25);
        double y=a/(atan(x/2));
        System.out.print("Задача №2 y");
        System.out.printf ("=%-9.4f ",y);
        System.out.println();
    }

    public void Task3() {
        System.out.println("Задача №3");
        double x=3.567;
        double par1=tan(pow(x,3));
        for (double a=3.5;a<=25.5;a=a+3.75){
            double y=par1+2.24*a*x;
            System.out.printf("y=%-9.4f  a=%-9.2f",y,a);
            System.out.println();
        }
    }

    public void Task4() {
        double a=2.408;
        double z=0;
        for (double c=1;c<=12;c++){
            for (double b=0.2;b<=0.4;b=b+0.02){
                z=z+(c-b);
            }
        }
        z=z+1.38*a;
        System.out.print("Задача №4 z");
        System.out.printf ("=%-9.4f ",z);
        System.out.println();
    }

    public void Task5() {
        System.out.println("Задача №5");
        double r=4.73;
        for (double p=4;p<20;p=p+3.5){
            double z=0;
            if (p*p<5) {
                double x=pow(sin(p),5);
                z=x+r/2;
                System.out.printf("p=%-9.1f  z=%-9.4f ",p,z);
                System.out.println();
            }
            if (p*p>=5&&p*p<13){
                double x=pow(7,(p+3));
                z=x+r/2;
                System.out.printf("p=%-9.1f  z=%-9.4f ",p,z);
                System.out.println();
            }
            if (p*p>13){
                double x=log10(abs(pow((p+4.7),5)));
                z=x+r/2;
                System.out.printf("p=%-9.1f z=%-9.4f ",p,z);
                System.out.println();
            }
        }

    }

    public void Task6() {
        System.out.println("Задача №6");
        int n=30;
        double mas[]=new double[n];
        int k=0;
        for (double c=-1.5;c<6;c=c+0.25){
            mas[k]=7.28/(c+4);
            k++;
        }
        InOut.arrayPrint(mas,"Mas",7);

        double pr=1;
        for (int i=0;i<n;i++) {
            if (i % 2 == 0) {
                pr = pr * mas[i];
            }
        }
        System.out.printf("Произведение четных элементов =%-9.4f ",pr);
        System.out.println();

        System.out.println("Новый сформированный массив, из элементов больше 2");
        int kol=0;
        for (int i = 0; i <n ; i++) {
            if (mas[i] > 2) {
                kol++;
            }
        }
        double newmas[]=new double[kol];
        int j=0;
        for (int i = 0; i <n; i++) {
            if (mas[i]>2) {
                newmas[j] = mas[i];
                j++;
            }
        }
        InOut.arrayPrint(newmas,"new",7);
    }

    public void Task7(){
        System.out.println("Задача №7");
        //Формируем массив произвольных чисел
        double m[]=new double[24];
        for (int i = 0; i <24 ; i++) {
            double x=Math.random()*52-7;
            m[i]=((double)Math.round(x*10L))/10L;
        }
        InOut.arrayPrintTable(m,"m",12) ;

        //Формируем массив b из m
        int kol=0;
        for (int i=0;i<24;i++){
            if (m[i]>i){
               kol++;
            }
        }
        double b[]=new double[kol];
        int j=0;
        for (int i = 0; i <24 ; i++) {
            if (m[i]>i) {
                b[j]=m[i];
                j++;
            }
        }

        for (int i = 0; i<kol-1; i++) {
            for (int l = i + 1; l < kol; l++) {
                if (b[i] > b[l]) {
                    double extra = b[l];
                    b[l] = b[i];
                    b[i] = extra;
                }
            }
        }
        InOut.arrayPrintTable(b,"b",4);


    }

}




