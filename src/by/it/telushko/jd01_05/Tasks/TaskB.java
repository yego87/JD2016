package by.it.telushko.jd01_05.Tasks;
import static java.lang.Math.*;
import by.it.telushko.jd01_02.InOut;

/**
 * Created by Владимир on 13.02.2016.
 */
public class TaskB {
    public static void taskB(int c1Min, int c1Max,int c2Min,int c2Max){
        double[] functin=new double[30];
        double df=(c1Max-c1Min)/functin.length; //вычисляем шаг переменной
        int intervalArrayCounter=0;
        for (int i = 0; i <functin.length ; i++) {
            functin[i]=sqrt(df*i/3+1);
            if ((functin[i]>4)&&(functin[i]<5))intervalArrayCounter++;
           }
        InOut.printMatrixFormatted(functin,"y");
        double intervalArray[]=new double[intervalArrayCounter];
        intervalArrayCounter=0;
        int chetIndex=0;
        System.out.println("В интервал["+c2Min+","+c2Max+"] попадают следующие элементы");
        for (int i = 0; i <functin.length ; i++) {
            if((functin[i]>4)&&(functin[i]<5)){
                intervalArray[intervalArrayCounter]=functin[i];
                intervalArrayCounter++;
                if (intervalArrayCounter%2==0)chetIndex++;
            }
        }
        InOut.printMatrixFormatted(intervalArray,"int");
        System.out.println("В новом массиве "+(chetIndex+1)+" элементов с четным индексом");
    }
}
