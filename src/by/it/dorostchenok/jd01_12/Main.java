package by.it.dorostchenok.jd01_12;

import by.it.dorostchenok.jd01_12.variant_a.MyCollect;
import by.it.dorostchenok.jd01_12.variant_a.VariantA1;
import by.it.dorostchenok.jd01_12.variant_a.VariantA3;
import by.it.dorostchenok.jd01_12.variant_b.VariantB1;
import by.it.dorostchenok.jd01_12.variant_b.VariantB2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        VariantA1 variantA1 = new VariantA1(20);
        List<Integer> marks = variantA1.getMarks();
        //variantA1.printList(marks);
        //System.out.println("#######################");
        //variantA1.printList(variantA1.deleteBadMarks(6, marks));

        List<String> list1 = new ArrayList<>(Arrays.asList("a", "b", "c", "f", "g"));
        List<String> list2 = new ArrayList<>(Arrays.asList("b", "c", "d", "e"));
        List cross = MyCollect.getCross(list1, list2);
        System.out.println("Cross" + Arrays.toString(cross.toArray()));
        list1 = new ArrayList<>(Arrays.asList("a", "b", "c", "f", "g"));
        list2 = new ArrayList<>(Arrays.asList("b", "c", "d", "e"));
        List union = MyCollect.getUnion(list1, list2);
        System.out.println("Union" + Arrays.toString(union.toArray()));

        VariantA3 variantA3 = new VariantA3();
        List<Integer> list = variantA3.generateList(10);
        //variantA1.printList(list);
        System.out.println("#######################");
        Collections.sort(list);
        Collections.reverse(list);
        //variantA1.printList(list);

        VariantB1 variantB1 = new VariantB1();
        //variantB1.printWordCount();
        //variantB1.printUniqueWords();

        VariantB2 variantB2 = new VariantB2();
        List<Integer> arrayList = variantB2.genArrayList(100000, true);
        List<Integer> l = variantB2.processList(arrayList);
        System.out.println(Arrays.toString(l.toArray()));
        System.out.println(l.getClass().getSimpleName());



    }
}
