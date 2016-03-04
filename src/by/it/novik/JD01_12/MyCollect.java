package by.it.novik.JD01_12;


import java.util.ArrayList;
import java.util.List;

public class MyCollect {

    public static ArrayList<Integer> getCross(List<Integer> A, List<Integer> B) {

        ArrayList<Integer> list=new ArrayList<>();



            for(int k = 0; k < A.size();k++) {

                int vA=A.get(k);

                    if (B.contains(vA)) {
                    list.add(vA);
                    }
            }
        System.out.println(list);
        return list;
    }

    public static ArrayList<Integer> getUnion(List<Integer> A, List<Integer> B) {

        ArrayList<Integer> wholeList = new ArrayList<>();
        wholeList.addAll(A);
        wholeList.addAll(B);

        System.out.println(wholeList);
        return wholeList;
    }
}

