package by.it.daylidovich.JD01_12.C.task02;

import java.util.HashSet;

import static by.it.daylidovich.JD01_12.C.task02.MyCollect.*;

public class Main {
    public static void main(String[] args){
        System.out.println("Множество А.");
        HashSet<Object> collection_A = fillIntegerSet(20);
        printSet(collection_A);

        System.out.println("Множество B.");
        HashSet<Object> collection_B = fillIntegerSet(50);
        printSet(collection_B);

        System.out.println("Пересечение множеств А и В.");
        printSet(getCross(collection_A, collection_B));

        System.out.println("Объединение множеств А и В.");
        printSet(getUnion(collection_A, collection_B));
    }
}
