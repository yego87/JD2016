package by.it.podelstchikova.jd01_12;

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
        Collections.sort(list,new Comp());
        return list;
    }

    public static void printList(List<Integer> list){
        for (int x: list)
            System.out.print(x + " ");
        System.out.println();
    }

}
