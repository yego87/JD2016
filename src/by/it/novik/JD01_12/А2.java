package by.it.novik.JD01_12;


import java.util.ArrayList;
import java.util.List;

public class А2 {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            A.add(1 + (int) (Math.random() * 5));
            System.out.print(A.get(i) + "\t");
        }

        System.out.println();
        for (int k = 0; k < 5; k++) {
            B.add(1 + (int) (Math.random() * 5));
            System.out.print(B.get(k) + "\t");
        }
        System.out.println();
        MyCollect.getCross(A,B);

        MyCollect.getUnion(A,B);
    }
}



