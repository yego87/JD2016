package by.it.predkel.JD12Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by user_2 on 26.02.2016.
 */
public class LikeASort {
    public static void miniSort(){
        ArrayList<Integer> A=new ArrayList<>();
        for (int i =0;i<10;i++){
            A.add((int)(Math.random() * 10 - 5));
        }
        System.out.println(A);
        Collections.sort(A, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(A);
    }
}
