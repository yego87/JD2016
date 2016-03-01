package by.it.dorostchenok.jd01_12.variant_a.tasks;

import java.util.*;

public class VariantA1 {

    private ArrayList<Integer> marks = new ArrayList<>();
    private Random random = new Random();
    private int max = 10;
    private int min = 2;

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    public VariantA1(int numberOfMarks){
        if (numberOfMarks > 0){
            for (int j = 0; j < numberOfMarks; j++){
                marks.add(random.nextInt((max - min) + 1) + min);
            }
        }
    }

    public List<Integer> deleteBadMarks(int badMarkMin, List<Integer> list){
        List<Integer> newMarks = list;
        Iterator<Integer> it = newMarks.iterator();
        while (it.hasNext()){
            if (it.next() <= badMarkMin){
                it.remove();
            }
        }

        return newMarks;
    }

    public void printList(List<Integer> list){
        System.out.println(Arrays.toString(list.toArray()));

    }
}
