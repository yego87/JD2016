package by.it.predkel.JD12Collections;

import java.util.ArrayList;

/**
 * Created by user_2 on 26.02.2016.
 */
public class StudentsMarks {
    public static void mark(){
        ArrayList<Integer> listMark=new ArrayList<>() ;
        for (int i =0;i<25;i++){
            listMark.add((int)(Math.random() * 10));
        }
        System.out.println(listMark);
        for (int i =0;i<listMark.size();i++){
            if (listMark.get(i)<=4){
                listMark.remove(i);
                i--;
            }
        }
        System.out.print(listMark);
    }
}
