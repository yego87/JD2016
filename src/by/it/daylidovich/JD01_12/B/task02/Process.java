package by.it.daylidovich.JD01_12.B.task02;

import java.util.ArrayList;
import java.util.LinkedList;

public class Process {
    public static ArrayList<Integer> createArray(int count){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(i+1);
        }
        return list;
    }

    public static LinkedList<Integer> createLinked(int count){
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            list.add(i+1);
        }
        return list;
    }
    
    public static void processArray(ArrayList<Integer> list){
        Timer timer = new Timer();
        int n = 1;
        while (1 < list.size()){
            if (n  < list.size()){
                list.remove(n);
                n++;
            }
            else
                n = n - list.size();
        }
        System.out.println("Остался №" + list.get(0));
        System.out.println("Решение задачи с помощью ArrayList заняло " + timer);
    }

    public static void processLinked(LinkedList<Integer> list){
        Timer timer = new Timer();
        int n = 1;
        while (1 < list.size()){
            if (n < list.size()){
                list.remove(n);
                n++;
            }
            else
                n = n - list.size();
        }
        System.out.println("Остался №" + list.get(0));
        System.out.println("Решение задачи с помощью LinkedList заняло " + timer);
    }
}
