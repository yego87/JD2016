package by.it.podelstchikova.jd01_12;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Yultos_ on 26.02.2016.
 */
public class CreatList {

    public static ArrayList<Integer> createAList (int n){

        ArrayList <Integer> list = new ArrayList<>();

        for (int i = 1; i < n+1; i++) {
            list.add(i);
        }
        return list;
    }

    public static LinkedList<Integer> createLList (int n){

        LinkedList <Integer> list = new LinkedList<>();

        for (int i = 1; i < n+1; i++) {
            list.add(i);
        }
        return list;
    }
}
