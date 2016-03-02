package by.it.chetovich.JD01_12;

import java.util.*;

/**
 * Deleting for ArrayList and LinkedList using either indexes or iterator
 */
public class ProcessArrayOrLinked {
    /**
     * delete operation for LinkedList using indexes
     * @param l list to modify
     * @return processing time in ms
     */
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

    /**
     * delete operation for ArrayList using indexes
     * @param l list to modify
     * @return processing time in ms
     */
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


    /**
     * delete operation for ArrayList using iterator
     * @param list list to modify
     * @return processing time in ms
     */
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

    /**
     * delete operation for LinkedList using iterator
     * @param list list to modify
     * @return processing time in ms
     */
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
