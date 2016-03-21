package by.it.podelstchikova.jd01_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;


public class ArrayLists<I> {
   public static void CreateList() throws IOException {

       ArrayList<Integer>  mList= new ArrayList<Integer>();
       ArrayList<String> nList = new ArrayList<String>();
       InputStreamReader inputStreamReader = new InputStreamReader(System.in);
       BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
       String rLine = bufferedReader.readLine();
       bufferedReader.close();
       String[] sName = rLine.split(" ");
       for (int i = 0; i < sName.length; i++) {
           nList.add(sName[i]);
           mList.add((int) (Math.random()*10+1));

       }
       System.out.println(nList+":"+mList);
       int i=0;
       Iterator<Integer> iterator = mList.iterator();
       Iterator<String> iteratorS = nList.iterator();
       while (iterator.hasNext() && iteratorS.hasNext()) {
           iteratorS.next();
           if (iterator.next()<4 ) {
           iterator.remove();
           iteratorS.remove();

            }
       }

        System.out.println(nList+" : "+ mList);



   }
}
