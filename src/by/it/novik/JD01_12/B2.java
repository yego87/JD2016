package by.it.novik.JD01_12;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class B2 {
    public static void main(String[] args) {

        Time t = new Time();

        Integer[] arr = {6, 2, 3, 4, 5, 6, 7};

        //list.addAll(Arrays.asList(arr));

        System.out.println("Operation with ArrayList. " + (processArray(arr)) + ". Time passed: " + t);
        System.out.println("Operation with LinkedList. " + (prоcessLinked(arr)) + ". Time passed: " + t);
    }

    public static ArrayList<Integer> processArray(Integer[] arr) {


        List<Integer> instance = Arrays.asList(arr);

        ArrayList<Integer> arrayList = new ArrayList<Integer>(instance);


        while (arrayList.size() > 1) {
            for (int i = 1; i < arrayList.size(); i = i + 2) {
                arrayList.remove(i);
            }
        }

        return arrayList;
    }

    public static LinkedList<Integer> prоcessLinked(Integer[] arr) {

        List<Integer> instance = Arrays.asList(arr);

        LinkedList<Integer> linkedList = new LinkedList<Integer>(instance);

        while (linkedList.size() > 1) {
            for (int i = 1; i < linkedList.size(); i = i + 2) {
                linkedList.remove(i);
            }
        }
        return linkedList;
    }

    public static class Time {
        private long iniTime;
        private Double Delta;

        public Time() {
            iniTime = System.nanoTime();
        }

        public String toString() {
            Delta = (double) (System.nanoTime() - iniTime) / 1000;
            iniTime = System.nanoTime();
            return Delta.toString() + " microseconds";
        }
    }
}
