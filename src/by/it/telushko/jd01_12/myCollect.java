package by.it.telushko.jd01_12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public  class myCollect {

    public static ArrayList<Integer> randomFill(ArrayList<Integer> myList, int myListSize){

        for (int i = 0; i <myListSize ; i++) {
            int element=(int)(Math.random()*(-20)+10);
            myList.add(element);
        }
        return myList;
    }

    public static List<Integer> randomFill(List<Integer> myList, int myListSize, int start, int end){

        for (int i = 0; i <myListSize ; i++) {
            int element=(int)(Math.random()*(end-start)+start);
            myList.add(element);
        }
        return myList;
    }

    public static ArrayList<Integer> getUnion (ArrayList<Integer> A,ArrayList<Integer> B){
        ArrayList<Integer> union =new ArrayList<Integer>();
        union.addAll(0,A);
        union.addAll(A.size(),B);
        return union;
    }

    public static ArrayList<Integer> getCross (ArrayList<Integer> A,ArrayList<Integer> B){
        ArrayList<Integer> cross =new ArrayList<Integer>();
        int i=0;
        while (i<A.size()){
            int j=0;
            while(j<B.size()){
                if (A.get(i)==B.get(j)){
                    cross.add(A.get(i));
                }
                j++;
            }
            i++;
        }
        return cross;
    }

    public static List<Integer> sort (LinkedList<Integer> myLList){
        int i=0;
        while(i<myLList.size()){
            if (myLList.get(i)<0){
                myLList.addFirst(myLList.get(i));
                myLList.remove(i+1);
            }
            else i++;
        }
        return myLList;
    }

    public static void processArray (ArrayList<Integer> round){
        int j=0;
        while (round.size()>0){
            j+=3;
            if (j>=round.size())j=0;
            round.remove(j);
        }
    }

    public static void processLinked (LinkedList<Integer> round){
        int j=0;
        while (round.size()>0){
            j+=3;
            if (j>=round.size())j=0;
            round.remove(j);
        }
    }
}
