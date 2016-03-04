package by.it.lukin.jd12.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingCollection {
    public static void main(String[] args){
        List<Integer> collection = new ArrayList<Integer>(Arrays.asList(-5,23,45,-3,12,-76,0));
        Collections.sort(collection);
        Collections.reverse(collection);

        System.out.println(collection);
    }
}
