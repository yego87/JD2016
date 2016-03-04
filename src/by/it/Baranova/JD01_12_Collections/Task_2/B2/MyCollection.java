package by.it.Baranova.JD01_12_Collections.Task_2.B2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Ekaterina on 2/27/16.
 */
public class MyCollection {


    /** Метод, моделирующий процесс вычеркивания каждого второго человека с использованием ArrayList
     * @Target(ElementType.METHOD)
     * @Retention(RetentionPolicy.RUNTIME)
     * @param n - количество человек, участвующих в игре
     */
    public static void processArray (int n){
        ArrayList<Integer> people=new ArrayList<>(n);
        for (int i=0;i<n;i++){
            people.add(i+1);
        }
        int check2=0;//Проверяет позицию, на которой закончился ArrayList
        int kol=n;
        while (kol!=1) {
            int check=0;
            Iterator <Integer> iter=people.iterator();
            while (iter.hasNext()&&check==0) {
                if (check2==1){iter.next();iter.remove();kol--;}
                iter.next();
                if (iter.hasNext()) {
                    Integer element = iter.next();
                    iter.remove();
                    kol--;
                    check2=0;
                }
                else {check=1;check2=1;}
            }
        }

        System.out.print("Остался человек под номером "+people);
    }

    /** Метод, моделирующий процесс вычеркивания каждого второго человека с использованием LinkedList
     * @Target(ElementType.METHOD)
     * @Retention(RetentionPolicy.RUNTIME)
     * @param n - количество человек, участвующих в игре
     */
    public static void processLinked (int n){
        LinkedList<Integer> people=new LinkedList<>();
        for (int i=0;i<n;i++){
            people.add(i+1);
        }
        int check2=0;//Проверяет позицию, на которой закончился ArrayList
        int kol=n;
        while (kol!=1) {
            int check=0;
            Iterator <Integer> iter=people.iterator();
            while (iter.hasNext()&&check==0) {
                if (check2==1){iter.next();iter.remove();kol--;}
                iter.next();
                if (iter.hasNext()) {
                    Integer element = iter.next();
                    iter.remove();
                    kol--;
                    check2=0;
                }
                else {check=1;check2=1;}
            }
        }

        System.out.print("Остался человек под номером "+people);
    }

}
