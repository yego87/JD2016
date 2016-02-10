package by.it.novik.JD01_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class A1_main {
    public static void main(String[] args) throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String rLine = bufferedReader.readLine();
        //String rLine ="54 56 789";
                bufferedReader.close();
        String maxString="";
        String minString = "";
        String[] val = rLine.split(" ");
        maxString= A1.maxString(val);
        minString = A1.minString(val);
        System.out.println("The longest is "+maxString +"." );
        System.out.println("Its length: "+maxString.length()+".");
        System.out.println("The shortest is " + minString+".");
        System.out.println("Its length: " + minString.length()+".");



//        int[] v = new int[val.length];
//        for (int i = 0; i < val.length; i++) {
//
//
//            v[i] = Integer.parseInt(val[i]);
//            System.out.println(v[i]);
//        }

    }
}