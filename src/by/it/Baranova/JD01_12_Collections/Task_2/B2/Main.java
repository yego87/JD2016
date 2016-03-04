package by.it.Baranova.JD01_12_Collections.Task_2.B2;

import java.io.IOException;

/**
 * Created by Ekaterina on 3/2/16.
 */
public class Main {
    private static void prn(Object o){System.out.println(o.toString());}
    public static void main(String[] args) throws IOException {
        Timer t=new Timer();

        //Удаление второго человека
        MyCollection.processArray(10000);
        prn("\nМоделирование процесса удаления второго человека в arrayList. "+t);
        MyCollection.processLinked(10000);
        prn("\nМоделирование процесса удаления второго человека в linkedList. "+t);


    }
    public static class Timer {
        private  long iniTime;
        private  Double Delta;
        public Timer(){
            iniTime=System.nanoTime();
        }
        public  String toString(){
            Delta=(double)(System.nanoTime()-iniTime)/1000;
            iniTime=System.nanoTime();
            return "Прошло "+Delta.toString()+" микросекунд.";
        }

    }
}
