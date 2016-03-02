package by.it.daylidovich.JD01_12.A.task1;

import java.util.ArrayList;

public class UtilsArrayList {
    public static ArrayList[] setGrade(int countStudents, int countLessons) {
        ArrayList<Integer>[] arrayLists = new ArrayList[countStudents];
        for (int i = 0; i < countStudents; i++) {
            arrayLists[i] = new ArrayList<>();
            for (int j = 0; j < countLessons; j++) {
                arrayLists[i].add((int) (Math.random() * 10));
            }
        }
        return arrayLists;
    }

    public static ArrayList[] deleteFailingGrade(ArrayList[] arrayLists){
        for (int i = 0; i < arrayLists.length; i++) {
            int j = 0;
            while (j != arrayLists[i].size()){
                if (4 > (int)arrayLists[i].get(j))
                    arrayLists[i].remove(j);
                else
                    j++;
            }
        }
        return arrayLists;
    }

    public static void printArray(ArrayList[] arrayLists){
        String string = new String();
        for (int i = 0; i < arrayLists.length; i++) {
            for (int j = 0; j < arrayLists[i].size(); j++) {
                string += arrayLists[i].get(j) + " ";
            }
            string += "\n";
        }
        System.out.print(string);
    }
}
