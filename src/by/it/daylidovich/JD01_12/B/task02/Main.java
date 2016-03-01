package by.it.daylidovich.JD01_12.B.task02;

import java.util.ArrayList;
import java.util.LinkedList;

import static by.it.daylidovich.JD01_12.B.task02.Process.*;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = createArray(10000);
        LinkedList<Integer> linkedList = createLinked(10000);
        Timer timer = new Timer();
        processArray(arrayList);
        System.out.println("Решение задачи с помощью ArrayList заняло " + timer);
        processLinked(linkedList);
        System.out.println("Решение задачи с помощью LinkedList заняло " + timer);
    }
}
