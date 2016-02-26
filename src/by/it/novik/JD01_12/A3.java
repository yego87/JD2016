package by.it.novik.JD01_12;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A3 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int val = 0;
            while (val == 0) {
                val = (int) (Math.random() * 15) - 5;
            }
            A.add(val);
            System.out.print(A.get(i) + "\t");
        }
            Collections.sort(A);
            Collections.reverse(A);

        System.out.println();
        for (int i = 0; i < 20; i++) {
            System.out.print(A.get(i) + "\t");
        }
    }
}
