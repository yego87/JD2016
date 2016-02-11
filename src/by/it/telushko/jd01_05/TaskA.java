package by.it.telushko.jd01_05;
import static java.lang.Math.*;
/**
 * Created by Владимир on 12.02.2016.
 */
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
}
