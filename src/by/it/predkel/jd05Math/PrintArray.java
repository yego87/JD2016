package by.it.predkel.jd05Math;

/**
 * Created by Admin on 10.02.2016.
 */
public class PrintArray {
    public static void printArray(double[] m, String name){
        for (int i=0; i<m.length; i++){
            System.out.printf("%2s[%2d]=%-6.1f",name,i,m[i]);
        }
        System.out.println();
    }
    public static void printArray(double[] m, String name,int len){
        for (int i=0; i<len; i++){
            System.out.printf("%2s[%2d]=%-6.1f",name,i,m[i]);
        }
        System.out.println();
    }
}
