package by.it.lukin.jd12.A;

import java.util.ArrayList;
import java.util.Iterator;

public class ListStudents {
    public static void main(String[] args){
        ArrayList<Integer> mark = new ArrayList<Integer>();

            for (int i = 0; i < 15;i++) {
                mark.add((int) (Math.random() * 5+1));
            }

        System.out.println(mark);

        Iterator<Integer> iterator = mark.iterator();

        while (iterator.hasNext())
            if (iterator.next() < 3){
               iterator.remove();
            }

        System.out.println(mark);
    }
}
