package by.it.predkel.JD12Collections;

import java.util.ArrayList;

/**
 * Created by user_2 on 26.02.2016.
 */
public class MyCollection {
    static ArrayList<Integer> A=new ArrayList<>();
    static ArrayList<Integer> B=new ArrayList<>();
    static ArrayList<Integer> C=new ArrayList<>();
    public static void input(){
        for (int i =0;i<10;i++){
            A.add((int)(Math.random() * 10));
        }
        for (int i =0;i<10;i++){
            B.add((int)(Math.random() * 10));
        }
        System.out.println(A);
        System.out.println(B);
    }

    public static void getCross(){
  flag1:  for (int i=0;i<A.size();i++){
        for (int j=0;j<B.size();j++){
                if(A.get(i)==B.get(j)) {
                    C.add(A.get(i));
                    continue flag1;
                }
        }
    }
        System.out.println(C);
    }
    public static void getUnion() {
        A.addAll(B);
        System.out.println(A);
    }
}
