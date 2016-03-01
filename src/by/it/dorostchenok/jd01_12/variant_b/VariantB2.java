package by.it.dorostchenok.jd01_12.variant_b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class VariantB2 {

    public List<Integer> genArrayList(int size, boolean linkedList){
        List<Integer> list;
        if (linkedList){
            list = new LinkedList<>();
        } else {
            list = new ArrayList<>();
        }
        for (int j = 1; j < size; j++){
            list.add(j);
        }

        return list;
    }

    public List<Integer> processList(List<Integer> list){

        for (int j = 0; j < list.size(); j++){
            if (j % 2 == 0){
                list.remove(j);
            }
        }
        if (list.size() != 1){
            processList(list);
        }
        return list;
    }

}
