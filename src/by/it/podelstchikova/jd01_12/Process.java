package by.it.podelstchikova.jd01_12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Process {

    public static long processL(LinkedList<Integer> l){

        List<Integer> list = new LinkedList<>(l);
        long start = System.currentTimeMillis();
        while (list.size()>1){
            for (int i = 0; i < list.size()-1; i++) {
                list.remove(i+1);
            }
        }
        long end = System.currentTimeMillis();
        return end-start;
    }

    public static long processA(ArrayList<Integer> l){

        List<Integer> list = new ArrayList<>(l);
        long start = System.currentTimeMillis();
        while (list.size()>1){
            for (int i = 0; i < list.size()-1; i++) {
                list.remove(i+1);
            }
        }
        long end = System.currentTimeMillis();
        return end-start;
    }


    public static long processArrayIterator (List <Integer> list){

        long start = System.currentTimeMillis();

        while (list.size()>1){

            for (Iterator<Integer> it = list.iterator(); it.hasNext();) {

                it.next();
                if (it.hasNext()){it.next();
                it.remove();}

            }
        }
        long end = System.currentTimeMillis();
        return end-start;
    }

    public static long processLinkedIterator (List <Integer> list){

        long start = System.currentTimeMillis();

        while (list.size()>1) {

            for (Iterator<Integer> it = list.iterator(); it.hasNext(); ) {

                it.next();
                if (it.hasNext()) {
                    it.next();
                    it.remove();
                }
            }
        }

        long end = System.currentTimeMillis();
        return end-start;
    }
}
