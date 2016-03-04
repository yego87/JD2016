package by.it.daylidovich.JD01_12.A.task2;

import java.util.LinkedHashSet;

import static by.it.daylidovich.JD01_12.A.task2.MyCollect.*;

public class Main {
    public static void main(String[] args){
        System.out.println("Множество А.");
        LinkedHashSet<Integer> collection_A = fillSet(20);
        printSet(collection_A);

        System.out.println("Множество B.");
        LinkedHashSet<Integer> collection_B = fillSet(50);
        printSet(collection_B);

        System.out.println("Пересечение множеств А и В.");
        printSet(getCross(collection_A, collection_B));

        System.out.println("Объединение множеств А и В.");
        printSet(getUnion(collection_A, collection_B));
    }
}
