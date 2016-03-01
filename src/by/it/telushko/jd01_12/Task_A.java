package by.it.telushko.jd01_12;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Владимир on 01.03.2016.
 */
public class Task_A {
    public static void taskA(){

        // A-1
        int studentsNumber=15;
        ArrayList<Integer> marksList = new ArrayList<Integer>();
        myCollect.randomFill(marksList, studentsNumber);
        System.out.println("Задание А-1");
        System.out.println("Исходная коллекция оценок: "+marksList);
        int i=0;
        while(i<marksList.size()){
            if (marksList.get(i)>4)i++;
            else marksList.remove(i);
        }
        System.out.println("Обработанная коллекция оценок: "+marksList);

        //A-2
        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<Integer> B = new ArrayList<Integer>();
        myCollect.randomFill(A, 5);
        myCollect.randomFill(B, 5);
        myCollect.getCross(A, B);
        myCollect.getUnion(A, B);
        System.out.println("Задание А-2\nА: "+A+"\nВ: "+B+"\nОбъединение: "+ myCollect.getUnion(A, B)+"\nПересечение: "+ myCollect.getCross(A, B));

        //А-3
        LinkedList<Integer> myList = new LinkedList<Integer>();
        myCollect.randomFill(myList,30,-10,10);
        System.out.println("Задание А-3: \n"+myList);
        myCollect.sort(myList);
        System.out.println(myList);
    }
}
