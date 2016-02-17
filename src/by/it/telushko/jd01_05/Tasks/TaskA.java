package by.it.telushko.jd01_05.Tasks;
import static java.lang.Math.*;

public class TaskA {
    public static void taskA1(double x){
        System.out.println("Вычисление с разбиением на части:");
        double delimoeS1,delimoeS2,delimoe,delitel,S1,S2;
        delimoeS1= PI/8-1;delimoeS1=pow(delimoeS1,2);  //первое слагаемое делимого
        delimoeS1=sin(delimoeS1);delimoeS2=pow(x,2);
        delimoeS2=delimoeS2+3;                         //второе слагаемое делимого
        delimoeS2=pow(delimoeS2,1/4);
        delimoe=delimoeS1+delimoeS2;                   //делимое
        delitel=x/2;                                   //делитель
        delitel=toRadians(delitel);                    //градусы в радианы для арксинуса
        delitel=asin(delitel);
        delitel=delitel-5.236E-2;
        S1=delimoe/delitel;                            //значени дроби (первое слагаемое в выражении)
        S2=3.12-x;S2=abs(S2);S2=log(S2);               //второе слагаемое в выражении
        double y=S1+S2;
        System.out.println("x="+x+" y="+y+"\nВычисление полным выражением:");
        y=((sin(pow(PI/8-1,2)))+pow(3+pow(x,2),1/4))/
          (asin(toRadians(x/2))-5.236E-2)+log(abs(3.12-x));
        System.out.println("x="+x+" y="+y);
    }

    public static void taskA2(double a, double b){
    double y=tan(pow(a+b,2))-pow(a+1.5,1/3)+a*pow(b,5)-b/(log(pow(a,2)));
    System.out.println("y="+y);
    }

    public static void taskA3(double x,double dC,double start,double finish){
        double function;
        System.out.printf("%6s%10s","Счетчик","Ответ\n");
        for (double c = start; c <=finish ; c+=dC) {
            function=pow(abs(2*x-c),(double)3/5)+0.567;
            System.out.printf("% 6.2f% 10.3f",c,function);
            System.out.println("");
        }
    }
    public static void taskA4(double tMin,double tMax,double dT){
        int aMin=12; int aMax=43;
        double function=0;
        System.out.printf("%6s%25s","Счетчик","Ответ\n");
        for (double t = tMin; t <=tMax ; t+=dT) {
            for (int a = aMin; a <=aMax ; a++) function=function+pow(t,a-3);
            System.out.printf("% 7.1f% 25.3f",t,function);
            System.out.println("");
        }
    }
    public  static void taskA5(double r,double pMin, double pMax, int dP){
        System.out.printf("%4s%8s%10s","Счетчик","  Условие","Oтвет\n");
        for (int p = -6; p <25 ; p+=4) {
            double z;
            boolean sqrtFlag = false;
            if (p + r < 0.5) {
                z = pow(sin(r), 5) + pow(E, r) / 2;
                System.out.printf("% 4d% 12.4f% 12.4f",p,p+r,z);
                System.out.println("");
            }
            if ((p + r >= 0.5) && (p + r) < 3) {
                z = pow(E, r) / 2;
                System.out.printf("% 4d% 12.4f% 12.4f",p,p+r,z);
                System.out.println("");
            }
            if (p + r > 3){
                if (r -8 > 0) {
                    z = sqrt(r -8) + pow(E, r) / 2;
                    System.out.printf("% 4d% 12.4f% 12.4f",p,p+r,z);
                    System.out.println("");
                }
                else {
                    System.out.printf("% 4d% 12.4f%10s",p,p+r," отрицательное число под квадратным корнем");
                    System.out.println("");
                    sqrtFlag = true;
                }
            }
        }
    }
}
