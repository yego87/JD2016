package by.it.daylidovich.JD01_12.A.task3;

import java.util.ArrayList;

import static by.it.daylidovich.JD01_12.A.task3.SortArray.*;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = fillArrayList(10);
        System.out.println("Массив до сортировки.");
        printList(arrayList);

        System.out.println("Массив после сортировки.");
        printList(sortList(arrayList));
    }
}
