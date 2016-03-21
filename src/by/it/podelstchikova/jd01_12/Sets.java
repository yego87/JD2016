package by.it.podelstchikova.jd01_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;


public class Sets {
    public static Set CreateSet() throws IOException {
        Set<Integer> setA = new HashSet<Integer>();


        int a = 0;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        for (int i = 0; i < 5; i++) {
            a = Integer.parseInt(bufferedReader.readLine());
            setA.add(a);

        }
        bufferedReader.close();
        return setA;
    }
     public Set getUnion(Set setA,Set setB) {
         Set<Integer> setResultUnion = new HashSet<Integer>();
         setResultUnion.addAll(setA);
         setResultUnion.addAll(setB);
        return setResultUnion;
     }
    public Set getCross(Set setA, Set setB){
        Set<Integer> setResultIntersect = new HashSet<Integer>();
        setResultIntersect.addAll(setA);
        setResultIntersect.retainAll(setB);
        return  setResultIntersect;



    }
}
