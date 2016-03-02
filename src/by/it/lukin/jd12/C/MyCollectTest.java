package by.it.lukin.jd12.C;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MyCollectTest {
    public static void main(String[] args){
        HashSet<Integer> a = new HashSet<Integer>(Arrays.asList(2,4,7,3,9,66,21));
        HashSet<Integer> b = new HashSet<Integer>(Arrays.asList(1,5,7,3,8,13,43,66));

        Set<Integer> c = MyCollect.getCross(a,b);
        System.out.println("Пересечение множеств:" + c);

        c = MyCollect.getUnion(a,b);
        System.out.println("Объединение множеств:" + c);
    }
}
