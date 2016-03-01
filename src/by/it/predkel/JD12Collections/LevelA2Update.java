package by.it.predkel.JD12Collections;

import java.util.ArrayList;

/**
 * Created by Admin on 01.03.2016.
 */
public class LevelA2Update {
    static ArrayList<Object> A = new ArrayList<>();
    static ArrayList<Object> B = new ArrayList<>();
    static ArrayList<Object> C = new ArrayList<>();

    public static void input() {
        /*for (int i = 0; i < 10; i++) {
            A.add((Math.random() * 10));
        }
        for (int i = 0; i < 10; i++) {
            B.add( (Math.random() * 10));
        }*/
        A.add("String1");
        A.add("String2");
        A.add("String3");
        A.add("String4");
        B.add("String4");
        B.add("String2");
        B.add("String5");
        B.add("String6");
        System.out.println(A);
        System.out.println(B);
    }

    public static void getCross() {
        flag1:
        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < B.size(); j++) {
                if (A.get(i).equals(B.get(j))) {
                    C.add(A.get(i));
                    continue flag1;
                }
            }
        }
        System.out.println(C);
    }

    public static void getUnion() {
        if (A.get(0) instanceof Number)
        A.addAll(B);
        else {
            for (int i=0;i<B.size();i++){
                boolean checker=true;
                for (int j=0;j<A.size();j++){
                    if (B.get(i).equals(A.get(j)))
                        checker=false;
                }
                if (checker)
                    A.add(B.get(i));
            }
        }
        System.out.println(A);
    }
}

