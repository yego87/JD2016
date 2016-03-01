package by.it.daylidovich.JD01_12.C.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MyCollect{
    public static HashSet fillIntegerSet(int n){
        HashSet<Object> set = new LinkedHashSet<>();
        while (n > set.size())
            set.add((int)(Math.random()*100));
        return set;
    }

    public static HashSet getCross(HashSet collection_A, HashSet collection_B){
        HashSet<Object> collectionOut = new HashSet<>();
        Iterator<Object> iterator = collection_A.iterator();
        while (iterator.hasNext()){
            Object x = iterator.next();
            if (collection_B.contains(x))
                collectionOut.add(x);
        }
        return collectionOut;
    }

    public static HashSet getUnion(HashSet collection_A, HashSet collection_B){
        HashSet<Object> collectionOut = new HashSet<>();
        Iterator<Object> iterator = collection_A.iterator();
        while (iterator.hasNext()){
            collectionOut.add(iterator.next());
        }
        iterator = collection_B.iterator();
        while (iterator.hasNext())
            collectionOut.add(iterator.next());
        return collectionOut;
    }

    public static void printSet(HashSet<Object> collection){
        for (Object x: collection)
            System.out.print(x + " ");
        System.out.println();
    }
}
