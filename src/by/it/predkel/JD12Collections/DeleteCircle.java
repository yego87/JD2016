package by.it.predkel.JD12Collections;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Admin on 28.02.2016.
 */
public class DeleteCircle {
    public static void delCircleArr() {
        int n=10000;
        ArrayList<Integer> circle=new ArrayList<>();
        System.out.println("ArrayList");
        for (int i=0;i<n;i++){
            circle.add(i);
        }
        //System.out.println(circle);
        for (int i=1;i<circle.size();i++){
            circle.remove(i);
        }
       // System.out.println(circle);
    }
    public static void delCircleLink() {
        int n=10000;
        LinkedList<Integer> circle=new LinkedList<>();
        System.out.println("LinkedList");
        for (int i=0;i<n;i++){
            circle.add(i);
        }
       // System.out.println(circle);
        for (int i=1;i<circle.size();i++){
            circle.remove(i);
        }
      //  System.out.println(circle);
    }
    public static void runDelete(){

        long timeout= System.currentTimeMillis();
        DeleteCircle.delCircleArr();
        Double time =(double) System.currentTimeMillis() - timeout;
        System.out.println("Прошло "+time.toString()+" милисекунд.");;

        long timeout1= System.currentTimeMillis();
        DeleteCircle.delCircleLink();
        Double time1 =(double) System.currentTimeMillis() - timeout1;
        System.out.println("Прошло "+time1.toString()+" милисекунд.");

        System.out.print("Разница во времени: "+(time-time1));
    }
}
