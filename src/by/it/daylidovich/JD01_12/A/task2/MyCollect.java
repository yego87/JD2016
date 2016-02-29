package by.it.daylidovich.JD01_12.A.task2;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class MyCollect {
    public static LinkedHashSet fillSet(int n){
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        while (n > set.size())
            set.add((int)(Math.random()*100));
        return set;
    }

    public static LinkedHashSet getCross(LinkedHashSet collection_A, LinkedHashSet collection_B){
        LinkedHashSet<Integer> collectionOut = new LinkedHashSet<>();
        Iterator<Integer> iterator = collection_A.iterator();
        while (iterator.hasNext()){
            int x = iterator.next();
            if (collection_B.contains(x))
                collectionOut.add(x);
        }
        return collectionOut;
    }

    public static LinkedHashSet getUnion(LinkedHashSet collection_A, LinkedHashSet collection_B){
        LinkedHashSet<Integer> collectionOut = new LinkedHashSet<>();
        Iterator<Integer> iterator = collection_A.iterator();
        while (iterator.hasNext()){
            collectionOut.add(iterator.next());
        }
        iterator = collection_B.iterator();
        while (iterator.hasNext())
            collectionOut.add(iterator.next());
        return collectionOut;
    }

    public static void printSet(LinkedHashSet<Integer> collection){
        for (int x: collection)
            System.out.print(x + " ");
        System.out.println();
    }
}
