package by.it.chetovich.JD01_12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Yultos_ on 26.02.2016.
 */
public class CreatingList {

    public static ArrayList<Integer> createArrayList ( int n){

        ArrayList <Integer> list = new ArrayList<>();

        for (int i = 1; i < n+1; i++) {
            list.add(i);
        }
        return list;
    }

    public static LinkedList<Integer> createLinkedList ( int n){

        LinkedList <Integer> list = new LinkedList<>();

        for (int i = 1; i < n+1; i++) {
            list.add(i);
        }
        return list;
    }
}
