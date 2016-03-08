package by.it.knyazev.Less_12.A1;

import java.util.Collection;
import java.util.List;

/**
 * Created by Mac on 08.03.16.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> rating = RandomList.ArrayList(10);
        List<Integer> goodrating = RandomList.GoodList(rating);
        PrintList(rating,"Rating");
        PrintList(goodrating,"Good Rating");
    }
    public static void PrintList(Collection<?> list,String text){
        System.out.print(text + " ");
        for (Object s:list) {
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
