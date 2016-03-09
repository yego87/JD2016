package by.it.knyazev.Less_12.A2;

import by.it.chetovich.JD01_12.PrintingList;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by Mac on 08.03.16.
 */
public class Main {
    public static void main(String[] args) {
        Set<Integer> setA = randomSet();
        Set<Integer> setB = randomSet();

        PrintList(setA,"Set A: ");
        PrintList(setB,"Set B: ");
        PrintList(getUnion(setA,setB),"Union A B: ");
        PrintList(getCross(setA,setB),"Union A B: ");
    }

    public static Set<Integer> randomSet (){
        Set<Integer> set = new HashSet<>();
        Random rand = new Random();
        for (int i = 0; i < 15; i++) {
            set.add(rand.nextInt(50));
        }
        return set;
    }

    public static void PrintList(Collection<?> list, String text){
        System.out.print(text + " ");
        for (Object s:list) {
            System.out.print(s+" ");
        }
        System.out.println();
    }
    public static Set<Integer> getUnion(Set<Integer> A, Set<Integer> B){
        Set<Integer> set = new HashSet<> (A);
        set.addAll(B);
        return set;
    }
    public static Set<Integer> getCross (Set<Integer> A, Set<Integer> B){
        Set<Integer> set = new HashSet<>();
        for (int s:A) {
            if (B.contains(s)) {
                set.add(s);
            }
        }
        return set;
    }
}
