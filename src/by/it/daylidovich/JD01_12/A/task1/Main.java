package by.it.daylidovich.JD01_12.A.task1;

import java.util.ArrayList;

import static by.it.daylidovich.JD01_12.A.task1.UtilsArrayList.*;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>[] arrayLists = setGrade(15, 10);
        System.out.println("Оценки учеников:");
        printArray(arrayLists);
        deleteFailingGrade(arrayLists);
        System.out.println("Оценки учеников без неудовлетворительных оценок:");
        printArray(arrayLists);
    }
}
