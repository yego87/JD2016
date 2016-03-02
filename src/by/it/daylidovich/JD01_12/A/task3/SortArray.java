package by.it.daylidovich.JD01_12.A.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArray{
    public static ArrayList<Integer> fillArrayList(int count){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add((int)(Math.random()*20-10));
        }
        return list;
    }

    public static List sortList(List<Integer> list){
        /*for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) < 0 && list.get(j+1) >= 0){
                    list.set(j, (list.get(j) + list.get(j+1)));
                    list.set((j+1), (list.get(j) - list.get(j+1)));
                    list.set(j, (list.get(j) - list.get(j+1)));
                }
            }
        }*/
        Collections.sort(list,new Comp());
        return list;
    }

    public static void printList(List<Integer> list){
        for (int x: list)
            System.out.print(x + " ");
        System.out.println();
    }

}
