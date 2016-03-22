package by.it.podelstchikova.jd01_12;


import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import static by.it.podelstchikova.jd01_12.SortArray.*;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayLists.CreateList();

        Set<Integer> setA,setB,union,cross;
        Sets sets = new Sets();
        setA=Sets.CreateSet();
        setB=Sets.CreateSet();
        cross=sets.getCross(setA,setB);
        union=sets.getUnion(setA,setB);
        System.out.println("пересечение"+cross);
        System.out.println("объединение"+union);
        ArrayList<Integer> arrayList = fillArrayList(10);

        System.out.println("Массив до сортировки.");
        printList(arrayList);
        System.out.println("Массив после сортировки.");
        printList(sortList(arrayList));

        String text = "A psychologist was walking around the lecture hall, while teaching stress management to an audience of eager students. As she raised a glass of water, everyone expected they’d be asked the “half empty or half full” question. Instead, with a smile on her face she inquired, “How heavy is this glass of water?” The answers rang out ranging from 8 oz to 20 oz."+

                "She replied, “The actual weight doesn’t matter. It all depends on how long I hold it. If I hold it for a minute, its not a problem. If I hold it for an hour, I’ll have an ache in my arm. If I hold it for a day, my arm will feel numb and paralyzed. In each case, the weight of the glass doesn’t change, but the longer I hold it, the heavier it becomes.”";

        PrintMap pMap = new PrintMap();
        PrintMap.printMap(pMap.countWords(text));

        ArrayList<Integer> peopleInArrayCircle = CreatList.createAList(10000);
        LinkedList<Integer> peopleInLinkedCircle = CreatList.createLList(10000);

        System.out.println("Delete using indexes:");
        long arrayProcess = Process.processA(peopleInArrayCircle);
        long linkedProcess = Process.processL(peopleInLinkedCircle);
        System.out.println("Deleting time for ArrayList: "+arrayProcess+", same operation for LinkedList: "+linkedProcess);

        System.out.println("Delete using Iterator:");
        long arrayProcessI = Process.processArrayIterator(peopleInArrayCircle);
        long linkedProcessI = Process.processLinkedIterator(peopleInLinkedCircle);
        System.out.println("Deleting time for ArrayList: "+arrayProcessI+", same operation for LinkedList: "+linkedProcessI);



        String s = " дом машина яблоко компьютер ручка молоко бумага шкаф телефон ручка карта молоко гвоздь";
        Map<String,String> map = CreatMap.createMap(s);
        System.out.println(map);
        Map<String,String> mapSharpened = CreatMap.sharMap(map);
        System.out.println(mapSharpened);

    }
}
