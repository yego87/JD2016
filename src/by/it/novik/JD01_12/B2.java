package by.it.novik.JD01_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class B2 {
    public static void main(String[] args) {
        Integer[] arr = { 6, 2, 3, 4, 5, 6, 7 };

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.addAll(Arrays.asList(arr));

        System.out.println(removeOdds(list));
    }

    public static ArrayList<Integer> removeOdds(ArrayList<Integer> arr) {
        while (arr.size() > 1) {
            for (int i = 1;i < arr.size(); i = i + 2) {
                arr.remove(i);
            }
        }

        return arr;
    }
}
